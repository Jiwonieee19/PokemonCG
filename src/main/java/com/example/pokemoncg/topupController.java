package com.example.pokemoncg;

import com.example.AbstractDesign.*;
import com.example.AbstractFunction.FXMLLoaderUtility;
import com.example.CSSEffects.GlowEffectUsage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class topupController extends FXMLLoaderUtility {

    @FXML
    private AnchorPane frameAnchorPane, rightAnchorPane, leftAnchorPane, bottomAnchorPane, topAnchorPane, centerAnchorPane;

    @FXML
    private ImageView newbgImageView, backImageView, dollar1Image, dollar2Image,
                        dollar3Image, dollar4Image, dollar5Image, dollar6Image, dollar7Image, dollar8Image, dollar9Image;

    @FXML
    private BorderPane panelBorderPane;

    @FXML
    private VBox VBox1;

    @FXML
    private AnchorPane VBoxAP1, VBoxAP2;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Label rechargeLabel;

    @FXML
    private Button backButton;

    @FXML
    private Button dollar1Button, dollar2Button, dollar3Button, dollar4Button,
            dollar5Button, dollar6Button, dollar7Button, dollar8Button, dollar9Button;

    public void initialize() {
        // Load background image using utility method
        ImageViewUtility.setBackgroundImage(newbgImageView, "C:\\Users\\ryanj\\IdeaProjects\\PokemonCG\\src\\main\\resources\\css\\image\\1783733R.jpg");

        // Bind the ImageView's size to the AnchorPane's size
        newbgImageView.fitWidthProperty().bind(frameAnchorPane.widthProperty());
        newbgImageView.fitHeightProperty().bind(frameAnchorPane.heightProperty());

        // Bind layout components dynamically using LayoutManager
        PaneLayout.bindLayoutComponents2(frameAnchorPane, panelBorderPane, topAnchorPane, bottomAnchorPane, rightAnchorPane, leftAnchorPane, centerAnchorPane);

        //FOR RESIZING DYNMICALLY ALL COMPONENTS!!
// Set padding to prevent components from being cut off
        Insets padding = new Insets(10, 10, 10, 10); // Top, Right, Bottom, Left

// Set thresholds for resizing (e.g., minimum width = 800, height = 600)
        double minWidth = 800;
        double minHeight = 600;

// Bind VBox1 to the parent AnchorPane with padding and thresholds
        PaneComponentBinder2.bindChildrenToParentWithPadding(centerAnchorPane, padding, minWidth, minHeight, VBox1);

// Set VBoxAP1 and VBoxAP2 to grow dynamically within VBox1
        PaneComponentBinder2.setHBoxChildrenGrow(Priority.ALWAYS, VBoxAP1, VBoxAP2);
        VBox1.setSpacing(10);

        // IMAGEVIEW COLOR CONTROL
        ImageViewWhite.apply(backImageView);

        GlowEffectUsage.applyHoverLabel(rechargeLabel);

        GlowEffectUsage.applyHoverImage(dollar1Image);
        GlowEffectUsage.applyHoverImage(dollar2Image);
        GlowEffectUsage.applyHoverImage(dollar3Image);
        GlowEffectUsage.applyHoverImage(dollar4Image);
        GlowEffectUsage.applyHoverImage(dollar5Image);
        GlowEffectUsage.applyHoverImage(dollar6Image);
        GlowEffectUsage.applyHoverImage(dollar7Image);
        GlowEffectUsage.applyHoverImage(dollar8Image);
        GlowEffectUsage.applyHoverImage(dollar9Image);


    }

    @FXML
    public void backButtonOnAction (ActionEvent event) {

        Stage stage = (Stage) backButton.getScene().getWindow();
        loadFXMLAndSetScene(stage,"/com/example/pokemoncg/homePage.fxml", "BOBOlets!", 1080, 700);
    }

    @FXML
    public void handlePopUp(ActionEvent event) {
        // Get the current stage (owner)
        Stage ownerStage = (Stage) dollar1Button.getScene().getWindow();

        // Use the abstract class method to create and show the popup window
        loadPopupWindow(ownerStage, "/com/example/pokemoncg/popupPayment.fxml", "INAlets", 800, 550);
    }

}
