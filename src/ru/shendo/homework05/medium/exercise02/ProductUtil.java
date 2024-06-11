package ru.shendo.homework05.medium.exercise02;

import java.math.BigDecimal;
import java.util.List;

public final class ProductUtil {

    private ProductUtil() {
    }

    public static BigDecimal getCostOfAllProducts(List<IProduct> products) {
        return products.stream()
                .map(product -> product.getPrice().multiply(new BigDecimal(product.getQuantity())))
                .reduce(new BigDecimal(0), (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2));
    }

}
