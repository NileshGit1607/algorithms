package com.equalexpert.shopping.model;

import java.math.BigDecimal;

public class CashDiscount extends Discount {

    private BigDecimal cashAmount;

    public CashDiscount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    @Override
    public BigDecimal calculateDiscount(BigDecimal totalAmount) {
        return cashAmount;
    }
}
