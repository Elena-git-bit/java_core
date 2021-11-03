package Lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception {
        AppData.appData(); //создание файла csv  и запись в него данных
        File file = new File("table.csv");

        List<String> lines = Files.readAllLines(file.toPath(),
                StandardCharsets.UTF_8);

        for (String line : lines) {
            String[] array = line.split(",", -1);
            System.out.println(array[0]);
        }





    }
}


//1. Реализовать сохранение данных в csv файл;