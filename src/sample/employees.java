package sample;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class employees implements Initializable {
    public JFXTextField ID_Card_Number;
    public JFXTextField last_name_add_emp_man;
    public JFXTextField first_name_add_emp_man;
    public JFXTextField PhoneNum_emp;
    public JFXTextField Salary_emp;
    public TextField date_Add_emp_man;
    public TextField time_shift_Add_emp_man;
    public JFXTextField job_emp;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void transfertodelete(ActionEvent actionEvent) {
        first_page_for_manger.allEmployees_in_system_FAdd_stage.close();
        first_page_for_manger.delete_employees_Stage.show();
    }

    public void transfertoEdit(ActionEvent actionEvent) {
        first_page_for_manger.allEmployees_in_system_FAdd_stage.close();
        first_page_for_manger.edit_employees_Stage.show();
    }

    public void BackMainStage(ActionEvent actionEvent) {
        first_page_for_manger.allEmployees_in_system_FAdd_stage.close();
        signInmanger.firstpage_formanger.show();
    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        first_page_for_manger.allEmployees_in_system_FAdd_stage.close();
        Controller.MangerloginStage.show();
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void submitblock(ActionEvent actionEvent) {
        boolean found_emp=false;

        try {
            Connection connection = DBConnection.getConnection();
            if(!first_name_add_emp_man.getText().isEmpty()&&!last_name_add_emp_man.getText().isEmpty()
                    &&!PhoneNum_emp.getText().isEmpty()&&!Salary_emp.getText().isEmpty()
                    &&!date_Add_emp_man.getText().isEmpty()&&!time_shift_Add_emp_man.getText().isEmpty()&&!job_emp.getText().isEmpty()){
                PreparedStatement statement =  connection.prepareStatement("insert into employees_information (first_name,last_name,id_card,salary,phone,job,time_of_shift,birthdate)values ('"+first_name_add_emp_man.getText()+"','"+last_name_add_emp_man.getText()+"','"+ID_Card_Number.getText()+"','"+Salary_emp.getText()+"','"+PhoneNum_emp.getText()+"','"+job_emp.getText()+"','"+time_shift_Add_emp_man.getText()+"','"+date_Add_emp_man.getText()+"')");
                found_emp=true;
                System.out.println("sdff");
                showAlert(Alert.AlertType.INFORMATION,  "Form ADD!", "Successfully!, ");

                statement.executeUpdate();
                first_name_add_emp_man.setText("");
                last_name_add_emp_man.setText("");
                PhoneNum_emp.setText("");
                Salary_emp.setText("");
                ID_Card_Number.setText("");
                job_emp.setText("");
                time_shift_Add_emp_man.setText("");
                date_Add_emp_man.setText("");

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
