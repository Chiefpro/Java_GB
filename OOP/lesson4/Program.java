package lesson4;

public class Program {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        
        System.out.println("Коробки имеют одинаковый вес: " + appleBox.compare(orangeBox));

        
        appleBox.pourTo(appleBox);
        orangeBox.pourTo(orangeBox);

        
        System.out.println("Вес коробки с яблоками после пересыпания: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами после пересыпания: " + orangeBox.getWeight());
    }
}