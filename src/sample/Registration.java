package sample;

import Model.user;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import utilities.DBConnection;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Registration implements Initializable {

    @FXML
    public void close_app(){

        Platform.exit();
    }
    @FXML
    public void onBackClicked() throws IOException {
        Controller.registrationStage.close();
        Main.sampleStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*user.currentUser = new user(sldkfsd);
        user.currentUser.getEmail();*/
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("insert into user_info (First_name,Last_name,Phone,email) values (?,?,?,?)");
            statement.setString(1,"vvvv");
            statement.setString(2,"lool");
            statement.setString(3,"0123456");
            statement.setString(4,"vbnm");
            statement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
