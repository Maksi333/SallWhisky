package gui;

import javafx.scene.control.Button;

public class PathButton extends Button {

    public PathButton(String text){
        super(text);
        getStyleClass().add("path-button");

        //TODO: possibly not needed to set context-based styling
        setOnMouseEntered(event -> getStyleClass().add("hover"));
        setOnMouseExited(event -> getStyleClass().remove("hover"));

    }


}
