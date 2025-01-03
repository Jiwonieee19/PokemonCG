package com.example.AbstractFunction;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class FXMLLoaderUtility {

    /**
     * Loads an FXML file and sets it as the scene of the given stage.
     *
     * @param stage     The stage to set the new scene on.
     * @param fxmlPath  The path to the FXML file.
     * @param title     The title for the stage.
     * @param width     The width of the scene.
     * @param height    The height of the scene.
     */
    public void loadFXMLAndSetScene(Stage stage, String fxmlPath, String title, double width, double height) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Scene scene = new Scene(root, width, height);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load FXML: " + fxmlPath);
            e.printStackTrace();
        }
    }
}
