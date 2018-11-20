package sample;

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

import java.net.URL;
import java.util.ResourceBundle;

public class firstpagetouser implements Initializable {
    public static Stage Addtrip;
    public static Stage DeleteStage;
    public static Stage Eidttrip;

    @FXML
    void AddTripToClient(ActionEvent event) {
        Controller.LoginUserStage.close();
        Addtrip.show();
    }

    @FXML
    void DeleteTripToClient(ActionEvent event) {
        DeleteStage.show();
        Controller.LoginUserStage.close();
    }

    @FXML
    void EditTripToClient(ActionEvent event) {
        try {
            Eidttrip.show();
            Controller.LoginUserStage.close();
        } catch (Exception e) {
            System.out.println("can't load frame Editclient");
        }
    }

    @FXML
    void close_app(MouseEvent event) {
        Platform.exit();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_client.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            Addtrip = stage;
        } catch (Exception e) {

        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("delete_client.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            DeleteStage = stage;
        } catch (Exception e) {

        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("edit_data_client.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            Eidttrip = stage;
        } catch (Exception e) {

        }
    }


}
