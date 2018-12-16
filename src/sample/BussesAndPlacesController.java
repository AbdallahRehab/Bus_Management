package sample;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class BussesAndPlacesController implements Initializable {
    public TextField num_bus_man;
    public TextField source_man;
    public TextField destination_man;
    public TextField date_man_add;
    public TextField time_man_add;
    public TextField price_man_add;
    public JFXTextField search_with_num_of_bus_delete_man;
    public TextField source_edit_man;
    public TextField destination_edit_man;
    public TextField price_edit_man;
    public TextField date_man_edit;
    public TextField time_man_edit;
    public JFXTextField search_num_bus_edit_man;



    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public void BackMainStage(ActionEvent actionEvent) {
        first_page_for_manger.bus_and_place_stage.close();
        signInmanger.firstpage_formanger.show();
    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        first_page_for_manger.bus_and_place_stage.close();
        Controller.MangerloginStage.show();
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void add_bus_information(ActionEvent actionEvent) {
        boolean found_emp=false;

        try {
            Connection connection = DBConnection.getConnection();
            if(!num_bus_man.getText().isEmpty()&&!source_man.getText().isEmpty()
                    &&!destination_man.getText().isEmpty()&&!date_man_add.getText().isEmpty()
                    &&!time_man_add.getText().isEmpty()&&!price_man_add.getText().isEmpty()){
                PreparedStatement statement =  connection.prepareStatement("insert into bus_information (date_of_trip,time_of_trip,source,destination,price)values ('"+date_man_add.getText()+"','"+time_man_add.getText()+"','"+source_man.getText()+"','"+destination_man.getText()+"','"+price_man_add.getText()+"')");
                found_emp=true;
                System.out.println("sdff");
                showAlert(Alert.AlertType.INFORMATION,  "Form ADD!", "Successfully!, ");

                statement.executeUpdate();
                source_man.setText("");
                destination_man.setText("");
                date_man_add.setText("");
                time_man_add.setText("");
                price_man_add.setText("");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(!found_emp){
            showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please enter a password");
        }
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.show();
    }

    public void search_for_edit_man(ActionEvent actionEvent) {
        try {
            Connection connection = DBConnection.getConnection();
            try {
                String  s2  =" select  source,destination,date_of_trip,time_of_trip,price from bus_information where bus_id='"+search_num_bus_edit_man.getText()+"' ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                ResultSet r = statement.executeQuery(s2);
                System.out.println("enter resalt");
                while (r.next()) {
                    source_edit_man.setText(r.getString("source"));
                    destination_edit_man.setText(r.getString("destination"));
                    date_man_edit.setText(r.getString("date_of_trip"));
                    time_man_edit.setText(r.getString("time_of_trip"));
                    price_edit_man.setText(r.getString("price"));
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

    public void update_date_bus_man(ActionEvent actionEvent) {
        boolean found_emp=false;

        try {
            Connection connection = DBConnection.getConnection();
            if(!source_edit_man.getText().isEmpty()
                    &&!destination_edit_man.getText().isEmpty()&&!date_man_edit.getText().isEmpty()
                    &&!time_man_edit.getText().isEmpty()&&!price_edit_man.getText().isEmpty()){
                        PreparedStatement statement =  connection.prepareStatement("update bus_information set date_of_trip='"+date_man_edit.getText()+"',time_of_trip='"+time_man_edit.getText()+"',source='"+source_edit_man.getText()+"',destination='"+destination_edit_man.getText()+"',price ='"+price_edit_man.getText()+"' where bus_id='"+search_num_bus_edit_man.getText()+"'");
                found_emp=true;
                System.out.println("sdff");
                showAlert(Alert.AlertType.INFORMATION,  "Form update!", "Successfully!, ");

                statement.executeUpdate();
                source_edit_man.setText("");
                destination_edit_man.setText("");
                date_man_edit.setText("");
                time_man_edit.setText("");
                price_edit_man.setText("");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(!found_emp){
            showAlert(Alert.AlertType.ERROR,  "Form Error!", "Please check fields");
        }
    }

    public void delete_bus_emp(ActionEvent actionEvent) {
        try {
            Connection connection = DBConnection.getConnection();
            try {
                String  s2  =" delete from bus_information where bus_id='"+search_with_num_of_bus_delete_man.getText()+"' ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                statement.executeUpdate();
                showAlert(Alert.AlertType.WARNING,  "Form delete!", "delete bus!");

            }catch (Exception ex){

                showAlert(Alert.AlertType.ERROR,  "Form Error!", "error!,"+ex.getMessage());

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
