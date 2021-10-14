module com.example.olympicmedals {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.olympicmedals to javafx.fxml;
    exports com.example.olympicmedals;
}