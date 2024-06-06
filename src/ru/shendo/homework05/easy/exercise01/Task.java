package ru.shendo.homework05.easy.exercise01;

import java.util.stream.IntStream;

/*
Посчитать сумму четных чисел в промежутке от 1 до 200 включительно и вывести ее на экран.
 */

public class Task {
    public static void main(String[] args) {
        System.out.println(countEvenNumbersSum(1, 200));
    }

    public static int countEvenNumbersSum(int numberFrom, int numberTo) {
        return IntStream.rangeClosed(numberFrom, numberTo)
                .filter(number -> number % 2 == 0)
                .sum();
    }
}
