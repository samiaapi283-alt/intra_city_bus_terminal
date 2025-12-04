module com.example.intra_city_bus_terminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intra_city_bus_terminal to javafx.fxml;
    opens com.example.intra_city_bus_terminal.Bus_Driver to javafx.fxml, javafx.base;
    opens com.example.intra_city_bus_terminal.Maintenance_Staff to javafx.fxml, javafx.base;
    opens com.example.intra_city_bus_terminal.Passenger to javafx.fxml, javafx.base;
    opens com.example.intra_city_bus_terminal.Security_Officer to javafx.fxml, javafx.base;
    opens com.example.intra_city_bus_terminal.Station_Manager to javafx.fxml, javafx.base;
    opens com.example.intra_city_bus_terminal.Ticketing_Staff to javafx.fxml, javafx.base;

    exports com.example.intra_city_bus_terminal;
    exports com.example.intra_city_bus_terminal.Station_Manager;
    exports com.example.intra_city_bus_terminal.Security_Officer;
}