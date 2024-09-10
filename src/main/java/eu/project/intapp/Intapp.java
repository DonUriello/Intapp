package eu.project.intapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Intapp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
        // launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/eu/project/intapp/creaBean.fxml"));
            // Parent root = FXMLLoader.load(getClass().getResource("/eu/project/intapp/centerCircle.fxml"));
            Scene scene = new Scene(root);

            stage.setTitle("Intapp");

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}