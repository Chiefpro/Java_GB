package OOP.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class Program {

    public static void main(String[] args) {
        // System.out.println("fffffffff");

        Product  product1 = new Product("Brand #1", "Name #1", 350);
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        System.out.println(product1.displayInfo());



        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bootleChocolate1 = new Chocolate("Brand #4", "Name #4", 300, 100);
        System.out.println(bootleChocolate1.displayInfo());

        Product bootleChocolate2 = new Chocolate("Brand #2", "Name #5", 400, 150);
        System.out.println(bootleChocolate2.displayInfo());


        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));
        list.add(bootleChocolate1);
        list.add(bootleChocolate2);

        VendingMachine vendingMachine = new VendingMachine(list);

        // BottleOfWater bottleOfWaterRes =  vendingMachine.getBottleOfWater("Name #2", 1.5);
        // if (bottleOfWaterRes != null){
        //     System.out.println("Вы купили: ");
        //     System.out.println(bottleOfWaterRes.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }

        Chocolate bootleChocolateRes = vendingMachine.getChocolate("Name #6", 470);
        if (bootleChocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bootleChocolateRes.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }



    }

}
