package com.example.olympicmedals;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {

    /**
     * A static method is created to load a different class, to change the scene from one chart to another. Also, this method will set
     * all the stage function.
     * @param event
     * @param fxmlFileLocation
     * @param title
     * @throws IOException
     */
    public static void changeScenes(ActionEvent event, String fxmlFileLocation, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileLocation));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.getIcons().add(new Image(SceneChanger.class.getResourceAsStream("medal.png")));
        stage.show();
    }
}