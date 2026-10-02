module fr.magazin.fxmagazin {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens fr.magazin.fxmagazin.controller to javafx.fxml;
    exports fr.magazin.fxmagazin;
}