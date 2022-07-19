package com.example.test1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        ArrayList<Student> Students = new ArrayList<>(DBUtility.getStudentsFromDB());
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image(getClass().getResourceAsStream("/StudentsLogo.jpg"));
        stage.getIcons().add(icon);
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}