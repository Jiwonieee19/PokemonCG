package com.example.CSSEffects;

import javafx.animation.ScaleTransition;
import javafx.scene.control.Button;
import javafx.util.Duration;

public abstract class AnimationEffectUsage {

    /**
     * Applies a simple hover animation effect to a Button.
     *
     * @param button the Button to which the hover animation will be applied.
     */
    public static void apply(Button button) {
        if (button == null) {
            throw new IllegalArgumentException("Button cannot be null.");
        }

        // ScaleTransition for hover animation
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), button);
        scaleUp.setToX(1.1); // Slightly increase width
        scaleUp.setToY(1.1); // Slightly increase height

        ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), button);
        scaleDown.setToX(1.0); // Reset to original size
        scaleDown.setToY(1.0); // Reset to original size

        // Apply the animations on hover
        button.setOnMouseEntered(event -> scaleUp.playFromStart());
        button.setOnMouseExited(event -> scaleDown.playFromStart());
    }
}
