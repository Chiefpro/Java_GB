package OOP.lesson6;

public class Program{
    public static void main(String[] args) {
        System.out.println("Введите заказ: ");
        Order order = new Create().inputFromConsole();
        new SaveToJson(order).save();
    }
}