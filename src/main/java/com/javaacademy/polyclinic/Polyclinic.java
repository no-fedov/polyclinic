package com.javaacademy.polyclinic;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class Polyclinic {
    private final CashRegister cashRegister;
    private final Doctor dentist;
    private final Doctor therapist;
    private final Doctor juniorSurgeon;
    private final Doctor seniorSurgeon;

    public void treatByDentist() {
        treatByDoctor(dentist);
    }

    public void treatByTherapist() {
        treatByDoctor(therapist);
    }

    public void treatByJuniorSurgeon() {
        treatByDoctor(juniorSurgeon);
    }

    public void treatBySeniorSurgeon() {
        treatByDoctor(seniorSurgeon);
    }

    private void treatByDoctor(Doctor doctor) {
        BigDecimal costAdmission = doctor.heal();
        cashRegister.acceptPayment(costAdmission);
    }
}
