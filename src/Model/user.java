package Model;


public class user {
    private int ID_User;
    private String First_name;
    private String Last_name;
    private String phone;



    private String Source;
    private String Destination;

    public user(int ID_User, String first_name, String last_name, String phone, String source, String destination) {
        this.ID_User = ID_User;
        First_name = first_name;
        Last_name = last_name;
        this.phone = phone;
        Source = source;
        Destination = destination;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
