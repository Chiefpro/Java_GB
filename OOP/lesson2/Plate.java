package lesson2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void setFood(int food){
        if (food >= 0) {
            this.food = food;
        }
    }
    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        this.food += food;
    }
}
