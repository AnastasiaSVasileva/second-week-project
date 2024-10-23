package ru.vasileva.calcapp.util;

public class Calculator {

    public static int calculate(String operationSymbol, int num1, int num2) {
        int result = 0;
        if (operationSymbol.contains("+")) {
            result = sum(num1, num2);
        } else if (operationSymbol.contains("-")) {
            result = subtract(num1, num2);
        } else if (operationSymbol.contains("*")) {
            result = multiply(num1, num2);
        }
        return result;
    }

    public static String defineOperation(String operationSymbol) {
        String operation = "";
        if (operationSymbol.contains("+")) {
            operation = " сложения";
        } else if (operationSymbol.contains("-")) {
            operation = " вычитания";
        } else if (operationSymbol.contains("*")) {
            operation = " умножения";
        }
        return operation;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}