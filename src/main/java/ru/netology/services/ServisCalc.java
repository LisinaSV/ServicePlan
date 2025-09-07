package ru.netology.services;

public class ServisCalc {
    public int calculate(int income, int expenses) {
        int count = 12; // счётчик месяцев отдыха
        int money = 10000; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
            } else {
                money = money + income;
            }

        }
        return count;
    }
}
