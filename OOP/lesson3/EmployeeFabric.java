package lesson3;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    private static Worker generateWorker() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(20, 61);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                age);
    }
    
    private static Freelancer generateFreelancer() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    
        double hourlyRate = random.nextInt(500, 1001);
        int age = random.nextInt(20, 61);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                hourlyRate,
                age);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
    Employee[] employees = new Employee[count];
    for (int i = 0; i < count; i++) {
        switch (random.nextInt(2)) {
            case 0:
                employees[i] = generateWorker();
                break;
            case 1:
                employees[i] = generateFreelancer();
                break;
            // Добавьте здесь другие типы сотрудников, если необходимо
        }
    }
    return employees;
}



}