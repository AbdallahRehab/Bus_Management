package sample;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class AddClientController implements Initializable {
    public static Stage CurrentUserStage;
    public static Stage blockticket;

    public JFXComboBox combobox_Source;
    public JFXComboBox combobox_destination;
    public JFXTextField ID_Card_Number;
    public JFXTextField username;
    public DatePicker select_date;
    public JFXTimePicker time;



    @FXML
    void BackMainStage(ActionEvent event) {
        firstpagetouser.Addtrip.close();
        Controller.LoginUserStage.show();
    }

    @FXML
    void close_app(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void logoutfromaccount(ActionEvent event) {
        firstpagetouser.Addtrip.close();
        Main.sampleStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void submitblock(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/ticket.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            blockticket = stage;
            firstpagetouser.Addtrip.close();
        }catch (Exception e){
            System.out.println("can't load frame Editclient");
        }


    }
 /* abdalla */
    public void transfertodelete(ActionEvent actionEvent) {
        firstpagetouser.Addtrip.close();
        firstpagetouser.DeleteStage.show();
    }

    public void transfertoEdit(ActionEvent actionEvent) {
        firstpagetouser.Addtrip.close();
        firstpagetouser.Eidttrip.show();
    }
}
