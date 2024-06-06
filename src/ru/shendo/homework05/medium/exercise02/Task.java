package ru.shendo.homework05.medium.exercise02;

import java.util.Arrays;
import java.util.List;

/*
Создайте класс "Продукт" (Product) с полями: название, цена, количество.
Затем создайте список продуктов и используя стримы, найдите общую стоимость всех продуктов.
 */

public class Task {
    public static void main(String[] args) {

        List<IProduct> products = Arrays.asList(
                new Product("Product1", 10.0, 3),
                new Product("Product2", 20.0, 2),
                new Product("Product3", 30.0, 5)
        );

        System.out.println(ProductUtil.getCostOfAllProducts(products));
    }

}
