package sample;

import Model.user;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class reportc_Lient implements Initializable {
    @FXML
    private JFXTextField search_numbus;
    @FXML
    private JFXTextField total_cost;
    @FXML
    private TableView<user> table;
    @FXML
    private TableColumn<user, Integer> us;

    @FXML
    private TableColumn<user, String> f;

    @FXML
    private TableColumn<user, String> l;

    @FXML
    private TableColumn<user, String> p;

    @FXML
    private TableColumn<user, String> s;

    @FXML
    private TableColumn<user, String> d;

    @FXML
    private TableColumn<user,String> pr;

    ObservableList<user> infouser=FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Connection connection=DBConnection.getConnection();

            PreparedStatement statement=connection.prepareStatement("select us.user_id , us.fitst_name,us.last_name,us.phone,bu.source,bu.destination,bu.price from bus_information bu inner join user_information us on us.user_id=bu.bus_id  ");

            ResultSet re=null;
            re=statement.executeQuery();


            while (re.next()){
            infouser.addAll(new user(re.getInt(1),re.getString(2),re.getString(3),re.getString(4)
            ,re.getString(5),re.getString(6),re.getString(7)));
            }
        us.setCellValueFactory(new PropertyValueFactory<user,Integer>("ID_User"));
        f.setCellValueFactory(new PropertyValueFactory<user,String>("First_name"));
        l.setCellValueFactory(new PropertyValueFactory<user,String>("Last_name"));
        p.setCellValueFactory(new PropertyValueFactory<user,String>("phone"));
        s.setCellValueFactory(new PropertyValueFactory<user,String>("Source"));
        d.setCellValueFactory(new PropertyValueFactory<user,String>("Destination"));
        pr.setCellValueFactory(new PropertyValueFactory<user,String>("price"));

        table.setItems(infouser);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void search_numbus(ActionEvent actionEvent) {

    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void onBackClicked(MouseEvent mouseEvent) {
        first_page_for_manger.reportforclient1.close();
        signInmanger.firstpage_formanger.show();
    }
}
