package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class employees implements Initializable {
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
