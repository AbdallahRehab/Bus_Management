package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static Connection connection;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_mangment_system_new", "root", "root");
        return connection;
    }
}
