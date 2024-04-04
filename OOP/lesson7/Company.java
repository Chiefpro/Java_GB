package lesson7;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private Publisher vacancy;

    private String name;

    private int maxSalary;

    public Company(String name, Publisher vacancy, int maxSalary){
        this.vacancy = vacancy;
        this.name = name;
        this.maxSalary = maxSalary;
    }
    public void newVacancy(VacancyType type){
        int salary = random.nextInt(maxSalary);
        vacancy.sendOffer(name, salary, type);
    }

}