package homeworks.hw11_20_12_22_lyambda_try_catch.ex6;

public interface CinemaBooking {
    void showReservation();
    void reservation() throws TickedAlreadyReservedException;
    void showSalesTickets();
    void removeReservation() throws NoExistReserveException;
}
