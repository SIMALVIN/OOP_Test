import java.util.Date;
import java.util.List;

public class DomesticFlight extends Flight {
    private int distance; // Distance in kilometers

    public DomesticFlight(String name, String departAirport, String arriveAirport, Date departDate, int duration, List<Seat> seats, int distance) {
        super(name, departAirport, arriveAirport, departDate, duration, seats);
        this.distance = distance;
    }

    // Getter and setter for distance
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    // Calculate the price based on duration
    @Override
    public double calcPrice() {
        if (getDuration() <= 45) {
            return 150;
        } else if (getDuration() <= 120) {
            return 300;
        } else {
            return 450;
        }
    }

    // Calculate the domestic tax based on distance
    public double calcDomesticTax() {
        double taxRate;
        if (distance <= 500) {
            taxRate = 0.05;
        } else if (distance <= 1000) {
            taxRate = 0.08;
        } else {
            taxRate = 0.12;
        }
        return calcPrice() * taxRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Distance: " + distance + " km\n" +
                "Price: " + calcPrice() + "\n" +
                "Domestic Tax: " + calcDomesticTax();
    }
}
