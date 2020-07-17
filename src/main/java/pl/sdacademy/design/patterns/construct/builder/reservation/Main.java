package pl.sdacademy.design.patterns.construct.builder.reservation;

/**
 * Wzorzec budowniczy oddziela tworzenie od reprezentacji.
 * Tworzącym jest ReservationParser
 * zaś reprezentacją Reservation
 *
 * Zadanie:
 *  * Utwórz własny parser UserParser tworzący użytkownika z danych :
 *     "Jan Kowalski, 01-06-1965, ul. Cwiartki 3/4, 01-001, +48 605 505 404"
 */
public class Main {

    public static void main(String[] args) {

        String toParse ="2020-02-02, 123, Poznan, 128";
        Reservation myReservation = ReservationParser.parse(toParse);
        System.out.println(myReservation);
    }
}
