package com.kkukielka.exercise.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FractionTestData {
    private Integer numerator;
    private Integer denominator;
    private String expectedExceptionMessage;
}
