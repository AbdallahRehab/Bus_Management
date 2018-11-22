package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class first_page_for_manger implements Initializable {
    public static Stage bus_and_place_stage;
    public static Stage allEmployees_in_system_FAdd_stage;
    public static Stage delete_employees_Stage;
    public static Stage edit_employees_Stage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("employees.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
           allEmployees_in_system_FAdd_stage = stage;
        }catch (Exception e){
            System.out.println("cant load frame allemployees");
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("delete_employees.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            delete_employees_Stage = stage;
        } catch (Exception e) {

        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eidt_employees.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            edit_employees_Stage = stage;
        } catch (Exception e) {

        }

    }

    public void Buses_and_place_for_manger(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Busses And Places.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            bus_and_place_stage = stage;
            signInmanger.firstpage_formanger.close();
            bus_and_place_stage.show();
        }catch (Exception e){
            System.out.println("cant load frame bus and place");
        }
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void allEmployees_add_delete_update(ActionEvent actionEvent) {
            signInmanger.firstpage_formanger.close();
            allEmployees_in_system_FAdd_stage.show();

    }
}
