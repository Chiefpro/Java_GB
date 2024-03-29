package lesson5;

import lesson5.models.TableService;
import lesson5.presenters.BookingPresenter;
import lesson5.presenters.Model;
import lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Model model = new TableService();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTablesView();
        view.reservationTable(new Date(), 2, "Станислав");
        view.changeReservationTable(1001, new Date(), 3, "Станислав");
        view.reservationTable(new Date(), 2, "Станислав");
        
        

    }

}