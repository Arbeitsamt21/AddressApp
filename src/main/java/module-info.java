module org.example.addressapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens ch.makery.address.view to javafx.fxml;
    opens org.example.addressapp to javafx.fxml;
    exports org.example.addressapp;
    exports ch.makery.address;
    exports ch.makery.address.view;
}