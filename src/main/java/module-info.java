module es.aketzagonzalez {
	requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens es.aketzagonzalez.aeropuertosC to javafx.fxml;
    exports es.aketzagonzalez.aeropuertosC;
    exports model;
}