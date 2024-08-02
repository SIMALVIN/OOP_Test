import java.util.Date;
import java.util.List;

public class InternationalFlight extends Flight {
    private int distance; // Distance in kilometers
    private boolean visaRequired;

    public InternationalFlight(String name, String departAirport, String arriveAirport, Date departDate, int duration, List<Seat> seats, int distance, boolean visaRequired) {
        super(name, departAirport, arriveAirport, departDate, duration, seats);
        this.distance = distance;
        this.visaRequired = visaRequired;
    }

    // Getters and setters for distance and visaRequired
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisaRequired() {
        return visaRequired;
    }

    public void setVisaRequired(boolean visaRequired) {
        this.visaRequired = visaRequired;
    }

    // Calculate the price based on distance
    @Override
    public double calcPrice() {
        double basePrice = 500;
        if (distance <= 1000) {
            return basePrice + (basePrice * 0.10 * distance / 1000);
        } else if (distance <= 3000) {
            return basePrice + (basePrice * 0.15 * distance / 1000);
        } else {
            return basePrice + (basePrice * 0.20 * distance / 1000);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Distance: " + distance + " km\n" +
                "Visa Required: " + (visaRequired ? "Yes" : "No") + "\n" +
                "Price: RM " + calcPrice();
    }
}
