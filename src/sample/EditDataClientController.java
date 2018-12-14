package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class EditDataClientController implements Initializable {
    public JFXComboBox combobox_Source;
    public JFXComboBox combobox_destination;
    public JFXTextField search_ID_Card_Number_client;
    public JFXTextField username_client;
    public DatePicker select_date;
    public JFXTimePicker time;
    public JFXButton seat1;
    public JFXButton seat2;
    public JFXButton seat3;
    public JFXButton seat4;
    public JFXButton seat5;
    public JFXButton seat6;
    public JFXButton seat7;
    public JFXButton seat8;
    public JFXButton seat9;
    public JFXButton seat10;
    public JFXButton seat11;
    public JFXButton seat12;
    public JFXButton seat13;
    public JFXButton seat14;
    public JFXButton seat15;
    public JFXButton seat16;
    public JFXButton seat17;
    public JFXButton seat18;
    public JFXButton seat19;
    public JFXButton seat20;
    public JFXButton seat21;
    public JFXButton seat22;
    public JFXButton seat23;
    public JFXButton seat24;
    public JFXButton seat25;
    public JFXButton seat26;
    public JFXButton seat27;


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
