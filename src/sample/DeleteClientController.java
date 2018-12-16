package sample;

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

public class DeleteClientController implements Initializable {
    public JFXTextField sarch_ID_Card_Number_delete_client;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void close_app() {
        Platform.exit();
    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        firstpagetouser.DeleteStage.close();
        Main.sampleStage.show();
    }

    public void BackMainStage(ActionEvent actionEvent) {
        firstpagetouser.DeleteStage.close();
        Controller.LoginUserStage.show();
    }

    public void transfertoAdd(ActionEvent actionEvent) {
        firstpagetouser.DeleteStage.close();
        firstpagetouser.Addtrip.show();
    }

    public void transfertoedit(ActionEvent actionEvent) {
        firstpagetouser.DeleteStage.close();
        firstpagetouser.Eidttrip.show();
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.show();
    }
    public void delete_client(ActionEvent actionEvent) {
        try {
            Connection connection = DBConnection.getConnection();
            try {
                String  s2  =" delete from user_information where phone='"+sarch_ID_Card_Number_delete_client.getText()+"' ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                statement.executeUpdate();
                showAlert(Alert.AlertType.WARNING,  "Form delete!", "delete client!");

            }catch (Exception ex){

                showAlert(Alert.AlertType.ERROR,  "Form Error!", "error!,"+ex.getMessage());

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
