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
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import com.example.AbstractDesign.ImageViewWhite;
import javafx.stage.Stage;

import java.io.IOException;

public class homeController extends FXMLLoaderUtility {

    @FXML
    private AnchorPane frameAnchorPane, rightAnchorPane, leftAnchorPane, bottomAnchorPane, topAnchorPane, centerAnchorPane;
    @FXML
    private ImageView newbgImageView;

    @FXML
    private BorderPane panelBorderPane;

    @FXML
    private Button profileButton, topupButton, casualButton, compeButton, historyButton, trophyButton, leaderboardButton, settingButton;

    @FXML
    private Button pokemonButton, myteamButton, inventoryButton;

    @FXML
    private ImageView topupImage, historyImage, leaderboardImage, trophyImage, settingImage;

    @FXML
    private ImageView pokemonImage, myteamImage, inventoryImage;


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
        ImageViewWhite.apply(trophyImage);
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

        TooltipHelper.PokemonTooltip tooltip5 = new TooltipHelper.PokemonTooltip("History");
        tooltip5.attachTooltip(historyButton);
        TooltipHelper.PokemonTooltip tooltip6 = new TooltipHelper.PokemonTooltip("Leaderboard");
        tooltip6.attachTooltip(leaderboardButton);
        TooltipHelper.PokemonTooltip tooltip7 = new TooltipHelper.PokemonTooltip("Trophy");
        tooltip7.attachTooltip(trophyButton);
        TooltipHelper.PokemonTooltip tooltip8 = new TooltipHelper.PokemonTooltip("Settings");
        tooltip8.attachTooltip(settingButton);

        //GLOW EFFECTS
        GlowEffectUsage.applyHover(historyButton);
        GlowEffectUsage.applyHover(leaderboardButton);
        GlowEffectUsage.applyHover(trophyButton);
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

    @FXML
    private void topupButtonOnAction (ActionEvent event) {

        Stage stage = (Stage) topupButton.getScene().getWindow();
        loadFXMLAndSetScene(stage,"/com/example/pokemoncg/topupPage.fxml", "GAGUElets!", 1105, 735);
    }


}
