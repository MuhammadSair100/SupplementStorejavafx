module com.example.bushido {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bushido to javafx.fxml;
    exports com.example.bushido;
}