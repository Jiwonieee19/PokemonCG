package com.example.pokemoncg;

import com.example.AbstractDesign.ImageViewUtility;
import com.example.AbstractDesign.PaneLayout;
import com.example.AbstractDesign.TooltipHelper;
import com.example.AbstractFunction.FXMLLoaderUtility;
import com.example.CSSEffects.GlowEffectUsage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import com.example.AbstractDesign.ImageViewWhite;
import javafx.stage.Stage;

import java.io.IOException;

public class homeController extends FXMLLoaderUtility {

    @FXML
    private AnchorPane frameAnchorPane;

    @FXML
    private ImageView newbgImageView;

    @FXML
    private BorderPane panelBorderPane;

    @FXML
    private AnchorPane bottomAnchorPane;

    @FXML
    private AnchorPane topAnchorPane;

    @FXML
    private AnchorPane rightAnchorPane;

    @FXML
    private AnchorPane leftAnchorPane;

    @FXML
    private AnchorPane centerAnchorPane;

    @FXML
    private Button casualButton;

    @FXML
    private Button profileButton;

    @FXML
    private Button compeButton;

    @FXML
    private Button topupButton;

    @FXML
    private Button historyButton;

    @FXML
    private Button inventoryButton;

    @FXML
    private Button leaderboardButton;

    @FXML
    private Button myteamButton;

    @FXML
    private Button pokemonButton;

    @FXML
    private Button rankButton;

    @FXML
    private Button settingButton;

    @FXML
    private ImageView historyImage;

    @FXML
    private ImageView inventoryImage;

    @FXML
    private ImageView leaderboardImage;

    @FXML
    private ImageView myteamImage;

    @FXML
    private ImageView pokemonImage;

    @FXML
    private ImageView rankImage;

    @FXML
    private ImageView settingImage;

    @FXML
    private ImageView topupImage;

    public void initialize() {
        // Load background image using utility method
        ImageViewUtility.setBackgroundImage(newbgImageView, "C:\\Users\\ryanj\\IdeaProjects\\PokemonCG\\src\\main\\resources\\css\\image\\1783733R.jpg");

        // Bind the ImageView's size to the AnchorPane's size
        newbgImageView.fitWidthProperty().bind(frameAnchorPane.widthProperty());
        newbgImageView.fitHeightProperty().bind(frameAnchorPane.heightProperty());

        // Bind layout components dynamically using LayoutManager
        PaneLayout.bindLayoutComponents(frameAnchorPane, panelBorderPane, topAnchorPane, bottomAnchorPane, rightAnchorPane, leftAnchorPane, centerAnchorPane);

        // IMAGEVIEW COLOR CONTROL
        ImageViewWhite.apply(historyImage);
        ImageViewWhite.apply(inventoryImage);
        ImageViewWhite.apply(leaderboardImage);
        ImageViewWhite.apply(myteamImage);
        ImageViewWhite.apply(rankImage);
        ImageViewWhite.apply(pokemonImage);
        ImageViewWhite.apply(settingImage);
        ImageViewWhite.apply(topupImage);

        //HOVER MSG CONTROL
        TooltipHelper.PokemonTooltip tooltip1 = new TooltipHelper.PokemonTooltip("Pokemons");
        tooltip1.attachTooltip(pokemonButton);
        TooltipHelper.PokemonTooltip tooltip2 = new TooltipHelper.PokemonTooltip("My Team");
        tooltip2.attachTooltip(myteamButton);
        TooltipHelper.PokemonTooltip tooltip3 = new TooltipHelper.PokemonTooltip("Inventory");
        tooltip3.attachTooltip(inventoryButton);
        TooltipHelper.PokemonTooltip tooltip4 = new TooltipHelper.PokemonTooltip("Top Up");
        tooltip4.attachTooltip(topupButton);

        //GLOW EFFECTS
        GlowEffectUsage.applyHover(historyButton);
        GlowEffectUsage.applyHover(leaderboardButton);
        GlowEffectUsage.applyHover(rankButton);
        GlowEffectUsage.applyHover(settingButton);

        GlowEffectUsage.applyHover(compeButton);

        //ANI HOVER EFFECTS
        //AnimationEffectUsage.apply(profileButton);

    }

    @FXML
    private void profileButtonOnAction (ActionEvent event) {

        Stage stage = (Stage) profileButton.getScene().getWindow();
        loadFXMLAndSetScene(stage,"/com/example/pokemoncg/profilePage.fxml", "RAULOlets!", 1105, 735);
    }


}
