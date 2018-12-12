package Model;


public class user {
    private int id_user;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;
    private int num_of_seat;
    private int bus_ID;
    private String Date_of_trip;
    private String Time_of_trip;
    private String Source;
    private String Destination;
    private int price;

    public user(int id_user, String first_name, String last_name, String phone, String email, int num_of_seat, int bus_ID, String date_of_trip, String time_of_trip, String source, String destination, int price) {
        this.id_user = id_user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
        this.num_of_seat = num_of_seat;
        this.bus_ID = bus_ID;
        Date_of_trip = date_of_trip;
        Time_of_trip = time_of_trip;
        Source = source;
        Destination = destination;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static user currentUser;


    public int getNum_of_seat() {
        return num_of_seat;
    }

    public void setNum_of_seat(int num_of_seat) {
        this.num_of_seat = num_of_seat;
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



    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
