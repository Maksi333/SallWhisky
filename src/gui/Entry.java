package gui;

import javafx.scene.control.Button;

public class Entry extends Button {

    WindowMain window;
    Object entry;
    public Entry(WindowMain window){
        this.window = window;
        this.setOnAction(event -> entryAction());
    }

    private void entryAction(){
        //TODO: set highlight styling
        window.setContextPaneButtons(entry);
    }

}
