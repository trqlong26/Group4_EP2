module com.aptech.hotel_management {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires de.jensd.fx.glyphs.fontawesome;
    requires org.postgresql.jdbc;
    requires java.sql;

    opens com.aptech.hotel_management to javafx.fxml;
    exports com.aptech.hotel_management;
    exports com.aptech.hotel_management.controller;
//    exports com.aptech.hotel_management.model;
}