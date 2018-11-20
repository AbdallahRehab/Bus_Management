package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Registration implements Initializable {

    @FXML
    public void close_app(){

        Platform.exit();
    }
    @FXML
    public void onBackClicked() throws IOException {
        Controller.MangerloginStage.close();
        Main.sampleStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
