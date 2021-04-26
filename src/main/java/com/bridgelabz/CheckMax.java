package com.bridgelabz;

public class CheckMax {
    /**
     * @method findmaximum
     * @param value1 first number
     * @param value2 second number
     * @param value3 third number
     * @param <T> type (integer or float or string)
     * @return the maximim value
     */
    public static <T extends Comparable<T>> T findMaximum(T value1, T value2, T value3){
        T max = value1;
        if (value2.compareTo(max) > 0){
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        return max;
    }
}