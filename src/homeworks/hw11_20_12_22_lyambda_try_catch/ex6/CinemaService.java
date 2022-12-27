package homeworks.hw11_20_12_22_lyambda_try_catch.ex6;

import homeworks.hw11_20_12_22_lyambda_try_catch.ex6.CinemaBooking;
import input.Input;

import java.util.HashMap;
import java.util.Random;

public class CinemaService extends CinemaHall implements CinemaBooking {
    HashMap<Integer, String> reservationKeys = new HashMap<>();

    public void start() throws TickedAlreadyReservedException {
        int userInput = 0;
        while (userInput != 5) {
            System.out.println("--------------------\n" +
                    "1. Show cinemaHall\n" +
                    "2. Reservation place\n" +
                    "3. Show sale's tickets\n" +
                    "4. Remove reservation\n" +
                    "5. Exit\n" +
                    "--------------------");
            userInput = Input.nextInt();
            switch (userInput) {
                case 1 -> showReservation();
                case 2 -> {
                    try {
                        reservation();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case 3 -> showSalesTickets();
                case 4 -> {
                    try {
                        removeReservation();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    @Override
    public void showReservation() {
        showCinemaHall();
    }

    @Override
    public void reservation() throws InvalidRowValueException, InvalidPlaceValueException, TickedAlreadyReservedException {
        System.out.println("Для брони введите ряд (x)");
        int a = Input.nextInt();
        if (a < 1) {
            throw new InvalidPlaceValueException("Ряд не может быть меньше нуля!");
        }

        System.out.println("Введите место(y)");
        int b = Input.nextInt();
        if (b < 1) {
            throw new InvalidPlaceValueException("Место не может быть меньше нуля!");
        }

        if (cinemaArea[a][b].equals(CinemaSymbol.BOOKING_SPACE)) {
            throw new TickedAlreadyReservedException("Место уже занято, выберите другое!");
        }
        cinemaArea[a][b] = CinemaSymbol.BOOKING_SPACE;

        Random rnd = new Random();
        int ticket = rnd.nextInt(1, 1000);

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String spectatorSeat = str1 + " " + str2;

        uniqueReservationKey(ticket, spectatorSeat);
        System.out.printf("Вы успешно зарезервировали место под номером %s %s %n Ваш билет %s%n", a, b, ticket);
        showCinemaHall();
    }

    public void uniqueReservationKey(int key, String spectatorSeat) {
        reservationKeys.put(key, spectatorSeat);
    }

    @Override
    public void showSalesTickets() {
        if (reservationKeys.isEmpty()) {
            System.out.println("Пока не продано ни одного билета!");
            return;
        }
        System.out.println("Номер билетов: " + reservationKeys.keySet());
        System.out.println("Зрительские места: " + reservationKeys.values());
    }

    @Override
    public void removeReservation() throws NoExistReserveException {
        System.out.println("Введите билет что бы аннулировать бронь");
        int ticket = Input.nextInt();
        if (!reservationKeys.containsKey(ticket)) {
            throw new NoExistReserveException("Такой брони не существует");
        }
            String[] words = reservationKeys.get(ticket).split(" ");
            cinemaArea[Integer.parseInt(words[0])][Integer.parseInt(words[1])] = CinemaSymbol.EMPTY_SPACE;

            reservationKeys.remove(ticket);
            System.out.println("Бронь удалена!");
    }
}
