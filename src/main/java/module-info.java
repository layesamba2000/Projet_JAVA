module sn.dev.sponsorshipapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static lombok;
    requires org.controlsfx.controls;
    requires actlist.plugin; 
    opens sn.dev.sponsorshipapp to javafx.fxml;
    exports sn.dev.sponsorshipapp;
    exports sn.dev.sponsorshipapp.controllers;
    opens sn.dev.sponsorshipapp.controllers to javafx.fxml;
}
