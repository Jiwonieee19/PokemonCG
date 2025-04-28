package com.example.pokemoncg;

import com.example.AbstractDesign.ImageViewUtility;
import com.example.AbstractDesign.ImageViewWhite;
import com.example.AbstractDesign.PaneComponentBinder;
import com.example.AbstractDesign.PaneLayout;
import com.example.AbstractFunction.FXMLLoaderUtility;
import com.example.CSSEffects.GlowEffectUsage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class profileController extends FXMLLoaderUtility {

    @FXML
    private ImageView newbgImageView, backImageView;

    @FXML
    private BorderPane panelBorderPane;

    @FXML
    private AnchorPane frameAnchorPane, rightAnchorPane, leftAnchorPane, bottomAnchorPane, topAnchorPane, centerAnchorPane;

    @FXML
    private HBox HBox1;

    @FXML
    private VBox VBox1, VBox2;

    @FXML
    private TextField ignTextF, gmailTextF;

    @FXML
    private Button backButton;

    @FXML
    private Label profileLabel, ignLabel, bindLabel, currentLabel, highestLabel, statsLabel, mainLabel, idLabel;


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
        // Bind the HBox to fit the parent AnchorPane with padding
        PaneComponentBinder.bindChildrenToParentWithPadding(centerAnchorPane, padding, HBox1);
        // Dynamically set VBox children to grow within the HBox
        PaneComponentBinder.setHBoxChildrenGrow(Priority.ALWAYS, VBox1, VBox2);
        // Ensure spacing and alignment are visually pleasing
        HBox1.setSpacing(10); // Space between VBox1 and VBox2
        VBox1.setSpacing(20); // Adjust internal spacing if needed
        VBox2.setSpacing(10); // Adjust internal spacing if needed

        // IMAGEVIEW COLOR CONTROL
        ImageViewWhite.apply(backImageView);

        GlowEffectUsage.applyHoverLabel(profileLabel);
        GlowEffectUsage.applyHoverLabel(ignLabel);
        GlowEffectUsage.applyHoverLabel(bindLabel);
        GlowEffectUsage.applyHoverLabel(currentLabel);
        GlowEffectUsage.applyHoverLabel(highestLabel);
        GlowEffectUsage.applyHoverLabel(statsLabel);
        GlowEffectUsage.applyHoverLabel(mainLabel);
        GlowEffectUsage.applyHoverLabel(idLabel);

    }

    @FXML
    public void handlePopUp(MouseEvent event) {
        // Get the current stage (owner)
        Stage ownerStage = (Stage) ignTextF.getScene().getWindow();

        // Use the abstract class method to create and show the popup window
        loadPopupWindow(
                ownerStage, // Parent stage
                "/com/example/pokemoncg/popupTextfield.fxml", // Path to FXML
                "INAlets", // Title of the popup
                500, // Width of the popup
                300 // Height of the popup
        );
    }

    @FXML
    public void backButtonOnAction (ActionEvent event) {

        Stage stage = (Stage) backButton.getScene().getWindow();
        loadFXMLAndSetScene(stage,"/com/example/pokemoncg/homePage.fxml", "BOBOlets!", 1080, 700);
    }

}
