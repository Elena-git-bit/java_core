package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static String[][] createRandom2Massive(int a, int b) {
        Scanner sc = new Scanner(System.in);
        String[][] table = new String[a][b];


        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                table[y][x] = randomString(1);
            }
        }

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                System.out.print(table[y][x] + "\t");
            }
            System.out.println();
        }
        return table;

    }


    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }

    public static String randomString(int value) {
        String string = "";

        for (int i = 0; i < value; i++) {
            int valueAscii = randomIntRange(48, 65);
            char tmpChar = (char) valueAscii;
            string += tmpChar;
        }
        return string;
    }


}



