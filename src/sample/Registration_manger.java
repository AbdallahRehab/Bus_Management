package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Registration_manger implements Initializable {
    public JFXTextField First_Name_For_man;
    public JFXTextField last_Name_For_man;
    public JFXTextField email_man;
    public JFXPasswordField Password_man;
    public JFXPasswordField Comfirm_Password;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void onBackClicked(MouseEvent mouseEvent) {
        signInmanger.registMangerStage.close();
        Controller.MangerloginStage.show();
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void register_man(ActionEvent actionEvent) {
        boolean found_emp=false;
        try {
            Connection connection = DBConnection.getConnection();

            if(!First_Name_For_man.getText().isEmpty()&&!last_Name_For_man.getText().isEmpty()&&!email_man.getText().isEmpty()
                    &&!Password_man.getText().isEmpty()&&!Comfirm_Password.getText().isEmpty()){
//            String s ="insert into loging (first_name,last_name,user_name,password)values ('"+First_Name_For_emp.getText()+"','"+last_Name_For_emp.getText()+"','"+email_emp.getText()+"','"+Comfirm_Password.getText()"')";
                PreparedStatement statement =  connection.prepareStatement("insert into logingm (first_name,last_name,user_name,password)values ('"+First_Name_For_man.getText()+"','"+last_Name_For_man.getText()+"','"+email_man.getText()+"','"+Comfirm_Password.getText()+"')");
                found_emp=true;
                System.out.println("sdff");
                statement.executeUpdate();
                showAlert(Alert.AlertType.INFORMATION,  "Form Error!", "Successfully!, ");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(!found_emp){
            showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please enter all data");
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
