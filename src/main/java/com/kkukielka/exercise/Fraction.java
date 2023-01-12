package com.kkukielka.exercise;

import lombok.Data;

@Data
public class Fraction {
    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        if (numerator == null) {
            throw new IllegalArgumentException("Numerator can't be null");
        }

        if (denominator == null) {
            throw new IllegalArgumentException("Denominator can't be null");
        }

        if (denominator.equals(0)) {
            throw new IllegalArgumentException("Denominator can't be equal to 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }
}
