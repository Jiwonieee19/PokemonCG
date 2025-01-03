package com.example.AbstractDesign;

import javafx.scene.Node;
import javafx.scene.control.Tooltip;
import javafx.util.Duration;

public abstract class TooltipHelper {

    private final String tooltipText;

    /**
     * Constructor to initialize the tooltip text.
     *
     * @param tooltipText The text to display in the tooltip.
     */
    public TooltipHelper(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    /**
     * Method to attach the tooltip to a JavaFX node.
     *
     * @param node The node to which the tooltip will be attached.
     */
    public void attachTooltip(Node node) {
        Tooltip tooltip = new Tooltip(tooltipText);
        tooltip.setShowDelay(Duration.millis(50));
        Tooltip.install(node, tooltip);
    }

    public static class PokemonTooltip extends TooltipHelper {

        public PokemonTooltip(String tooltipText) {
            super(tooltipText);
        }
    }

}
