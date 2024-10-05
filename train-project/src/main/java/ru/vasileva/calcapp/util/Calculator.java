package ru.vasileva.calcapp.util;

public class Calculator {

    public static int calculate(String operationSymbol, int num1, int num2) {
        int result;
        if (operationSymbol == "+") {
            result = sum(num1, num2);
        } else if (operationSymbol == "-") {
            result = subtract(num1, num2);
        } else if (operationSymbol == "*"){
            result = multiply(num1, num2);
        }
        return result;
    }

    public static String defineOperation(String operationSymbol) {
        String operation = "";
        if (operationSymbol.contains("+")) {
           operation = " сложение";
        } else if (operationSymbol.contains("-")) {
           operation = " вычитание";
        } else if (operationSymbol.contains("*")) {
           operation = " умножение";
        }
        return operation;
    }

    public static int sum(int num1, int num2) {
        int sumResult = num1+num2;
        return sumResult;
    }

    public static int subtract(int num1, int num2) {
        int subtractResult = num1-num2;
        return subtractResult;
    }

    public static int multiply(int num1, int num2) {
        int multiplyResult = num1*num2;
        return multiplyResult;
    }
}