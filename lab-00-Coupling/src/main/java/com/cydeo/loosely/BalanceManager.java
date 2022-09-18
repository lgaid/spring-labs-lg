package com.cydeo.loosely;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class BalanceManager {
    public boolean checkout(Balance balance, BigDecimal amount){
        return balance.getAmount().subtract(amount)
                .compareTo(BigDecimal.ZERO) > 0;
    }



}
