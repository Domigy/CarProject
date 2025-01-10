module org.example.carproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.carproject to javafx.fxml;
    exports org.example.carproject;
}