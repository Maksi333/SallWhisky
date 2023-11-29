package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class Scene_Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

}

Hanne mere til væske objekt metoden end hashmap

        I stedet for en liste af væsker
        Så når der bliver hælpdt på et fad, er det med et nyt object af væske
        Når man laver ny væske - skal den man hælder på, merges med den eksisterende - og indsætte sin historik af væsker og ratio med den