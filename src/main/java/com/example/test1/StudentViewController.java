package com.example.test1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        province.getColumns().addAll((TableColumn<Student, ?>) Student.getProvinceName());
    }
}
