package gui;

import javafx.scene.control.Button;

public class Entry extends Button {

    WindowMain window;
    Object entry;
    public Entry(WindowMain window, Object entry){
        this.window = window;
        this.setOnAction(event -> entryAction());
        this.entry = entry;
    }

    private void entryAction(){
        //TODO: set styling and picture

        //TODO: this is wrong, mark as selected instead
        window.setContextPaneButtons(entry);
    }

}
