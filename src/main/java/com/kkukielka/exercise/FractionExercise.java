package com.kkukielka.exercise;

public class FractionExercise {

    // Instead of safeAdd and safeMultiply, you can also use Java's Math.addExact and Math.multiplyExact as it throws
    // an exception if the operation results in an overflow or underflow
    public Fraction addFraction(Fraction fraction1, Fraction fraction2) {
        if (fraction1.getDenominator().equals(fraction2.getDenominator())) {
            return new Fraction(FractionExercise.safeAdd(fraction1.getNumerator(), fraction2.getNumerator()),
                    fraction1.getDenominator());
        } else {
            int commonDenominator =  FractionExercise.safeMultiply(fraction1.getDenominator(),
                    fraction2.getDenominator());
            int fraction1Numerator = FractionExercise.safeMultiply(fraction1.getNumerator(),
                    fraction2.getDenominator());
            int fraction2Numerator = FractionExercise.safeMultiply(fraction2.getNumerator(),
                    fraction1.getDenominator());
            return new Fraction(FractionExercise.safeAdd(fraction1Numerator, fraction2Numerator), commonDenominator);
        }
    }

    // when R > 0
    // ------|-------------|------|--|----|---------->
    //      MIN            0      R  L   MAX
    // if R + L > MAX -> Exception

    // when R <= 0
    // ------|----|---|------|------------|---------->
    //      MIN   L   R      0           MAX
    // if R + L < MIN -> Exception

    public static int safeAdd(int left, int right) {
        if (right > 0 ? left > Integer.MAX_VALUE - right : left < Integer.MIN_VALUE - right) {
            throw new ArithmeticException("integer overflow");
        }
        return left + right;
    }

    public static int safeMultiply(int value1, int value2) {
        long result = (long) value1 * (long) value2;

        if ((int) result != result) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) result;
    }

}
