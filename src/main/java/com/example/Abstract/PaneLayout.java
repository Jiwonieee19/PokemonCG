package com.example.Abstract;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class PaneLayout {

    public static void bindLayoutComponents(AnchorPane frameAnchorPane, BorderPane panelBorderPane,
                                            AnchorPane topAnchorPane, AnchorPane bottomAnchorPane,
                                            AnchorPane rightAnchorPane, AnchorPane centerAnchorPane) {

        // Ensure the BorderPane fills the AnchorPane and resizes dynamically
        panelBorderPane.prefWidthProperty().bind(frameAnchorPane.widthProperty());
        panelBorderPane.prefHeightProperty().bind(frameAnchorPane.heightProperty());

        // Bind components of the BorderPane to adjust their positions dynamically
        topAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.15));
        bottomAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.15));
        rightAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.15));
        centerAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty()
                .subtract(topAnchorPane.prefHeightProperty().add(bottomAnchorPane.prefHeightProperty())));
    }
}
