package lesson3;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {

    
    private double hourlyRate;

    private Freelancer(String surName, String name, double hourlyRate, int age) {
        super(surName, name, 0, age);
        this.hourlyRate = hourlyRate;
        
    }

    public static Freelancer create(String surName, String name, double hourlyRate, int age) {
        return new Freelancer(surName, name, hourlyRate,  age);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }
     
    @Override
    public String toString() {
        return String.format("%s %s; почасовая ставка: %.2f руб.; заработная плата: %.2f руб.; возраст: %d",
                surName, name, hourlyRate, calculateSalary(), age);
    }

   
}