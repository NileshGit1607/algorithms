package com.equalexpert.shopping.exception;

public class PaymentFailureException extends Exception {
    public PaymentFailureException() {
        super("Payment failed");
    }
}
