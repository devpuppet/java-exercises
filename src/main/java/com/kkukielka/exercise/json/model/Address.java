package com.kkukielka.exercise.json.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Address {
    private String streetName;
    private int homeNumber;
}
