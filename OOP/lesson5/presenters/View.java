package lesson5.presenters;

import lesson5.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);

    void registerObserver(ViewObserver observer);

    void showReservationTableResult(int reservationNo);
}