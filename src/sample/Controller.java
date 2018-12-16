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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
public JFXTextField email_emp_login;
public JFXPasswordField password_emp_login;


    public static Stage registrationStage;
    public static Stage LoginUserStage;
    public static Stage MangerloginStage;
    @FXML
    private Pane controlarea;


    @FXML
    void open_registraion(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/Registration.fxml"));
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
        String user=email_emp_login.getText();
        String pass=password_emp_login.getText();
        try {
            Connection connection = DBConnection.getConnection();
            if(!email_emp_login.getText().isEmpty()
                    &&!password_emp_login.getText().isEmpty()){
                try {
                    String s2 = " select user_name,password from loging where user_name=? and password=?  ";


                    System.out.println("enter search");
                    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                    statement.setString(1,user);
                    statement.setString(2,pass);
                    System.out.println("enter pre search");
                    ResultSet r = statement.executeQuery();

                    //                    System.out.println(r.getString("user_name"));
                    if(r.next()){
                        try {
                            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/firstpagetouser.fxml"));
                            Parent root1 = (Parent) fxmlLoader.load();
                            Stage stage = new Stage();
                            stage.initStyle(StageStyle.UNDECORATED);
                            stage.setScene(new Scene(root1));
                            stage.show();
                            LoginUserStage = stage;
                            Main.sampleStage.close();
                        } catch (Exception e) {
                            System.out.println("can't load frame LoginUserStage");
                        }
                        email_emp_login.setText("");
                        password_emp_login.setText("");

                    }

                    else {
                        showAlert(Alert.AlertType.ERROR,  "Form Error!", "username & password are incorrect");
                    }

                }catch (Exception er){
                    showAlert(Alert.AlertType.ERROR,  "Form Error!", "username & password are incorrect ");

                }

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
    @FXML
    public void close_app(){
        Platform.exit();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void loginmanger(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/signInmanger.fxml"));
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
