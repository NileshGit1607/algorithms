package com.equalexpert.shopping.cart;

import com.equalexpert.shopping.exception.CouponDoesNotExistException;
import com.equalexpert.shopping.exception.ItemDoesNotExistException;
import com.equalexpert.shopping.exception.PaymentFailureException;
import com.equalexpert.shopping.model.Discount;
import com.equalexpert.shopping.model.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cartItems;
    private String couponApplied;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Item item) throws ItemDoesNotExistException {

    }

    public void delete(String id) {

    }

    public void checkout() throws PaymentFailureException {
    }

    private void _checkout(Discount discount) throws PaymentFailureException {

    }

    public BigDecimal totalAmount() {
        return null;
    }

    public BigDecimal applyCoupon(String code) throws CouponDoesNotExistException {
        return null;
    }
}
