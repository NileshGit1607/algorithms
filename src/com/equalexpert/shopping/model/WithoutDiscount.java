package com.equalexpert.shopping.model;

import java.math.BigDecimal;
import java.util.List;

public class WithoutDiscount extends Discount {
    @Override
    public BigDecimal calculateDiscount(List<Item> item) {
        return new BigDecimal(0);
    }
}
