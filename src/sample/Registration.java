package sample;

import Model.user;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import utilities.DBConnection;


import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Registration implements Initializable {

    public JFXTextField First_Name_For_emp;
    public JFXTextField last_Name_For_emp;
    public JFXTextField email_emp;
    public JFXPasswordField Password_emp;
    public JFXPasswordField Comfirm_Password;


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
//            PreparedStatement ss=connection.prepareStatement("drop emp_info");
//            ss.executeUpdate();
//            PreparedStatement statement = connection.prepareStatement("insert into emp_info (First_name,Last_name,Salary,job) values (?,?,?,?)");
//            statement.setString(1,"abdo");
//            statement.setString(2,"re");
//            statement.setString(3,"2346");
//            statement.setString(4,"man");
//            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void register_emp(ActionEvent actionEvent) {
        boolean found_emp=false;
        try {
            Connection connection = DBConnection.getConnection();

            if(!First_Name_For_emp.getText().isEmpty()&&!last_Name_For_emp.getText().isEmpty()&&!email_emp.getText().isEmpty()
                    &&!Password_emp.getText().isEmpty()&&!Comfirm_Password.getText().isEmpty()){
//            String s ="insert into loging (first_name,last_name,user_name,password)values ('"+First_Name_For_emp.getText()+"','"+last_Name_For_emp.getText()+"','"+email_emp.getText()+"','"+Comfirm_Password.getText()"')";
            PreparedStatement statement =  connection.prepareStatement("insert into loging (first_name,last_name,user_name,password)values ('"+First_Name_For_emp.getText()+"','"+last_Name_For_emp.getText()+"','"+email_emp.getText()+"','"+Comfirm_Password.getText()+"')");
            found_emp=true;
                System.out.println("sdff");
                showAlert(Alert.AlertType.INFORMATION,  "Form Error!", "Successfully!, ");

                statement.executeUpdate();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(!found_emp){
            showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please enter a password");
        }
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.show();
    }
}
