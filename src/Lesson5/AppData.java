package Lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AppData {
    private String[] header;
    private int[][] data;

    public static void appData() {


        try (PrintWriter writer = new PrintWriter(new File("table.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Value 1");
            sb.append(';');
            sb.append("Value 2");
            sb.append(';');
            sb.append("Value 3");
            sb.append('\n');

            sb.append("100");
            sb.append(';');
            sb.append("200");
            sb.append(';');
            sb.append("123");
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}