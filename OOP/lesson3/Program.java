package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Worker[] workers = EmployeeFabric.generateEmployees(15);
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(workers);

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

}
