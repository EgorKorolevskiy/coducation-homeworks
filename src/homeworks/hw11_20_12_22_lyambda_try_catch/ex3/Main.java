package homeworks.hw11_20_12_22_lyambda_try_catch.ex3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(new Product("Pen", 1002, LocalDate.of(2022, 2, 4)));
        shop.add(new Product("Pencil", 500, LocalDate.of(2019, 4, 8)));
        shop.add(new Product("Copybook", 250, LocalDate.of(2021, 6, 12)));
        shop.add(new Product("Product", 100, LocalDate.of(2020, 4, 15)));
        shop.add(new Product("Folder", 400, LocalDate.of(2022, 4, 6)));

        System.out.println("Метод возвращает true, если цена меньше 1000");
        shop.printAll(product -> product.getPrice() < 1000);

        System.out.println();

        System.out.println("Метод возвращает true, если название начинается на букву \"p\" и кончается на букву \"t\"");
        shop.printAll(product -> {
            int i = product.getName().length();
            char first = product.getName().charAt(0);
            char second = product.getName().charAt(i - 1);

            return first =='P' && second == 't';
        });

        System.out.println();

        System.out.println("Метод возвращает true, если с даты производства прошло менее 2-х лет");
        shop.printAll(product -> product.getDate().getYear() >= 2020);

    }
}
