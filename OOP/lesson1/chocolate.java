package OOP.lesson1;

public class Chocolate extends Product{

    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, int calories){
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалории: %.2f]",
                brand, name, price, calories);
    }
}
