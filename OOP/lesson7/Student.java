

public class Student implements Observer{

    private String name;
    private int salary;

    public Student(String name){
        this.name = name;
        salary = 5000;
    }

    @Override
    public boolean isInterested(VacancyType type) {
        return type == VacancyType.QA;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
