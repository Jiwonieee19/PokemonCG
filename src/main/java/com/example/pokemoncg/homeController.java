package com.example.pokemoncg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class homeController {

    @FXML
    private ImageView bgImageVIew;

    @FXML
    private AnchorPane bottomAnchorPane;

    @FXML
    private Button casualButton;

    @FXML
    private AnchorPane centerAnchorPane;

    @FXML
    private Button compeButton;

    @FXML
    private AnchorPane frameAnchorPane;

    @FXML
    private ImageView historyButton;

    @FXML
    private ImageView inventoryButton;

    @FXML
    private ImageView leaderboardButton;

    @FXML
    private ImageView myteamButton;

    @FXML
    private BorderPane panelBorderPane;

    @FXML
    private ImageView pokemonButton;

    @FXML
    private Button profileButton;

    @FXML
    private ImageView rankButton;

    @FXML
    private AnchorPane rightAnchorPane;

    @FXML
    private ImageView settingButton;

    @FXML
    private AnchorPane topAnchorPane;

    @FXML
    private Button topupButton;

    public void initialize() {
        // Load the background image (replace with your image path)
        Image backgroundImage = new Image("C:\\Users\\ryanj\\IdeaProjects\\PokemonCG\\src\\main\\resources\\image\\1783733R.jpg");
        bgImageVIew.setImage(backgroundImage);

        // Bind the ImageView's size to the AnchorPane's size
        bgImageVIew.fitWidthProperty().bind(frameAnchorPane.widthProperty());
        bgImageVIew.fitHeightProperty().bind(frameAnchorPane.heightProperty());
        bgImageVIew.setPreserveRatio(false); // Allow the image to stretch and fill the AnchorPane

        // Ensure the BorderPane fills the AnchorPane and resizes dynamically
        panelBorderPane.prefWidthProperty().bind(frameAnchorPane.widthProperty());
        panelBorderPane.prefHeightProperty().bind(frameAnchorPane.heightProperty());

        // Bind components of the BorderPane to adjust their positions dynamically
        topAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.15));
        bottomAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().multiply(0.15));
        //leftAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.15));
        rightAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().multiply(0.15));
        //centerAnchorPane.prefWidthProperty().bind(frameAnchorPane.widthProperty().subtract(leftAnchorPane.prefWidthProperty().add(rightAnchorPane.prefWidthProperty())));
        centerAnchorPane.prefHeightProperty().bind(frameAnchorPane.heightProperty().subtract(topAnchorPane.prefHeightProperty().add(bottomAnchorPane.prefHeightProperty())));
    }
}
