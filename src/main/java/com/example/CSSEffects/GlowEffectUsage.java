package com.example.CSSEffects;

import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;

public abstract class GlowEffectUsage {

    public static void apply (Button button) {

        Glow glow = new Glow();
        glow.setLevel(1.8);
        button.setEffect(glow);

    }
    //limited ra css effect, need e code ang uban

    public static void applyHover (Button button) {

        Glow glow = new Glow();
        glow.setLevel(1.8);
        //button.setEffect(glow);


        // Add hover listeners
        button.setOnMouseEntered(event -> button.setEffect(glow)); // Apply glow when hovered
        button.setOnMouseExited(event -> button.setEffect(null)); // Remove glow when not hovered

    }

}
