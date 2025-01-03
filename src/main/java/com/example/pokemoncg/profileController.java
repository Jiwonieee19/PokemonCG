package com.example.pokemoncg;

import com.example.AbstractDesign.ImageViewUtility;
import com.example.AbstractDesign.PaneLayout;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class profileController {

    @FXML
    private AnchorPane frameAnchorPane;

    @FXML
    private ImageView newbgImageView;

    @FXML
    private BorderPane panelBorderPane;

    @FXML
    private AnchorPane rightAnchorPane;

    @FXML
    private AnchorPane leftAnchorPane;

    @FXML
    private AnchorPane bottomAnchorPane;

    @FXML
    private AnchorPane topAnchorPane;

    @FXML
    private AnchorPane centerAnchorPane;

    public void initialize() {
        // Load background image using utility method
        ImageViewUtility.setBackgroundImage(newbgImageView, "C:\\Users\\ryanj\\IdeaProjects\\PokemonCG\\src\\main\\resources\\css\\image\\1783733R.jpg");

        // Bind the ImageView's size to the AnchorPane's size
        newbgImageView.fitWidthProperty().bind(frameAnchorPane.widthProperty());
        newbgImageView.fitHeightProperty().bind(frameAnchorPane.heightProperty());

        // Bind layout components dynamically using LayoutManager
        PaneLayout.bindLayoutComponents2(frameAnchorPane, panelBorderPane, topAnchorPane, bottomAnchorPane, rightAnchorPane, leftAnchorPane, centerAnchorPane);

    }
}
