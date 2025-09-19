package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        ServiceCalc service = new ServiceCalc();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000; {

        }
        int count = service.calculate(income, expenses, threshold);
        System.out.println(count);
    }
}