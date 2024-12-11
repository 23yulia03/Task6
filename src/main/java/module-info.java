module com.example.task62 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task62 to javafx.fxml;
    exports com.example.task62;
}