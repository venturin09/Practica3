module com.uiejemplos.proyecto3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.proyecto3 to javafx.fxml;
    exports com.uiejemplos.proyecto3;
}