package sample;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ticketController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

}
