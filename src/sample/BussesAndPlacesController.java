package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class BussesAndPlacesController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void BackMainStage(ActionEvent actionEvent) {
        first_page_for_manger.bus_and_place_stage.close();
        signInmanger.firstpage_formanger.show();
    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        first_page_for_manger.bus_and_place_stage.close();
        Controller.MangerloginStage.show();
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }
}
