package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
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
}
