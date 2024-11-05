package com.javaacademy.polyclinic;

import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
@Getter
public class CashRegister {
    private BigDecimal profit = BigDecimal.ZERO;

    public void acceptPayment(@NonNull BigDecimal money) {
        profit = profit.add(money);
    }

    public void printIncome() {
        log.info("Доход составляет: {}", profit);
    }
}
