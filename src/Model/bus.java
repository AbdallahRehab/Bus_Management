package Model;

public class bus {
    private int bus_ID;
    private String Date_of_trip;
    private String Time_of_trip;
    private String Source;
    private String Destination;
    private int num_of_seats;

    public static bus currentBus;

    public bus(int bus_ID, String date_of_trip, String time_of_trip, String source, String destination, int num_of_seats) {
        this.bus_ID = bus_ID;
        Date_of_trip = date_of_trip;
        Time_of_trip = time_of_trip;
        Source = source;
        Destination = destination;
        this.num_of_seats = num_of_seats;
    }

    public int getBus_ID() {
        return bus_ID;
    }

    public void setBus_ID(int bus_ID) {
        this.bus_ID = bus_ID;
    }

    public String getDate_of_trip() {
        return Date_of_trip;
    }

    public void setDate_of_trip(String date_of_trip) {
        Date_of_trip = date_of_trip;
    }

    public String getTime_of_trip() {
        return Time_of_trip;
    }

    public void setTime_of_trip(String time_of_trip) {
        Time_of_trip = time_of_trip;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getNum_of_seats() {
        return num_of_seats;
    }

    public void setNum_of_seats(int num_of_seats) {
        this.num_of_seats = num_of_seats;
    }
}
