package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class eidt_employees implements Initializable {


    public void transfertodelete(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        first_page_for_manger.delete_employees_Stage.show();
    }

    public void transfertoAdd(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        first_page_for_manger.allEmployees_in_system_FAdd_stage.show();

    }

    public void BackMainStage(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        signInmanger.firstpage_formanger.show();

    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        Controller.MangerloginStage.show();
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void searchblock(ActionEvent actionEvent) {
    }

    public void Updateblock(ActionEvent actionEvent) {
    }
}
