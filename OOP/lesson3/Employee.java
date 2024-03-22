package lesson3;

public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;


    /**
     * Ставка заработной платы
     */
    protected double salary;

    protected int age;

    

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary, int age) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    
}