package lesson5.presenters;

import lesson5.models.TableService;
import lesson5.views.BookingView;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private Model model;
    private  View view;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        view.registerObserver(this);
    }

    public void updateTablesView(){
        view.showTables(model.loadTables());
    }

    private void updateReservationTableView(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    
    

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        

        int newReservationNumber;
        try {
            newReservationNumber = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        }
        catch (RuntimeException e) {
            System.out.println(e);
            newReservationNumber = -1;
        }

        view.showReservationTableResult(newReservationNumber);
    }
    

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateReservationTableView(reservationNo);
        }
        catch (Exception e){
            updateReservationTableView(-1);
        }

    }
}
