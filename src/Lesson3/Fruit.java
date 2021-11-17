package Lesson3;

public class Fruit {
    public double weight;
    public int count;

    public Fruit(double weight, int count) {
        this.weight = weight;
        this.count = count;
    }

    public double getWeight() {
        return weight*count;
    }

}
