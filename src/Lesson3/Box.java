package Lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit>{


    ArrayList<T> Boxes;



   /* public Box(ArrayList<T> fruitBoxes) {
        this.fruitBoxes = fruitBoxes;
    }*/

    public void addBoxToContainer(T t ){
        Boxes.add(t);
    }

   /* public double getWeightOfBox() {
        return fruitBoxes.get(0).getWeight();
    }*/

}
