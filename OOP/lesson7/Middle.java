package lesson7;

public class Middle implements Observer{

    private String name;
    private int salary;

    public Middle(String name){
        this.name = name;
        salary = 60000;
    }

    @Override
    public boolean isInterested(VacancyType type) {
        return type == VacancyType.JAVA_DEVELOPER || type == VacancyType.UX_DESIGNER;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Мидл %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Мидл %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}