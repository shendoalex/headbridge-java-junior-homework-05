package ru.shendo.homework05.medium.exercise02;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/*
Создайте класс "Продукт" (Product) с полями: название, цена, количество.
Затем создайте список продуктов и используя стримы, найдите общую стоимость всех продуктов.
 */

public class Task {
    public static void main(String[] args) {

        List<IProduct> products = Arrays.asList(
                new Product("Product1", new BigDecimal(10), 3),
                new Product("Product2", new BigDecimal(20), 2),
                new Product("Product3", new BigDecimal(30), 5)
        );

        System.out.println(ProductUtil.getCostOfAllProducts(products));

    }

}
