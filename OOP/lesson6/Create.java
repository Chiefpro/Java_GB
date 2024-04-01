package OOP.lesson6;

import java.util.Scanner;

public class Create  {
    public Order inputFromConsole(){
        return new Order(prompt("Client name: "),
        prompt("Product: "),
        Integer.parseInt(prompt("Quantity: ")),
        Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
