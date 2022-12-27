package homeworks.hw11_20_12_22_lyambda_try_catch.ex1;

import input.Input;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Test myTest = () -> System.out.println("My first lyambda!");
        myTest.doSome();

        Test myTest2 = () -> System.out.println(Input.next("Введите имя "));
        myTest2.doSome();

        List<String> list = List.of("one", "two", "three", "four");

        try {
            PrintWriter pw = new PrintWriter("D:\\JavaProjects\\Coducation\\src\\homeworks\\hw11_20_12_22_lyambda_try_catch\\ex1\\MyTxt");
            list.stream().forEach(t -> pw.println(t));
            System.out.println("Данные записаны в файл!");
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
