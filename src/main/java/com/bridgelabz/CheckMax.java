package com.bridgelabz;

public class CheckMax<T extends Comparable<T>> {
    T value1, value2, value3;

    public CheckMax(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    public CheckMax() {

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
        return max;
    }

    public T testMaximum(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        printMax(value1, value2, value3, max);
        return max;
    }
    //@method is to print the value
    private void printMax(T value1, T value2, T value3, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n",value1, value2, value3, max);
    }

    public static <T> void main(String args[]) {
        Integer value1Int = 3, value2Int = 4, value3Int = 5;
        Float value1Fl = 6.6f, value2Fl = 8.8f, value3Fl = 7.7f;
        String value1Str = "pear", value2Str = "apple", value3Str = "orange";
        CheckMax checkMax = new CheckMax();
        checkMax.testMaximum(value1Int, value2Int, value3Int);
        checkMax.testMaximum(value1Fl, value2Fl, value3Fl);
        checkMax.testMaximum(value1Str, value2Str, value3Str);
    }
}