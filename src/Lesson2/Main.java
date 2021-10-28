package Lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Object Arrays;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();

      try {
          CheckArray.checkArray(a, b);
      }
      catch (CheckArray.MyArraySizeException e){
          System.out.println("Массив должен быть 4*4");
      }
      catch (CheckArray.MyArrayDataException e) {
          System.out.println("Нельзя преобразовать в число");
      }



        //CheckArray.summMass(CheckArray.transferArray((Array.createRandom2Massive(a,b)))); --не работает


    }


}










