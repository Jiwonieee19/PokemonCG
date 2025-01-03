package com.example.AbstractDesign;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class ImageViewUtility {

    // Utility method to set background image
    public static void setBackgroundImage(ImageView imageView, String imagePath) {
        Image backgroundImage = new Image(imagePath);
        imageView.setImage(backgroundImage);
        imageView.setPreserveRatio(false); // Allow the image to stretch and fill
    }
}
