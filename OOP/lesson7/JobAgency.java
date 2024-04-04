

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, int salary, VacancyType type) {
        for (Observer observer : observers){
            if (observer.isInterested(type)) {
                observer.receiveOffer(companyName, salary);
            }
        }
    }
}
