package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
public class Doctor {
    private Specialization specialization;
    private BigDecimal costAdmission;

    public BigDecimal heal() {
        log.info("{} вылечил человека", specialization.getDescription());
        return costAdmission;
    }
}
