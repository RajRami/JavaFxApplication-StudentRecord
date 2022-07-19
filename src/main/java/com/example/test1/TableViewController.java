package com.example.test1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TableColumn<Student, Integer> avgGrade;

    @FXML
    private TableColumn<Student, String> firstName;

    @FXML
    private TableColumn<Student, String> gender;

    @FXML
    private TableColumn<Student, String> lastName;

    @FXML
    private TableColumn<Student, String> major;

    @FXML
    private TableColumn<Student, String> province;

    @FXML
    private TableColumn<Student, Integer> studentId;
    @FXML
    private TableColumn<Student, String> telephone;
    @FXML
    private TableView<Student> tableView;
    @FXML
    private Label msgLabel;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Button button;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        major.setCellValueFactory(new PropertyValueFactory<>("majorCode"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        avgGrade.setCellValueFactory(new PropertyValueFactory<>("avgGrade"));
        province.setCellValueFactory(new PropertyValueFactory<>("province"));
        studentId.setCellValueFactory(new PropertyValueFactory<>("studentNum"));
        telephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));

        //It will populate the table with data
        tableView.getItems().addAll(DBUtility.getStudentsFromDB());

        //It will provide many options for province
        comboBox.getItems().addAll(Student.getProvinceName());
        msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));

        //It will populate the table according to the province selected
        comboBox.valueProperty().addListener((obs, oldValue, newValue) -> {
            switch (newValue) {
                case "AB" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("AB"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "BC" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("BC"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "MB" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("MB"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "NB" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("NB"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "NL" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("NL"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "NS" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("NS"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "NT" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("NT"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "NU" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("NU"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "ON" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("ON"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "PE" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("PE"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "QC" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("QC"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "SK" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("SK"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
                case "YT" -> {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(DBUtility.getStudentsByProvince("YT"));
                    msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
                }
            }
        });
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tableView.getItems().clear();
                tableView.getItems().addAll(DBUtility.getStudentsFromDB());
                msgLabel.setText("Number Of Students: " + String.valueOf(tableView.getItems().size()));
            }
        });
    }
}
