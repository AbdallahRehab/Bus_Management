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
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddClientController implements Initializable {
    public static Stage CurrentUserStage;
    public static Stage blockticket;

    public JFXComboBox combobox_Source;
    public JFXComboBox combobox_destination;
    public JFXTextField phone_Number_client;
    public JFXTextField firstname_client;
    public static String fr_cl;
    public static String sou_cl;
    public static String des_cl;
    public static String da_cl;
    public static String seat_cl;
    public JFXTextField lastname_client1;
    public TextField select_date;
    public TextField time;
    @FXML
    private TextField select_seat_cl;



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
        try {
            Connection connection = DBConnection.getConnection();

                String  s2  =" select  source,destination from bus_information  ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                ResultSet r = statement.executeQuery(s2);
                System.out.println("enter resalt");
                while (r.next()) {
                    combobox_Source.getItems().add(r.getString("source"));
                    combobox_destination.getItems().add(r.getString("destination"));
                }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void submitblock(ActionEvent actionEvent) {



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


    public void submitblock_cilent(ActionEvent actionEvent) {
        boolean found_emp=false;

        try {
            Connection connection = DBConnection.getConnection();
            if(!firstname_client.getText().isEmpty()
                    &&!lastname_client1.getText().isEmpty()&&!phone_Number_client.getText().isEmpty()
                    &&!select_date.getText().isEmpty()&&!time.getText().isEmpty()){


                try {

                    String  s2  =" select number_of_seat from user_information where number_of_seat=?";

                    System.out.println("enter search");
                    PreparedStatement statement1 = (PreparedStatement) connection.prepareStatement(s2);
                    statement1.setString(1,select_seat_cl.getText());


                    System.out.println("enter pre search");
                    ResultSet r = statement1.executeQuery();
                    System.out.println("enter resalt");

                    if(r.next()){
                        showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please seat is block");

                    }
                    else {

                        PreparedStatement statement =  connection.prepareStatement("insert into user_information (fitst_name,last_name,phone,number_of_seat)values ('"+firstname_client.getText()+"','"+lastname_client1.getText()+"','"+phone_Number_client.getText()+"','"+select_seat_cl.getText()+"')");
                        found_emp=true;
                        System.out.println("sdff");
//                showAlert(Alert.AlertType.INFORMATION,  "Form ADD!", "Successfully!, ");

                        statement.executeUpdate();


                            fr_cl=firstname_client.getText()+lastname_client1.getText();
                            sou_cl=combobox_Source.getValue().toString();
                            des_cl=combobox_destination.getValue().toString();
                            seat_cl=select_seat_cl.getText();
                            da_cl=select_date.getText();
                            firstname_client.setText("");
                            lastname_client1.setText("");
                            phone_Number_client.setText("");
                            time.setText("");
                            select_date.setText("");
                            select_seat_cl.setText("");
                            try {
                                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/ticket.fxml"));
                                Parent root1 = (Parent) fxmlLoader.load();
                                Stage stage = new Stage();
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root1));
                                stage.show();
                                blockticket = stage;

                            }catch (Exception e){
                                System.out.println("can't load frame Editclient");
                            }

                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    if(!found_emp){
                        showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please check feild");
                    }


            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
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

}
