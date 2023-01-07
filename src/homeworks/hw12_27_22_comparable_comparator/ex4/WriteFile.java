package homeworks.hw12_27_22_comparable_comparator.ex4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile implements DoSmthWithFile {
    List<String> list = new ArrayList<>();

    public void showList() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void writeIntoDefaultList() {
        try {
            String path = "D:\\JavaProjects\\Coducation\\src\\homeworks\\hw27_12_22_comparable_comparator\\ex4\\Text";
            // Объект записи в файл
            PrintWriter pw = new PrintWriter(path);
            // запись в файл по строчно
            pw.println("apple orange cherry");
            pw.println("samsung acer macbook");
            pw.println("java ruby python");
            pw.println("netflix appletv amedia");
            System.out.println("Данные записаны в файл " + new File(path).getName());
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFromDefaultList() throws IOException {
        // объект считывания файла
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProjects\\Coducation\\src\\homeworks\\hw27_12_22_comparable_comparator\\ex4\\Text"));
        // считывая строку пока не null, сохраняем ее в list
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        System.out.println("Данные записаны в list: ");
        br.close();
    }

    @Override
    public void writeIntoFileFromList(String path) {
        try {
            PrintWriter pw = new PrintWriter(path);
            for (String s : list) {
                pw.println(s);
            }
            System.out.println("Данные записаны в файл " + new File(path).getName());
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeFromFile() throws IOException {
        // объект считывания файла
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProjects\\Coducation\\src\\homeworks\\hw27_12_22_comparable_comparator\\ex4\\Text"));
        // считывая строку пока не null, сохраняем ее в list
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        System.out.println("Данные записаны в list: ");
        br.close();
    }
}

