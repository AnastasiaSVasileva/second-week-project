package ru.vasileva.calcapp._main;

import java.util.Scanner;

import static ru.vasileva.calcapp.service.ResultWriterService.printResult;
import static ru.vasileva.calcapp.util.Calculator.calculate;
import static ru.vasileva.calcapp.util.Calculator.defineOperation;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Введите символ операции в формате + - *");
        String operationSymbol = sc.next();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        int result = calculate(operationSymbol, num1, num2);
        String operation =defineOperation(operationSymbol);
        printResult(num1, num2, result, operation);
    }
}
