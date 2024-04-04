

public class Master implements Observer {

    private String name;
    private int salary;

    public Master(String name){
        this.name = name;
        salary = 80000;
    }

    @Override
    public boolean isInterested(VacancyType type) {
        return type == VacancyType.JAVA_DEVELOPER;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
