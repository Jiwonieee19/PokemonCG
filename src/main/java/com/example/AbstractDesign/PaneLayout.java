package com.example.AbstractDesign;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class PaneLayout {

    public static void bindLayoutComponents(AnchorPane frameAnchorPane, BorderPane panelBorderPane,
                                            AnchorPane topAnchorPane, AnchorPane bottomAnchorPane,
                                            AnchorPane rightAnchorPane, AnchorPane leftAnchorPane, AnchorPane centerAnchorPane) {

        // Ensure the BorderPane fills the AnchorPane and resizes dynamically
        panelBorderPane.prefWidthProperty().bind(frameAnchorPane.widthProperty());
        panelBorderPane.prefHeightProperty().bind(frameAnchorPane.heightProperty());

        // Bind components of the BorderPane to adjust their positions dynamically
        topAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.15));
        bottomAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.15));
        rightAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.15));
        leftAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.15));

        centerAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().subtract(leftAnchorPane.prefWidthProperty()).subtract(rightAnchorPane.prefWidthProperty()));
        centerAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().subtract(topAnchorPane.prefHeightProperty()).subtract(bottomAnchorPane.prefHeightProperty()));
    }

    public static void bindLayoutComponents2(AnchorPane frameAnchorPane, BorderPane panelBorderPane,
                                             AnchorPane topAnchorPane, AnchorPane bottomAnchorPane,
                                             AnchorPane rightAnchorPane, AnchorPane leftAnchorPane, AnchorPane centerAnchorPane) {

        // Ensure the BorderPane fills the AnchorPane and resizes dynamically
        panelBorderPane.prefWidthProperty().bind(frameAnchorPane.widthProperty());
        panelBorderPane.prefHeightProperty().bind(frameAnchorPane.heightProperty());

        // Adjust the size of the top and bottom anchor panes
        topAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.005));  // 15% height for top
        bottomAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.005));  // 15% height for bottom

        // Adjust the size of the left and right anchor panes
        leftAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.005));  // 15% width for left
        rightAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.005));  // 15% width for right

        // Adjust the size of the center anchor pane to fill the remaining space
        centerAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty()
                .subtract(leftAnchorPane.prefWidthProperty()).subtract(rightAnchorPane.prefWidthProperty()));
        centerAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty()
                .subtract(topAnchorPane.prefHeightProperty()).subtract(bottomAnchorPane.prefHeightProperty()));
    }


}
