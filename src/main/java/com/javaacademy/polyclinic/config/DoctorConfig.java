package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.Doctor;
import com.javaacademy.polyclinic.Specialization;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

import static com.javaacademy.polyclinic.Specialization.DENTIST;
import static com.javaacademy.polyclinic.Specialization.SURGEON;
import static com.javaacademy.polyclinic.Specialization.THERAPIST;

@Configuration
public class DoctorConfig {

    @Bean("dentist")
    public Doctor getDentist(@Value("${admissions.costs[0]}") String cost) {
        return generateDoctor(DENTIST, cost);
    }

    @Bean("therapist")
    public Doctor getTherapist(@Value("${admissions.costs[1]}") String cost) {
        return generateDoctor(THERAPIST, cost);
    }

    @Bean("juniorSurgeon")
    public Doctor getJuniorSurgeon(@Value("${admissions.costs[2]}") String cost) {
        return generateDoctor(SURGEON, cost);
    }

    @Bean("seniorSurgeon")
    public Doctor getSeniorSurgeon(@Value("${admissions.costs[3]}") String cost) {
        return generateDoctor(SURGEON, cost);
    }

    private Doctor generateDoctor(Specialization specialization, String costAdmission) {
        return new Doctor(specialization, BigDecimal.valueOf(Long.parseLong(costAdmission)));
    }
}
