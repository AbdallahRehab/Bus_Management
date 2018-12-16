package sample;

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

import java.awt.*;
import java.awt.event.TextEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class eidt_employees implements Initializable {

public JFXTextField search_ID_Card_Number_edit;
public JFXTextField first_name_emp_edit_man;
public JFXTextField PhoneNum_emp_edit;
public JFXTextField Salary_emp_edit;
public TextField shift_time_edit_emp_man;
public TextField birthdate_edit_emp_man;
public JFXTextField job_emp_edit;
public JFXTextField last_name_emp_edit_man;

    public void transfertodelete(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        first_page_for_manger.delete_employees_Stage.show();
    }

    public void transfertoAdd(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        first_page_for_manger.allEmployees_in_system_FAdd_stage.show();

    }

    public void BackMainStage(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        signInmanger.firstpage_formanger.show();

    }

    public void logoutfromaccount(ActionEvent actionEvent) {
        first_page_for_manger.edit_employees_Stage.close();
        Controller.MangerloginStage.show();
    }

    public void close_app(MouseEvent mouseEvent) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void update_data_foredit_man(ActionEvent actionEvent) {
        boolean found_emp=false;

        try {
            Connection connection = DBConnection.getConnection();
            if(!first_name_emp_edit_man.getText().isEmpty()
                    &&!last_name_emp_edit_man.getText().isEmpty()&&!Salary_emp_edit.getText().isEmpty()
                    &&!PhoneNum_emp_edit.getText().isEmpty()&&!shift_time_edit_emp_man.getText().isEmpty()&&!birthdate_edit_emp_man.getText().isEmpty()&&!job_emp_edit.getText().isEmpty()){
                PreparedStatement statement =  connection.prepareStatement("update employees_information set first_name='"+first_name_emp_edit_man.getText()+"',last_name='"+last_name_emp_edit_man.getText()+"',salary='"+Salary_emp_edit.getText()+"',phone='"+PhoneNum_emp_edit.getText()+"',job ='"+job_emp_edit.getText()+"',time_of_shift='"+shift_time_edit_emp_man.getText()+"',birthdate='"+birthdate_edit_emp_man.getText()+"' where id_card='"+search_ID_Card_Number_edit.getText()+"'");
                found_emp=true;
                System.out.println("sdff");
                showAlert(Alert.AlertType.INFORMATION,  "Form update!", "Successfully!, ");

                statement.executeUpdate();
                search_ID_Card_Number_edit.setText("");
                first_name_emp_edit_man.setText("");
                last_name_emp_edit_man.setText("");
                shift_time_edit_emp_man.setText("");
                birthdate_edit_emp_man.setText("");
                job_emp_edit.setText("");
                Salary_emp_edit.setText("");
                PhoneNum_emp_edit.setText("");

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

    public void search_id_card_foredit_man(ActionEvent actionEvent) {
        try {
            Connection connection = DBConnection.getConnection();
            try {
                String  s2  =" select  first_name,last_name,salary,phone,job,time_of_shift,birthdate from employees_information where id_card='"+search_ID_Card_Number_edit.getText()+"' ";
                System.out.println("enter search");
                PreparedStatement statement = (PreparedStatement) connection.prepareStatement(s2);
                System.out.println("enter pre search");
                ResultSet r = statement.executeQuery(s2);
                System.out.println("enter resalt");
                while (r.next()) {
                    first_name_emp_edit_man.setText(r.getString("first_name"));
                    last_name_emp_edit_man.setText(r.getString("last_name"));
                    Salary_emp_edit.setText(r.getString("salary"));
                    PhoneNum_emp_edit.setText(r.getString("phone"));
                    job_emp_edit.setText(r.getString("job"));
                    shift_time_edit_emp_man.setText(r.getString("time_of_shift"));
                    birthdate_edit_emp_man.setText(r.getString("birthdate"));
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
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.show();
    }
}
