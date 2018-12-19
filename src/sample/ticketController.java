package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ticketController implements Initializable {
    @FXML
    private JFXTextField combobox_destination;

    @FXML
    private JFXTextField combobox_source;

    @FXML
    private JFXTextField select_date;

    @FXML
    private JFXTextField price;

    @FXML
    private JFXTextField num_of_seat;

    @FXML
    private JFXTextField name_client;


    @FXML
    void close_app(MouseEvent event) {
        AddClientController.blockticket.close();
    }

    @FXML
    void print_ticket(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name_client.setText(AddClientController.fr_cl);
        combobox_source.setText(AddClientController.sou_cl);
        combobox_destination.setText(AddClientController.des_cl);
        select_date.setText(AddClientController.da_cl);
        num_of_seat.setText(AddClientController.seat_cl);
        try {
            Connection connection = DBConnection.getConnection();

            String  s2  =" select price from bus_information where source=? and destination=?";

            System.out.println("enter search");
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
            statement.setString(1,combobox_source.getText());
            statement.setString(2,combobox_destination.getText());

            System.out.println("enter pre search");
            ResultSet r = statement.executeQuery();
            System.out.println("enter resalt");

            if(r.next()){
                price.setText(r.getString(1));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
