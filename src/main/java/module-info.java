module com.example.test1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.test1 to javafx.fxml;
    exports com.example.test1;
}