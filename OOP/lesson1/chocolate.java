 package lesson1;

public class Chocolate extends Product{

    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, double calories){
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколадка\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалории: %.2f]",
                brand, name, price, calories);
    }
}
