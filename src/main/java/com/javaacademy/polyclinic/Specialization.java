package com.javaacademy.polyclinic;

import lombok.Getter;

@Getter
public enum Specialization {
    DENTIST("Дантист"),
    SURGEON("Хирург"),
    THERAPIST("Терапевт");

    private final String description;

    Specialization(String description) {
        this.description = description;
    }
}
