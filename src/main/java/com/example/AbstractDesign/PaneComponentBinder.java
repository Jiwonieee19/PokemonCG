package com.example.AbstractDesign;

import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public abstract class PaneComponentBinder {

    /**
     * Dynamically resizes an HBox or VBox to fit within its parent AnchorPane,
     * with optional padding to prevent overflow.
     *
     * @param parentPane The parent AnchorPane.
     * @param padding    The padding (insets) to apply.
     * @param children   The children nodes to resize dynamically.
     */
    public static void bindChildrenToParentWithPadding(AnchorPane parentPane, Insets padding, javafx.scene.layout.Pane... children) {
        for (javafx.scene.layout.Pane child : children) {
            child.prefWidthProperty().bind(parentPane.widthProperty().subtract(padding.getLeft() + padding.getRight()));
            child.prefHeightProperty().bind(parentPane.heightProperty().subtract(padding.getTop() + padding.getBottom()));
            AnchorPane.setTopAnchor(child, padding.getTop());
            AnchorPane.setBottomAnchor(child, padding.getBottom());
            AnchorPane.setLeftAnchor(child, padding.getLeft());
            AnchorPane.setRightAnchor(child, padding.getRight());
        }
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
