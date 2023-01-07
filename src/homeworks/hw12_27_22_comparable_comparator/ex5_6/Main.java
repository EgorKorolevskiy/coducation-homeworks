package homeworks.hw12_27_22_comparable_comparator.ex5_6;

import java.util.ArrayList;
import java.util.Comparator;
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

        System.out.println("одновременно по возрастанию цены, убыванию площади и убыванию комнат");

        realEstateList.sort(null);
        for (RealEstate realEstate : realEstateList) {
            System.out.println(realEstate);
        }

        System.out.println("одновременно по возрастанию цены, убыванию площади и убыванию комнат");

        SortByPriceAsc sortByPriceAsc = new SortByPriceAsc();
        SortBySquareDesc sortBySquareDesc = new SortBySquareDesc();
        SortByRoomsDesc sortByRoomsDesc = new SortByRoomsDesc();

        Comparator<RealEstate> realEstateComparator = sortByPriceAsc.thenComparing(sortBySquareDesc)
                .thenComparing(sortByRoomsDesc);

        realEstateList.sort(realEstateComparator);

        for (RealEstate realEstate : realEstateList) {
            System.out.println(realEstate);
        }


        // ex6
        System.out.println("одновременно в порядке убыванию площади, затем по убыванию комнат, затем по возрастанию цены");
        Comparator<RealEstate> realEstateComparator1 = sortBySquareDesc.thenComparing(sortByRoomsDesc).thenComparing(sortByPriceAsc);

        realEstateList.sort(realEstateComparator1);
        for (RealEstate realEstate : realEstateList) {
            System.out.println(realEstate);
        }
    }
}
