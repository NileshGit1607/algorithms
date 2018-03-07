package com.equalexpert.shopping.model;

public class Coupon {

    private String code;
    private Discount discount;

    public Coupon(String code, Discount discount) {
        this.code = code;
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
