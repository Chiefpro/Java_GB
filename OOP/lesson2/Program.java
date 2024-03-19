package lesson2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 20),
                new Cat("Kesha", 30),
                new Cat("Chupa", 40)
        };

        Plate plate = new Plate(34);
        plate.info();
        System.out.println("--------------------------");

        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat(plate);
            } else {
                plate.addFood(20);
                cat.eat(plate);
            }
            System.out.println(cat.getName() + " is full: " + cat.isFull());
            plate.info();
        }
        System.out.println("---------------------------");
        plate.info();
    }
}
