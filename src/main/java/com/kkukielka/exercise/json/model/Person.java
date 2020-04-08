package com.kkukielka.exercise.json.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;
    private Address address;
    private List<String> responsibilities;
    private Person spouse;
}
