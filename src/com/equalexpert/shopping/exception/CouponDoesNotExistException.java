package com.equalexpert.shopping.exception;

public class CouponDoesNotExistException extends Exception {
    public CouponDoesNotExistException() {
        super("Coupon does not exist");
    }
}
