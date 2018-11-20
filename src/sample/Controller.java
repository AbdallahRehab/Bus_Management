package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static Stage registrationStage;
    public static Stage LoginUserStage;
    public static Stage MangerloginStage;
    @FXML
    private Pane controlarea;


    @FXML
    void open_registraion(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registration.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            registrationStage = stage;
            Main.sampleStage.close();
        }catch (Exception e){
            System.out.println("cant load frame registrationStage");
        }
    }

    @FXML
    void loginUser(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("firstpagetouser.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            LoginUserStage = stage;
            Main.sampleStage.close();
        }catch (Exception e){
            System.out.println("can't load frame LoginUserStage");
        }

    }
    @FXML
    public void close_app(){
        Platform.exit();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void loginmanger(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signInmanger.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            MangerloginStage = stage;
            Main.sampleStage.close();

        }catch (Exception e){
            System.out.println("cant load frame loginStageManger");
        }
    }
}
