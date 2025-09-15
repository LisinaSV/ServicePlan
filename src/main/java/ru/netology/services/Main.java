package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        ServiceCalc service = new ServiceCalc();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count = service.calculate(income, expenses, threshold);
        System.out.println(count);
    }
}