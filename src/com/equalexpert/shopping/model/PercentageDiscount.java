package com.equalexpert.shopping.model;

import java.math.BigDecimal;

public class PercentageDiscount extends Discount {

    private int percentage;

    public PercentageDiscount(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public BigDecimal calculateDiscount(BigDecimal totalAmount) {
        BigDecimal factor = totalAmount.multiply(BigDecimal.valueOf(percentage)).divide(BigDecimal.valueOf(100));
        return totalAmount.subtract(factor);
    }
}
