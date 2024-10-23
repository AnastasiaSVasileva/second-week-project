package ru.vasileva.calcapp._main;

import ru.vasileva.calcapp.service.ResultWriterService;
import ru.vasileva.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите символ операции в формате + - *");
        String operationSymbol = sc.next();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        int result = Calculator.calculate(operationSymbol, num1, num2);
        String operation = Calculator.defineOperation(operationSymbol);
        ResultWriterService.printResult(num1, num2, result, operation);
    }
}
