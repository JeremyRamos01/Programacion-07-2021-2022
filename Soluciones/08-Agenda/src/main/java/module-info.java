module es.joseluisgs.agenda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens es.joseluisgs.agenda to javafx.fxml;
    exports es.joseluisgs.agenda;
    exports es.joseluisgs.agenda.controllers;
    opens es.joseluisgs.agenda.controllers to javafx.fxml;
    exports es.joseluisgs.agenda.managers;
    opens es.joseluisgs.agenda.managers to javafx.fxml;
    exports es.joseluisgs.agenda.views;
    opens es.joseluisgs.agenda.views to javafx.fxml;
    exports es.joseluisgs.agenda.dto;
    opens es.joseluisgs.agenda.dto to javafx.fxml;
}