package ru.shendo.homework05.medium.exercise02;

import java.util.List;

public class ProductUtil {

    public static double getCostOfAllProducts(List<IProduct> products) {
        return products.stream()
                .map(product -> product.getPrice() * product.getQuantity())
                .mapToDouble(Double::doubleValue)
                .sum();
    }

}