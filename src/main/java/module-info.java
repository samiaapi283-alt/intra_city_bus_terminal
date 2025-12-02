module com.example.intra_city_bus_terminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intra_city_bus_terminal to javafx.fxml;
    exports com.example.intra_city_bus_terminal;
}