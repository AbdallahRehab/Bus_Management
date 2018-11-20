package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class EditDataClientController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void BackMainStage(ActionEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        Controller.LoginUserStage.show();
    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        Main.sampleStage.show();
    }

    public void close_app() {
        Platform.exit();
    }

    public void transfertoadd(ActionEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        firstpagetouser.Addtrip.show();
    }

    public void transfertodelete(ActionEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        firstpagetouser.DeleteStage.show();
    }

}
