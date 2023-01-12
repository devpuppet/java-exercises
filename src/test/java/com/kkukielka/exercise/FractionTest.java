package com.kkukielka.exercise;

import com.kkukielka.exercise.model.FractionTestData;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FractionTest {

    @Test(dataProvider = "invalidFractionsTestData", dataProviderClass = FractionExerciseDataProvider.class)
    public void createFractionWithIntegerOverflowShouldThrowException(FractionTestData testData) {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
            new Fraction(testData.getNumerator(), testData.getDenominator()));

        assertThat("Exception message should be equal to expected", exception.getMessage(),
                equalTo(testData.getExpectedExceptionMessage()));
    }

}