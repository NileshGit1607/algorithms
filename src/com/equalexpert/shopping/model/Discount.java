package com.equalexpert.shopping.model;

import java.math.BigDecimal;

public abstract class Discount {
    public abstract BigDecimal calculateDiscount(BigDecimal totalAmount);
}
