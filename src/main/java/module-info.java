module com.serra {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.serra to javafx.fxml;
    opens com.serra.controllers to javafx.fxml;
    exports com.serra;
}
