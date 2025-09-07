package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        ServisCalc service = new ServisCalc();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count = service.calculate(income, expenses);
        if (count > threshold) {
            int count = +"можно отдыхать";// можем ли отдыхать?
        }

    } else

    {
        int count = count + "Придётся работать,";
        System.out.println(count);
    }
}