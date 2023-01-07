package homeworks.hw12_27_22_comparable_comparator.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <RealEstate> realEstateList = new ArrayList<>();
        realEstateList.add(new RealEstate(100, 50, 3));
        realEstateList.add(new RealEstate(100, 60, 2));
        realEstateList.add(new RealEstate(100, 50, 4));
        realEstateList.add(new RealEstate(120, 60, 3));
        realEstateList.add(new RealEstate(110, 70, 2));
        realEstateList.add(new RealEstate(110, 70, 4));

        realEstateList.sort(null);
        System.out.println(realEstateList);
    }
}
