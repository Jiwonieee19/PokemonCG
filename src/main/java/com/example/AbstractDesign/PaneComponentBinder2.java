package com.example.AbstractDesign;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public abstract class PaneComponentBinder2 {

    /**
     * Dynamically resizes an HBox or VBox to fit within its parent AnchorPane,
     * with optional padding to prevent overflow, only when the window exceeds a size threshold.
     *
     * @param parentPane The parent AnchorPane.
     * @param padding    The padding (insets) to apply.
     * @param widthThreshold The minimum width of the window to trigger resizing.
     * @param heightThreshold The minimum height of the window to trigger resizing.
     * @param children   The children nodes to resize dynamically.
     */
    public static void bindChildrenToParentWithPadding(
            AnchorPane parentPane,
            Insets padding,
            double widthThreshold,
            double heightThreshold,
            javafx.scene.layout.Pane... children) {

        ChangeListener<Number> sizeChangeListener = new ChangeListener<>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                // Check if the parent pane exceeds the thresholds
                if (parentPane.getWidth() >= widthThreshold && parentPane.getHeight() >= heightThreshold) {
                    for (javafx.scene.layout.Pane child : children) {
                        child.prefWidthProperty().bind(parentPane.widthProperty().subtract(padding.getLeft() + padding.getRight()));
                        child.prefHeightProperty().bind(parentPane.heightProperty().subtract(padding.getTop() + padding.getBottom()));
                        AnchorPane.setTopAnchor(child, padding.getTop());
                        AnchorPane.setBottomAnchor(child, padding.getBottom());
                        AnchorPane.setLeftAnchor(child, padding.getLeft());
                        AnchorPane.setRightAnchor(child, padding.getRight());
                    }
                }
            }
        };

        // Add listeners to the parent pane's size properties
        parentPane.widthProperty().addListener(sizeChangeListener);
        parentPane.heightProperty().addListener(sizeChangeListener);
    }

    /**
     * Sets HBox children to grow dynamically within the HBox.
     *
     * @param priority The grow priority.
     * @param children The children of the HBox.
     */
    public static void setHBoxChildrenGrow(Priority priority, javafx.scene.Node... children) {
        for (javafx.scene.Node child : children) {
            HBox.setHgrow(child, priority);
        }
    }

    /**
     * Sets VBox children to grow dynamically within the VBox.
     *
     * @param priority The grow priority.
     * @param children The children of the VBox.
     */
    public static void setVBoxChildrenGrow(Priority priority, javafx.scene.Node... children) {
        for (javafx.scene.Node child : children) {
            VBox.setVgrow(child, priority);
        }
    }
}
