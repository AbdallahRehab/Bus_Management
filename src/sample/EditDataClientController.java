package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EditDataClientController implements Initializable {
    public JFXComboBox combobox_Source;
    public JFXComboBox combobox_destination;
    public JFXTextField phone_Number_client;
    public JFXTextField firstname_client;
    public JFXTextField lastname_client1;
    public TextField select_date;
    @FXML
    private TextField seat_edit_user;
    public TextField time;
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

    public void BackMainStage(MouseEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        Controller.LoginUserStage.show();
    }

    public void logoutfromaccount(MouseEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        Main.sampleStage.show();
    }

    public void close_app() {
        Platform.exit();
    }

    public void transfertoadd(ActionEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        firstpagetouser.Addtrip.show();
    }

    public void transfertodelete(ActionEvent actionEvent) {
        firstpagetouser.Eidttrip.close();
        firstpagetouser.DeleteStage.show();
    }

    public void update_date_client(ActionEvent actionEvent) {
        boolean found_emp=false;
        try {
            Connection connection = DBConnection.getConnection();


            String  s2  =" select number_of_seat from user_information where number_of_seat=?";

            System.out.println("enter search");
            PreparedStatement statement1 = (PreparedStatement) connection.prepareStatement(s2);
            statement1.setString(1,seat_edit_user.getText());


            System.out.println("enter pre search");
            ResultSet r = statement1.executeQuery();
            System.out.println("enter resalt");

            if(r.next()){
                showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please seat is block");

            }
            else {

        try {
            if(!firstname_client.getText().isEmpty()
                    &&!lastname_client1.getText().isEmpty()){
                PreparedStatement statement =  connection.prepareStatement("update user_information set fitst_name='"+firstname_client.getText()+"',last_name='"+lastname_client1.getText()+"',number_of_seat='"+seat_edit_user.getText()+"' where phone='"+phone_Number_client.getText()+"'");
                found_emp=true;
                System.out.println("sdff");
                showAlert(Alert.AlertType.INFORMATION,  "Form update!", "Successfully!, ");

                statement.executeUpdate();
//                rest all seat
                seat1.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat2.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat3.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat4.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat5.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat6.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat7.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat8.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat9.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat10.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat11.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat12.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat13.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat14.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat15.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat16.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat17.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat18.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat19.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat20.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat21.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat22.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat23.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat24.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat25.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat26.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));
                seat27.setBackground(new Background(new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,Insets.EMPTY)));

//                fun search of new seat
                 search_client();
                firstname_client.setText("");
                lastname_client1.setText("");
                seat_edit_user.setText("");


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(!found_emp){
            showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please check fields");
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

    public void search_client() {
        try {
            Connection connection = DBConnection.getConnection();
            try {
                String  s2  =" select  fitst_name,last_name,number_of_seat from user_information where phone='"+phone_Number_client.getText()+"' ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                ResultSet r = statement.executeQuery(s2);
                System.out.println("enter resalt");
                int seat_client;

                while (r.next()) {
                    firstname_client.setText(r.getString("fitst_name"));
                    lastname_client1.setText(r.getString("last_name"));
                    seat_client=Integer.parseInt(r.getString("number_of_seat"));

                    switch (seat_client){
                        case 1:
                            seat1.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat1.setDisable(false);
                            break;
                        case 2:
                            seat2.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat2.setDisable(false);
                            break;

                        case 3:
                            seat3.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat3.setDisable(false);
                            break;

                        case 4:
                            seat4.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat4.setDisable(false);
                            break;

                        case 5:
                            seat5.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat5.setDisable(false);
                            break;

                        case 6:
                            seat6.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat6.setDisable(false);
                            break;

                        case 7:
                            seat7.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat7.setDisable(false);
                            break;

                        case 8:
                            seat8.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat8.setDisable(false);
                            break;

                        case 9:
                            seat9.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat9.setDisable(false);
                            break;

                        case 10:
                            seat10.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat10.setDisable(false);
                            break;

                        case 11:
                            seat11.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat11.setDisable(false);
                            break;

                        case 12:
                            seat12.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat12.setDisable(false);
                            break;

                        case 13:
                            seat13.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat13.setDisable(false);
                            break;

                        case 14:
                            seat14.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat14.setDisable(false);
                            break;

                        case 15:
                            seat15.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat15.setDisable(false);
                            break;

                        case 16:
                            seat16.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat16.setDisable(false);
                            break;

                        case 17:
                            seat17.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat17.setDisable(false);
                            break;

                        case 18:
                            seat18.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat18.setDisable(false);
                            break;

                        case 19:
                            seat19.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat19.setDisable(false);
                            break;

                        case 20:
                            seat20.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat20.setDisable(false);
                            break;

                        case 21:
                            seat21.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat21.setDisable(false);
                            break;

                        case 22:
                            seat22.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat22.setDisable(false);
                            break;

                        case 23:
                            seat23.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat23.setDisable(false);
                            break;

                        case 24:
                            seat24.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat24.setDisable(false);
                            break;

                        case 25:
                            seat25.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat25.setDisable(false);
                            break;

                        case 26:
                            seat26.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat26.setDisable(false);
                            break;

                        case 27:
                            seat27.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
                            seat27.setDisable(false);
                            break;

                         default:
                             showAlert(Alert.AlertType.ERROR,  "Form Error!", "error!, don't have seat");
                             break;

                    }

                }

            }catch (Exception ex){

                showAlert(Alert.AlertType.ERROR,  "Form Error!", "error!,"+ex.getMessage());

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void seat1(ActionEvent event) {

    }

    @FXML
    void seat10(ActionEvent event) {

    }

    @FXML
    void seat11(ActionEvent event) {

    }

    @FXML
    void seat12(ActionEvent event) {

    }

    @FXML
    void seat13(ActionEvent event) {

    }

    @FXML
    void seat14(ActionEvent event) {

    }

    @FXML
    void seat15(ActionEvent event) {

    }

    @FXML
    void seat16(ActionEvent event) {

    }

    @FXML
    void seat17(ActionEvent event) {

    }

    @FXML
    void seat18(ActionEvent event) {

    }

    @FXML
    void seat19(ActionEvent event) {

    }

    @FXML
    void seat2(ActionEvent event) {

    }

    @FXML
    void seat20(ActionEvent event) {

    }

    @FXML
    void seat21(ActionEvent event) {

    }

    @FXML
    void seat22(ActionEvent event) {

    }

    @FXML
    void seat23(ActionEvent event) {

    }

    @FXML
    void seat24(ActionEvent event) {

    }

    @FXML
    void seat25(ActionEvent event) {

    }

    @FXML
    void seat26(ActionEvent event) {

    }

    @FXML
    void seat27(ActionEvent event) {

    }

    @FXML
    void seat3(ActionEvent event) {

    }

    @FXML
    void seat4(ActionEvent event) {

    }

    @FXML
    void seat5(ActionEvent event) {

    }

    @FXML
    void seat6(ActionEvent event) {

    }

    @FXML
    void seat7(ActionEvent event) {

    }

    @FXML
    void seat8(ActionEvent event) {

    }

    @FXML
    void seat9(ActionEvent event) {

    }
}
