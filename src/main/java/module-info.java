module com.example.ejercicion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicion to javafx.fxml;
    exports com.example.ejercicion;
}