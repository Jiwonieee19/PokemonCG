package com.example.pokemoncg;

import com.example.AbstractDesign.ImageViewWhite;
import com.example.CSSEffects.GlowEffectUsage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static com.example.AbstractFunction.FXMLLoaderUtility.loadFXMLAndSetScene;
// this than extends the class

public class paymentController {

    @FXML
    private Button backButton;

    @FXML
    private Label paymentLabel;

    @FXML
    private ImageView backImage, arrowImage1, arrowImage2, arrowImage3;

    @FXML
    private RadioButton smartRadio, gcashRadio, bdoRadio;

    public void initialize() {

        ToggleGroup toggleGroup = new ToggleGroup();

        smartRadio.setToggleGroup(toggleGroup);
        gcashRadio.setToggleGroup(toggleGroup);
        bdoRadio.setToggleGroup(toggleGroup);

        ImageViewWhite.apply(backImage);
        ImageViewWhite.apply(arrowImage1);
        ImageViewWhite.apply(arrowImage2);
        ImageViewWhite.apply(arrowImage3);

        GlowEffectUsage.applyHoverLabel(paymentLabel);



    }

    @FXML
    public void backButtonOnAction (ActionEvent event) {

        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();

    }

}
