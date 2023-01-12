package com.kkukielka.exercise;

import com.kkukielka.exercise.model.FractionExerciseTestData;
import com.kkukielka.exercise.model.SafeAddTestData;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FractionExerciseTest {

    @Test(dataProvider = "validFractionsExerciseTestData", dataProviderClass = FractionExerciseDataProvider.class)
    public void addValidFractionsShouldReturnExpectedFraction(FractionExerciseTestData testData) {
        FractionExercise fractionsExercise = new FractionExercise();
        Fraction result = fractionsExercise.addFraction(testData.getFraction1(), testData.getFraction2());
        assertThat("Result should be equal to expected", result, equalTo(testData.getExpectedFraction()));
    }

    @Test(dataProvider = "invalidFractionsExerciseTestData", dataProviderClass = FractionExerciseDataProvider.class)
    public void addFractionsShouldThrowOverflowException(FractionExerciseTestData testData) {
        FractionExercise fractionsExercise = new FractionExercise();
        Throwable exception = Assertions.assertThrows(testData.getExpectedExceptionType(), () ->
            fractionsExercise.addFraction(testData.getFraction1(), testData.getFraction2()));

        assertThat("Exception message should be equal to expected", exception.getMessage(),
                equalTo(testData.getExpectedExceptionMessage()));
    }

    @Test
    public void twoMaxIntsTest() {
        assertThat("Result should be equal to -2", Integer.MAX_VALUE + Integer.MAX_VALUE,
                equalTo(-2));
    }

    @Test
    public void twoMinIntsTest() {
        assertThat("Result should be equal to 0", Integer.MIN_VALUE + Integer.MIN_VALUE,
                equalTo(0));
    }

    @Test(dataProvider = "validSafeAddTestData", dataProviderClass = FractionExerciseDataProvider.class)
    public void safeAddShouldReturnExpectedValueTest(SafeAddTestData testData) {
        int result = FractionExercise.safeAdd(testData.getValue1(), testData.getValue2());

        assertThat("Result should be equal to expected", result, equalTo(testData.getExpectedResult()));
    }

    @Test(dataProvider = "safeAddExceptionTestData", dataProviderClass = FractionExerciseDataProvider.class)
    public void safeAddShouldThrowExceptionTest(SafeAddTestData testData) {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () ->
            FractionExercise.safeAdd(testData.getValue1(), testData.getValue2()));

        assertThat("Exception should contain expected message", exception.getMessage(),
                equalTo(testData.getExpectedExceptionMessage()));
    }

}