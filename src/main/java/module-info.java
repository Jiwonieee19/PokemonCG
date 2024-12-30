module com.example.pokemoncg {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    //requires mysql.connector.java;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.pokemoncg to javafx.fxml;
    exports com.example.pokemoncg;
    exports com.example.Abstract;
    opens com.example.Abstract to javafx.fxml;
}