package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ticketController implements Initializable {
    public JFXTextField combo_Source;
    public JFXTextField combobox_destination;
    public JFXTextField num_of_seat;
    public JFXTextField username_client;
    public JFXTextField select_date;
    public JFXTextField price;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

}
