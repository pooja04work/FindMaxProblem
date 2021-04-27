package com.bridgelabz;

import java.util.Arrays;

public class CheckMax<T extends Comparable<T>> {
    T value1, value2, value3;

    public CheckMax(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    public CheckMax() {
    }
    //@method internally call the static method
    public  T maximum() {
        return CheckMax.findMaximum(value1, value2, value3);
    }
    /**
     * @param value1 first number
     * @param value2 second number
     * @param value3 third number
     * @param <T>    type (integer or float or string)
     * @return the maximim value
     * @method findmaximum
     */
    public static <T extends Comparable<T>> T findMaximum(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        printMax(max);
        return max;
    }
    //@method entends previous findMaximum and allow more the 3 inputs
    public static <T extends Object & Comparable<T>> T findMaximum(T ... elements) {
        Arrays.sort(elements);
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        printMax(max);
        return max;
    }

    //@method is to print the value
    private static <T> void printMax(T max) {
        System.out.printf("Max value is:" + max + "\n");
    }
}