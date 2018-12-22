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
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utilities.DBConnection;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String user=email_man_login.getText();
        String pass=password_man_login.getText();
        try {
            Connection connection = DBConnection.getConnection();
            if(!email_man_login.getText().isEmpty()
                    &&!password_man_login.getText().isEmpty()){
                try {
                    String s2 = " select user_name,password from logingm where user_name=? and password=?  ";


                    System.out.println("enter search");
                    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                    statement.setString(1,user);
                    statement.setString(2,pass);
                    System.out.println("enter pre search");
                    ResultSet r = statement.executeQuery();

                    //                    System.out.println(r.getString("user_name"));
                    if(r.next()){
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
                        email_man_login.setText("");
                        password_man_login.setText("");

                    }

                    else {
                        showAlert(Alert.AlertType.ERROR,  "Form Error!", "username & password are incorrect");
                    }

                }catch (Exception er){
                    showAlert(Alert.AlertType.ERROR,  "Form Error!", "username & password are incorrect ");

                }

            }
            else {
                showAlert(Alert.AlertType.ERROR,  "Form Error!", "username & password are empty");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.show();
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
