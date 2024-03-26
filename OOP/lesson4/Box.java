package lesson4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.001;
    }

    public void pourTo(Box<T> otherBox) {
        if (this.fruits.getClass().equals(otherBox.fruits.getClass())) {
            otherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }
}