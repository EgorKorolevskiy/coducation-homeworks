package homeworks.hw12_27_22_comparable_comparator.ex5_6;

import java.util.Comparator;

public class RealEstate implements Comparable<RealEstate> {
    private int price;
    private int square;
    private int countRooms;

    public int getPrice() {
        return price;
    }

    public int getSquare() {
        return square;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public RealEstate(int price, int square, int countRooms) {
        this.price = price;
        this.square = square;
        this.countRooms = countRooms;
    }

    @Override
    public int compareTo(RealEstate o) {
        int comp = getPrice() - o.getPrice();
        if (comp == 0) {
            comp =  o.getSquare() - getSquare();
            if (comp == 0) {
                comp = o.getCountRooms() - getCountRooms();
                if (comp == 0) {
                    return comp;
                }
            }
        }
        return comp;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "price=" + price +
                ", square=" + square +
                ", countRooms=" + countRooms +
                '}';
    }
}

class SortByPriceAsc implements Comparator<RealEstate> {

    @Override
    public int compare(RealEstate o1, RealEstate o2) {
        return o1.getPrice() - o2.getPrice();
    }
}

class SortBySquareDesc implements Comparator<RealEstate> {

    @Override
    public int compare(RealEstate o1, RealEstate o2) {
        return o2.getSquare() - o1.getSquare();
    }
}

class SortByRoomsDesc implements Comparator<RealEstate> {

    @Override
    public int compare(RealEstate o1, RealEstate o2) {
        return o2.getCountRooms() - o1.getCountRooms();
    }
}

