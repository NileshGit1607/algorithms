package com.equalexpert.shopping.exception;

public class ItemDoesNotExistException extends Exception {
    public ItemDoesNotExistException() {
        super("Item does not exist in out inventory");
    }
}
