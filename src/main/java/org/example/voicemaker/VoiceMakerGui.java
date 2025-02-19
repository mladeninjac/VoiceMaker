package org.example.voicemaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;


public class VoiceMakerGui extends Application {
    private static final int APP_WIDTH = 375;
    private static final int APP_HEIGHT = 475;

    private TextArea textArea;
    private ComboBox<String> voices, rates, volumes;

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(VoiceMakerGui.class.getResource("hello-view.fxml"));
        Scene scene = createScene();
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Voice maker app");
        stage.setScene(scene);
        stage.show();
    }

    //building a scene
    private Scene createScene(){
        //vertical storing components
        VBox box = new VBox();
        box.getStyleClass().add("body");

        Label voiceMakerLabel = new Label("Voice Maker");
        voiceMakerLabel.getStyleClass().add("voice-maker-label");
        voiceMakerLabel.setMaxWidth(Double.MAX_VALUE);
        voiceMakerLabel.setAlignment(Pos.CENTER);
        box.getChildren().add(voiceMakerLabel);

        textArea = new TextArea();
        textArea.setWrapText(true);
        box.getChildren().add(textArea);

        StackPane textAreaPan = new StackPane(new TextArea());
        textAreaPan.setPadding(new Insets(0,15,0,15));
        textAreaPan.getChildren().add(textArea);

        box.getChildren().add(textAreaPan);


        GridPane settingsPane = createSettingsComponents();
        box.getChildren().add(settingsPane);


        return new Scene(box, APP_WIDTH, APP_HEIGHT);


    }

    private GridPane createSettingsComponents() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10,0,0,0));

        Label voiceLabel = new Label("Voice:");
        voiceLabel.getStyleClass().add("setting-label");
        Label rateLabel = new Label("Rate:");
        voiceLabel.getStyleClass().add("setting-label");
        Label volumeLabel = new Label("Volume:");
        volumeLabel.getStyleClass().add("setting-label");
        gridPane.add(voiceLabel, 0, 0);
        gridPane.add(rateLabel, 1, 0);
        gridPane.add(volumeLabel, 2, 0);

        gridPane.setAlignment(Pos.CENTER);
        return gridPane;

    }

    public static void main(String[] args) {
        launch();
    }
}