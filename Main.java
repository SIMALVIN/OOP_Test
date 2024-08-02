import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat("1A"));
        seats.add(new Seat("1B", false));
        seats.add(new Seat("1C"));

        DomesticFlight domesticFlight = new DomesticFlight("AA123", "JFK", "LAX", new Date(), 90, seats, 800);
        System.out.println(domesticFlight);
        System.out.println("Available seats: " + domesticFlight.getAvailableSeats());

        InternationalFlight internationalFlight = new InternationalFlight("AA456", "JFK", "LHR", new Date(), 480, seats, 5500, true);
        System.out.println(internationalFlight);
        System.out.println("Available seats: " + internationalFlight.getAvailableSeats());
    }
}


