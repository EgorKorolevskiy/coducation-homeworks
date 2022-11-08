package homeworks.hw4_01_11_22.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GunService {

    ArrayList<Gun> gunList = new ArrayList<>();

    public void listOfGuns() {
        gunList.add(new Gun("m4", 70, 7_000));
        gunList.add(new Gun("SVD", 90, 9_000));
        gunList.add(new Gun("Kalashnikov", 100, 10_000));
        gunList.add(new Gun("VAL", 80, 8_000));
        gunList.add(new Gun("AR-15", 95, 9_500));
    }

    public void printGunService() {
        listOfGuns();
        Scanner cns = new Scanner(System.in);
        int inputUser = 0;
        while (inputUser != 5) {
            System.out.println("--------------------\n" +
                    "1. Show all weapons\n" +
                    "2. Print the most powerful weapon\n" +
                    "3. Show weapon damage & price\n" +
                    "4. Delete weapon from list\n" +
                    "5. Exit program\n" +
                    "--------------------");
            try {
                inputUser = cns.nextInt();
                switch (inputUser) {
                    case 1 -> showAllGuns();
                    case 2 -> showTheMostPowerfulWeapon();
                    case 3 -> userWeapon();
                    case 4 -> deleteWeapon();
                    case 5 -> System.out.println("Exit gunShop");
                    default -> System.out.println("No such menu option");

                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }

    public void showAllGuns() {
        System.out.println("Список всего оружия");
        for (Gun gun : gunList) {
            System.out.println(gun);
        }
    }

    public void showTheMostPowerfulWeapon() {
        System.out.println("Найти самое мощное по урону оружие: ");

        // первый варик
        Gun gunMaxDamage = new Gun("", 0, 0);

        int a = gunMaxDamage.getDamageWeapon();

        for (Gun gun : gunList) {
            if (gun.getDamageWeapon() > a) {
                a = gun.getDamageWeapon();
            }
        }

        for (Gun gun : gunList) {
            if (gun.getDamageWeapon() == a) {
                System.out.println(gun);
            }
        }

        // второй варик?
//        System.out.println(Collections.max(gunList.getDamageWeapon()));
    }

    public void userWeapon() {
        Scanner cns = new Scanner(System.in);
        System.out.println("Enter weapon name: ");
        String userWeaponName = cns.next();
        int index = gunList.indexOf(new Gun(userWeaponName, 0, 0));
        System.out.println("Weapon is: " + userWeaponName + "\n" + "Weapon damage is: " + gunList.get(index).getDamageWeapon() +
                "\n" + "Weapon price is: " + gunList.get(index).getPriceWeapon());

    }

    public void deleteWeapon() {
        Scanner cns = new Scanner(System.in);
        System.out.println("Enter weapon name: ");
        String userWeaponName = cns.next();
        gunList.remove(new Gun(userWeaponName, 0, 0));
    }
}
