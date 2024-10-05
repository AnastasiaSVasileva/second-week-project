package ru.vasileva.calcapp.service;

public class ResultWriterService {
    public static void printResult(int num1, int num2, int result, String operation) {
        System.out.println("Итог: " + num1 +" " + num2 +" " + result + operation);
    }
}