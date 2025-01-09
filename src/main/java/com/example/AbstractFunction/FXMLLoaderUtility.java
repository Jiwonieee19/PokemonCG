package com.example.AbstractFunction;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLLoaderUtility {

    public static void loadFXMLAndSetScene(Stage stage, String fxmlPath, String title, double width, double height) {
        try {
            FXMLLoader loader = new FXMLLoader(FXMLLoaderUtility.class.getResource(fxmlPath));
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

    public static void loadPopupWindow(Stage ownerStage, String fxmlPath, String title, double width, double height) {
        try {
            FXMLLoader loader = new FXMLLoader(FXMLLoaderUtility.class.getResource(fxmlPath));
            Parent root = loader.load();
            Scene scene = new Scene(root, width, height);

            Stage popupStage = new Stage();
            popupStage.initOwner(ownerStage);
            popupStage.initModality(Modality.WINDOW_MODAL);
            popupStage.setTitle(title);
            popupStage.setScene(scene);
            popupStage.setResizable(false);
            popupStage.show();
        } catch (IOException e) {
            System.err.println("Failed to load FXML: " + fxmlPath);
            e.printStackTrace();
        }
    }
}
