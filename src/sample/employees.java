package sample;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class employees implements Initializable {
    public JFXTextField ID_Card_Number;
    public JFXTextField UserName_emp;
    public JFXTextField PhoneNum_emp;
    public JFXTextField Salary_emp;
    public DatePicker BirthDay_emp;
    public JFXTimePicker timein_emp;
    public JFXTimePicker timeout_emp;
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
    }
}
