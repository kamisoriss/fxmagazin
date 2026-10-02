package fr.magazin.fxmagazin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MagazinApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MagazinApplication.class.getResource("view/Tickerdecaisse.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Magazin");
        stage.setScene(scene);
        stage.show();
    }
}
