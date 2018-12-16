package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class signInmanger implements Initializable {
    public JFXTextField email_man_login;
    public JFXPasswordField password_man_login;
    public static Stage registMangerStage;
    public static Stage firstpage_formanger;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void close_app(){

        Platform.exit();
    }
    @FXML
    public void onBackClicked() throws IOException {
        Controller.MangerloginStage.close();
        Main.sampleStage.show();
    }



    public void loginMangertoframe(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/first_page_for_manger.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            firstpage_formanger = stage;
            Controller.MangerloginStage.close();
            firstpage_formanger.show();

        }catch (Exception e){
            System.out.println("cant load frame registrationStageManger");
        }
    }

    public void open_registraion_manger(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/Registration_manger.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            registMangerStage = stage;
            Controller.MangerloginStage.close();
            registMangerStage.show();
        }catch (Exception e){
            System.out.println("cant load frame registrationStageManger");
        }
    }
}
