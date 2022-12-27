package homeworks.hw11_20_12_22_lyambda_try_catch.ex3;

import java.time.LocalDate;

public class Product {
    private String name;
    private int price;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public Product(String name, int price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", date=" + date +
                '}';
    }
}


