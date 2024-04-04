

public class Program {
    public static void main(String[] args) {
        Publisher vacancy = new Vacancy();
        Company google = new Company("Google", vacancy, 120000);
        Company yandex = new Company("Yandex", vacancy, 95000);
        Company geekBrains = new Company("GeekBrains", vacancy, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Middle middle = new Middle("Мидл #1");

        vacancy.registerObserver(student1);
        vacancy.registerObserver(master1);
        vacancy.registerObserver(master2);
        vacancy.registerObserver(middle);

        for (int i = 0; i < 3; i++){
            google.newVacancy(VacancyType.JAVA_DEVELOPER);
            yandex.newVacancy(VacancyType.UX_DESIGNER);
            geekBrains.newVacancy(VacancyType.QA);
        }

    }

}