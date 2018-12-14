package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
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
}
