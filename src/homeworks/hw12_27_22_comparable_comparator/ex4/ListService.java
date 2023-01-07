package homeworks.hw12_27_22_comparable_comparator.ex4;

import input.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ListService {
    public void start() throws IOException {
        WriteFile writeFile = new WriteFile();
        //записываем дефолтные значения в файл
        writeFile.writeIntoDefaultList();
        //записываем дефолтные значения из файла в list
        writeFile.writeFromDefaultList();
        //вывести список
        writeFile.showList();
        System.out.println();

        //---------------------------------------------

        System.out.println("Сортировка в алфавитном порядке");
        SortByNaturalOrder sb = new SortByNaturalOrder();
        // Сортировка в алфавитном порядке
        writeFile.list.sort(sb);
        // Записываем данные из листа в файл
        writeFile.writeIntoFileFromList("D:\\JavaProjects\\Coducation\\src\\homeworks\\hw27_12_22_comparable_comparator\\ex4\\output1");
        System.out.println("Данные записаны ");

        //---------------------------------------------

        System.out.println("Сортировка в алфавитном порядке по одному слову");
        System.out.println("Введите индекс слова по которому будет сортировка");
        int userInputPosition = Input.nextInt();

        writeFile.list = writeFile.list.stream()
                .sorted(Comparator.comparing((String e) -> e.split(" ")[userInputPosition]))
                .collect(Collectors.toCollection(ArrayList::new));

        writeFile.writeIntoFileFromList("D:\\JavaProjects\\Coducation\\src\\homeworks\\hw27_12_22_comparable_comparator\\ex4\\output2");
        System.out.println("Данные записаны ");
        writeFile.showList();

        //---------------------------------------------


    }
}
