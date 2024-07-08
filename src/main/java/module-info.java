module com.aptech.hotel_management {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.aptech.hotel_management to javafx.fxml;
    exports com.aptech.hotel_management;
}