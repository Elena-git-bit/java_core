package Lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Первое задание
        String[] myArray = {"A", "B", "C", "D"};
        //System.out.println(Arrays.toString(myArray));
        //ChangeArray.changeArray(myArray);


        //Второе задание
        Box<Apple> box = new Box();
        Box<Orange> box2 = new Box();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange1 = new Orange();

        box.addBoxToContainer(apple1);
        box.addBoxToContainer(apple2);
        box2.addBoxToContainer(orange1);



    }



}
