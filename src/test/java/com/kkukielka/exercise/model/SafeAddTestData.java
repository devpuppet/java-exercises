package com.kkukielka.exercise.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SafeAddTestData {
    private int value1;
    private int value2;
    private int expectedResult;
    private String expectedExceptionMessage;
}
