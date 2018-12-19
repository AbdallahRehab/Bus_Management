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
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/add_client.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            Addtrip = stage;
        } catch (Exception e) {

        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/delete_client.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            DeleteStage = stage;
        } catch (Exception e) {

        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/edit_data_client.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            Eidttrip = stage;
        } catch (Exception e) {

        }
//        Connection connection = null;
//        try {
//            connection = DBConnection.getConnection();
//            String  s2  =" delete from user_information";
//            System.out.println("enter search");
//            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
//            System.out.println("enter pre search");
//            statement.executeUpdate();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }


}
