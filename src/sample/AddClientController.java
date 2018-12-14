package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class AddClientController implements Initializable {
    public static Stage CurrentUserStage;
    public static Stage blockticket;

    public JFXComboBox combobox_Source;
    public JFXComboBox combobox_destination;
    public JFXTextField ID_Card_Number_client;
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

    public void click1(ActionEvent actionEvent) {
        seat1.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat1.setDisable(false);
    }

    public void click2(ActionEvent actionEvent) {
        seat2.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat2.setDisable(false);
    }

    public void click22(ActionEvent actionEvent) {
        seat22.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat22.setDisable(false);
    }

    public void click4(ActionEvent actionEvent) {
        seat4.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat4.setDisable(false);
    }

    public void click7(ActionEvent actionEvent) {
        seat7.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat7.setDisable(false);
    }

    public void click10(ActionEvent actionEvent) {
        seat10.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat10.setDisable(false);
    }

    public void click13(ActionEvent actionEvent) {
        seat13.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat13.setDisable(false);
    }

    public void click19(ActionEvent actionEvent) {
        seat19.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat19.setDisable(false);
    }

    public void click16(ActionEvent actionEvent) {
        seat16.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat16.setDisable(false);
    }

    public void click8(ActionEvent actionEvent) {
        seat8.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat8.setDisable(false);
    }

    public void click25(ActionEvent actionEvent) {
        seat25.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat25.setDisable(false);
    }

    public void click5(ActionEvent actionEvent) {
        seat5.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat5.setDisable(false);
    }

    public void click11(ActionEvent actionEvent) {
        seat11.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat11.setDisable(false);
    }

    public void click14(ActionEvent actionEvent) {
        seat14.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat14.setDisable(false);
    }

    public void click17(ActionEvent actionEvent) {
        seat17.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat17.setDisable(false);
    }

    public void click20(ActionEvent actionEvent) {
        seat20.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat20.setDisable(false);
    }

    public void click23(ActionEvent actionEvent) {
        seat23.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat23.setDisable(false);
    }

    public void click26(ActionEvent actionEvent) {
        seat26.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat26.setDisable(false);
    }

    public void click3(ActionEvent actionEvent) {
        seat3.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat3.setDisable(false);
    }

    public void click6(ActionEvent actionEvent) {
        seat6.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat6.setDisable(false);
    }

    public void click9(ActionEvent actionEvent) {
        seat9.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat9.setDisable(false);
    }

    public void click12(ActionEvent actionEvent) {
        seat12.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat12.setDisable(false);
    }

    public void click15(ActionEvent actionEvent) {
        seat15.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat15.setDisable(false);
    }

    public void click18(ActionEvent actionEvent) {
        seat18.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat18.setDisable(false);
    }

    public void click21(ActionEvent actionEvent) {
        seat21.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat21.setDisable(false);
    }

    public void click24(ActionEvent actionEvent) {

        seat24.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat24.setDisable(false);
    }

    public void click27(ActionEvent actionEvent) {


        seat27.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        seat27.setDisable(false);
        }
}
