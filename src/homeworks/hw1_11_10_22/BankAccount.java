package homeworks.hw1_11_10_22;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 2 Создать класс BankAccount с полями
 * <p>
 * сумму на счету
 * номер счета (уникальное значение)
 * процент на остаток (годовой процент)
 * Создайте метод printInfo для вывода атрибутов счета
 * <p>
 * Создайте массив счетов на 10 элементов и заполните его рандомно. Не забудьте, что номер счета при этом не должен повторяться.
 * Создайте меню:
 * 1. Вывести все счета
 * 2. Вывести сумму на счете по номеру (юзер вводит номер)
 * 3. Сделать перевод. Юзер вводит номер счета-отправителя, номер счета-получателя и сумму перевода.
 * Сделайте проверку, что баланса отправителя хватает для перевода
 * 4. Найти счет с самым большим процентом на остаток (найти целый объект)
 * 5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год.
 * Прибыль за год вычисляется по формуле сумма на счету * процент на остаток / 100
 * 6. Выход
 */

public class BankAccount implements IBank {

    private int numberAccount;
    private double amountAccount;
    private double yearPercent;

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getAmountAccount() {
        return amountAccount;
    }

    public void setAmountAccount(double amountAccount) {
        this.amountAccount = amountAccount;
    }

    public double getYearPercent() {
        return yearPercent;
    }

    public void setYearPercent(double yearPercent) {
        this.yearPercent = yearPercent;
    }

    public void printInfo() {
        System.out.printf("""
                --------------------
                Аккаунт: %s
                Сумма на счету: %.2f
                Годовой процент: %.2f""" + "\n", numberAccount, amountAccount, yearPercent);
    }
}

class Main2 extends BankAccount implements IBank {
    public static BankAccount bankAccount = new BankAccount();
    private static final Scanner CNS = new Scanner(System.in);
    private static final String INFO_BANK =
            """
                    --------------------
                    1. Вывести все счета
                    2. Вывести сумму на счете по номеру (юзер вводит номер)
                    3. Сделать перевод
                    4. Найти счет с самым большим годовым процентом (найти целый объект)
                    5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год.
                    6. Выход
                    --------------------""";

    public static void main(String[] args) {
        selectMenu();
    }

    public static void selectMenu() {
        System.out.println(INFO_BANK);
        try {
            int inputUserSelectNum = CNS.nextInt();
            switch (inputUserSelectNum) {
                case (1) -> printMenu1();
                case (2) -> printMenu2();
                case (3) -> printMenu3();
                case (4) -> printMenu4();
                case (5) -> printMenu5();
                case (6) -> printMenu6();
                default -> System.out.println("Нет такого номера");
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого пункта меню");
        }
    }

    public static void printMenu1() {
        for (BankAccount account : ARR_BANK_ACCOUNT) {
            account.printInfo();
        }
        selectMenu();
    }

    public static void printMenu2() {
        System.out.println("Введите номер счета: ");
        try {
            int numAccount = CNS.nextInt();
            for (BankAccount account : ARR_BANK_ACCOUNT) {
                if (account.getNumberAccount() == numAccount) {
                    account.printInfo();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого аккаунта");
        }
        selectMenu();
    }

    public static void printMenu3() {
        System.out.println("Введите номер счета отправителя: ");
        int numAccountSender = CNS.nextInt();
        System.out.println("Введите номер счета получателя: ");
        int numAccountRecipient = CNS.nextInt();
        System.out.println("Введите сумму перевода: ");
        double sumTransfer = CNS.nextDouble();

        for (BankAccount account : ARR_BANK_ACCOUNT) {
            // проверка первого счета
            if (account.getNumberAccount() == numAccountSender && account.getAmountAccount() >= sumTransfer) {
                double currentAmount = account.getAmountAccount();
                account.setAmountAccount(currentAmount - sumTransfer);
                account.printInfo();

            } else if (account.getNumberAccount() == numAccountSender && account.getAmountAccount() < sumTransfer) {
                System.out.println("Недостаточно баланса!");
                break;
            }
            // проверка второго счета
            if (account.getNumberAccount() == numAccountRecipient) {
                double currentAmount = account.getAmountAccount();
                account.setAmountAccount(currentAmount + sumTransfer);
                account.printInfo();
            }
        }
        selectMenu();
    }

    public static void printMenu4() {
        // сравнивает массив объектов по полю getYearPercent и выводит объект с самым большим процентом
        double maxValuePercent = bankAccount.getYearPercent();
        for (BankAccount account : ARR_BANK_ACCOUNT) {
            if (account.getYearPercent() > maxValuePercent) {
                maxValuePercent = account.getYearPercent();
            }
        }
        // сравнивает массив объектов по полю getYearPercent и выводит объект с самым большим процентом
        for (BankAccount bankAccount1 : ARR_BANK_ACCOUNT) {
            if (bankAccount1.getYearPercent() == maxValuePercent) {
                bankAccount1.printInfo();
            }
        }
        selectMenu();
    }

    public static void printMenu5() {
        BankAccount max = ARR_BANK_ACCOUNT[0];
        double yearProfit = 0;
        double yearProfitCalculate;

        for (BankAccount account : ARR_BANK_ACCOUNT) {
            yearProfitCalculate = account.getAmountAccount() * account.getYearPercent() / 100;
            if (yearProfitCalculate > yearProfit) {
                yearProfit = yearProfitCalculate;
                max = account;
            }
        }
        max.printInfo();
        System.out.printf("Прибыль на счете к концу года составит: %.2f \n", yearProfit);
        selectMenu();
    }
    public static void printMenu6() {
        System.out.println("Завершение программы");
        return;
    }
}

interface IBank {
    static BankAccount[] createArrBankAccount() {
        BankAccount[] arr = new BankAccount[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            BankAccount BankAccount = new BankAccount();
            BankAccount.setNumberAccount(i + 1);
            BankAccount.setAmountAccount(rnd.nextDouble(10_000) + 100);
            BankAccount.setYearPercent(rnd.nextDouble(20) + 2.5);
            arr[i] = BankAccount;
        }
        return arr;
    }

    BankAccount[] ARR_BANK_ACCOUNT = createArrBankAccount();
}