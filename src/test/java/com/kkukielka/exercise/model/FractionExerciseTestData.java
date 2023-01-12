package com.kkukielka.exercise.model;

import com.kkukielka.exercise.Fraction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FractionExerciseTestData {
    private Fraction fraction1;
    private Fraction fraction2;
    private Fraction expectedFraction;
    private Class expectedExceptionType;
    private String expectedExceptionMessage;
}
