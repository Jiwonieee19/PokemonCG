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
}
