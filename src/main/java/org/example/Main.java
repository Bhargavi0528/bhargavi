package org.example;

public class Main {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int sub(int number1, int number2) {
        return number1 - number2;
    }

    public static int mul(int number1, int number2) {
        return number1 * number2;
    }

    //    public int div(int number1,int number2) {
//        return number1 / number2;
//    }


//    public double div(double number1,double number2) {
//        if (number2 == 0) {
//            throw new IllegalArgumentException("Number cannot be divided by 0");
//        }
//        return number1 / number2;
    public static int div(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Not Divided by 0");
        }
        return number1/number2;
    }
}