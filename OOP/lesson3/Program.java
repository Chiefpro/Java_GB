package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

//  Arrays.sort(employees);
        Arrays.sort(employees, new AgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}