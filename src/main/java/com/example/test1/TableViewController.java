package com.example.test1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        major.setCellValueFactory(new PropertyValueFactory<>("majorCode"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        avgGrade.setCellValueFactory(new PropertyValueFactory<>("avgGrade"));
        province.setCellValueFactory(new PropertyValueFactory<>("province"));
        studentId.setCellValueFactory(new PropertyValueFactory<>("studentNum"));
        telephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        tableView.getItems().addAll(DBUtility.getStudentsFromDB());
    }
}
