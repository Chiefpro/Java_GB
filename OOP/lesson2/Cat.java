package lesson2;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
//    -------------------------------------------
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    public void eat(lesson2.Plate plate) {
        if (plate.getFood() >= appetite){
            plate.setFood((plate.getFood()) - appetite);
            isFull = true;
        }
    }
    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

}
