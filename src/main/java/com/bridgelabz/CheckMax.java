package com.bridgelabz;

public class CheckMax {
    public Integer integerMax(Integer number1, Integer number2, Integer number3) {
        Integer max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }if (number3.compareTo(max) > 0) {
            max = number3;
        }
        return max;
    }

    public Float floatMax(Float number1, Float number2, Float number3) {
        Float max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }if (number3.compareTo(max) > 0) {
            max = number3;
        }
        return max;
    }


}
