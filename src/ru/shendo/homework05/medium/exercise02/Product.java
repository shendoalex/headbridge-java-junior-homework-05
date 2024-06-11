package ru.shendo.homework05.medium.exercise02;

import java.math.BigDecimal;

public class Product implements IProduct {
    private String name;
    private BigDecimal price;
    private int quantity;

    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
