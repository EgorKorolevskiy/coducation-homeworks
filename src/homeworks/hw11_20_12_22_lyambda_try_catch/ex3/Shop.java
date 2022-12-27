package homeworks.hw11_20_12_22_lyambda_try_catch.ex3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void printAll(MyFilter myFilter) {
        for (Product product : products) {
            if (myFilter != null && myFilter.filter(product)) {
                System.out.println(product);
            }
            else  if (myFilter == null) {
                System.out.println(product);
            }
        }
    }
}
