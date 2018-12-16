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

public class delete_employees implements Initializable {
    public JFXTextField sarch_ID_Card_Number_delete_emp;
    public void transfertoAdd(ActionEvent actionEvent) {
        first_page_for_manger.delete_employees_Stage.close();
        first_page_for_manger.allEmployees_in_system_FAdd_stage.show();
    }

    public void transfertoedit(ActionEvent actionEvent) {
        first_page_for_manger.delete_employees_Stage.close();
        first_page_for_manger.edit_employees_Stage.show();
    }

    public void BackMainStage(ActionEvent actionEvent) {
        first_page_for_manger.delete_employees_Stage.close();//Stage delete empolyee close
        signInmanger.firstpage_formanger.show();//to transfer to firstpage manger
    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        first_page_for_manger.delete_employees_Stage.close();
        Controller.MangerloginStage.show();//to transfer to login manger
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void delete_emp_man(ActionEvent actionEvent) {
        try {
            Connection connection = DBConnection.getConnection();
            try {
                String  s2  =" delete from employees_information where id_card='"+sarch_ID_Card_Number_delete_emp.getText()+"' ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                statement.executeUpdate();
                showAlert(Alert.AlertType.WARNING,  "Form delete!", "delete bus!");

            }catch (Exception ex){

                showAlert(Alert.AlertType.ERROR,  "Form Error!", "error!,"+ex.getMessage());

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
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


