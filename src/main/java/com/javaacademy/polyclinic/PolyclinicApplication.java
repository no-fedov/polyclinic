package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class PolyclinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Polyclinic polyclinic = context.getBean(Polyclinic.class);
        polyclinic.treatByDentist();
        polyclinic.treatByTherapist();
        polyclinic.treatByJuniorSurgeon();
        polyclinic.treatBySeniorSurgeon();
        CashRegister cashRegister = context.getBean(CashRegister.class);
        log.info("Денег в кассе: {}", cashRegister.getProfit());
    }
}
