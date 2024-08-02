import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private String name;
    private String departAirport;
    private String arriveAirport;
    private Date departDate;
    private int duration; // Duration in minutes
    private List<Seat> seats;

    public Flight(String name, String departAirport, String arriveAirport, Date departDate, int duration, List<Seat> seats) {
        this.name = name;
        this.departAirport = departAirport;
        this.arriveAirport = arriveAirport;
        this.departDate = departDate;
        this.duration = duration;
        this.seats = seats;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public void setDepartAirport(String departAirport) {
        this.departAirport = departAirport;
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    // Method to return a string representation of the flight information
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flight Name: ").append(name).append("\n")
                .append("Departure Airport: ").append(departAirport).append("\n")
                .append("Arrival Airport: ").append(arriveAirport).append("\n")
                .append("Departure Date: ").append(departDate).append("\n")
                .append("Duration: ").append(duration).append(" minutes\n")
                .append("Seats: ");
        for (Seat seat : seats) {
            sb.append(seat).append(" ");
        }
        return sb.toString();
    }

    // Method to retrieve a list of available seats
    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    // Method to calculate the price of the flight (to be implemented by subclasses)
    public double calcPrice() {
        return 0.0;
    }
}

class Seat {
    private String seatNumber;
    private boolean available;

    public Seat(String seatNumber, boolean available) {
        this.seatNumber = seatNumber;
        this.available = available;
    }

    public Seat(String seatNumber) {
        this(seatNumber, true);
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return seatNumber;
    }
}
