package com.example.pokemoncg;

import com.example.CSSEffects.GlowEffectUsage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class TextfieldController {

    @FXML
    private Button resetButton;

    @FXML
    private Button saveButton;

    @FXML
    private Label textLabel;

    @FXML
    private TextField textfield;

    public void initialize() {

        GlowEffectUsage.applyHoverLabel(textLabel);
    }


    @FXML
    private void resetButtonOnAction (ActionEvent event) {
        textfield.setText("");
    }

    @FXML
    private void saveButtonOnAction (ActionEvent event) {
        String text = textfield.getText();

    }

}


