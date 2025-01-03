package com.example.AbstractDesign;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

public abstract class ImageViewWhite {

    public static void apply (ImageView imageView) {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setHue(0.0);        // No specific hue adjustment needed
        colorAdjust.setSaturation(-1.0); // Remove all color (grayscale effect)
        colorAdjust.setBrightness(1.0); // Maximum brightness (white)
        imageView.setEffect(colorAdjust);

    }
    //way stylesheet imageview mao need sa class, naa man galing very complicated pud
}
