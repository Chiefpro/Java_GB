package ru.geekbrains.oop.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee{

    private Worker(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    public static Worker create(String surName, String name, double salary){
        return new Worker(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, salary, calculateSalary());
    }
}
