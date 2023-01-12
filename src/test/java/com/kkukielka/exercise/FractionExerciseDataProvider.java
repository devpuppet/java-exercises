package com.kkukielka.exercise;

import com.kkukielka.exercise.model.FractionExerciseTestData;
import com.kkukielka.exercise.model.FractionTestData;
import com.kkukielka.exercise.model.SafeAddTestData;
import org.testng.annotations.DataProvider;

public class FractionExerciseDataProvider {

    @DataProvider
    public static Object[][] validFractionsExerciseTestData() {
        return new Object[][] {
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(0, 1))
                                .fraction2(new Fraction(1, 1))
                                .expectedFraction(new Fraction(1, 1))
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(1, 2))
                                .fraction2(new Fraction(2, 3))
                                .expectedFraction(new Fraction(7, 6))
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(2, 5))
                                .fraction2(new Fraction(-1, 2))
                                .expectedFraction(new Fraction(-1, 10))
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(Integer.MAX_VALUE, 2))
                                .fraction2(new Fraction(Integer.MIN_VALUE, 2))
                                .expectedFraction(new Fraction(-1, 2))
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(Integer.MAX_VALUE, 2))
                                .fraction2(new Fraction(0, 2))
                                .expectedFraction(new Fraction(Integer.MAX_VALUE, 2))
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(Integer.MIN_VALUE, 2))
                                .fraction2(new Fraction(0, 2))
                                .expectedFraction(new Fraction(Integer.MIN_VALUE, 2))
                                .build()
                }
        };
    }

    @DataProvider
    public static Object[][] invalidFractionsExerciseTestData() {
        return new Object[][] {
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(Integer.MAX_VALUE, 2))
                                .fraction2(new Fraction(1, 2))
                                .expectedExceptionType(ArithmeticException.class)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(Integer.MIN_VALUE, 2))
                                .fraction2(new Fraction(-1, 2))
                                .expectedExceptionType(ArithmeticException.class)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(1, (Integer.MAX_VALUE / 2) + 1 ))
                                .fraction2(new Fraction(1, 2))
                                .expectedExceptionType(ArithmeticException.class)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                },
                {
                        FractionExerciseTestData.builder()
                                .fraction1(new Fraction(1, (Integer.MIN_VALUE / 2) - 1 ))
                                .fraction2(new Fraction(1, 2))
                                .expectedExceptionType(ArithmeticException.class)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                }
        };
    }

    @DataProvider
    public static Object[][] safeAddExceptionTestData() {
        return new Object[][] {
                {
                        SafeAddTestData.builder()
                                .value1(Integer.MAX_VALUE)
                                .value2(1)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                },
                {
                        SafeAddTestData.builder()
                                .value1(1)
                                .value2(Integer.MAX_VALUE)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                },
                {
                        SafeAddTestData.builder()
                                .value1(Integer.MIN_VALUE)
                                .value2(-1)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                },
                {
                        SafeAddTestData.builder()
                                .value1(-1)
                                .value2(Integer.MIN_VALUE)
                                .expectedExceptionMessage("integer overflow")
                                .build()
                }
        };
    }

    @DataProvider
    public static Object[][] validSafeAddTestData() {
        return new Object[][] {
                {
                        SafeAddTestData.builder()
                                .value1(Integer.MAX_VALUE - 1)
                                .value2(1)
                                .expectedResult(Integer.MAX_VALUE)
                                .build()
                },
                {
                        SafeAddTestData.builder()
                                .value1(1)
                                .value2(Integer.MAX_VALUE - 1)
                                .expectedResult(Integer.MAX_VALUE)
                                .build()
                },
                {
                        SafeAddTestData.builder()
                                .value1(Integer.MIN_VALUE + 1)
                                .value2(-1)
                                .expectedResult(Integer.MIN_VALUE)
                                .build()
                },
                {
                        SafeAddTestData.builder()
                                .value1(-1)
                                .value2(Integer.MIN_VALUE + 1)
                                .expectedResult(Integer.MIN_VALUE)
                                .build()
                }
        };
    }

    @DataProvider
    public static Object[][] invalidFractionsTestData() {
        return new Object[][] {
                {
                        FractionTestData.builder()
                                .numerator(0)
                                .denominator(0)
                                .expectedExceptionMessage("Denominator can't be equal to 0")
                                .build()
                },
                {
                        FractionTestData.builder()
                                .numerator(null)
                                .denominator(2)
                                .expectedExceptionMessage("Numerator can't be null")
                                .build()
                },
                {
                        FractionTestData.builder()
                                .numerator(1)
                                .denominator(null)
                                .expectedExceptionMessage("Denominator can't be null")
                                .build()
                }
        };
    }

}
