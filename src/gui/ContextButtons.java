package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ContextButtons {

    private static VBox shelfContextMenu;
    private static VBox caskContextMenu;
    private static VBox warehouseContextMenu;
    private static VBox defaultContextMenu;

    static {
        shelfContextMenu = createShelfContextMenu();
        caskContextMenu = createCaskContextMenu();
        warehouseContextMenu = createWarehouseContextMenu();
        defaultContextMenu = createDefaultContextMenu();
    }

    //TODO: switch might not work, and we also have to add proper event handling(className might not work)
    //TODO: copy and repurpose for tooltip context?
    //NOTE: the reason I dont want to do this with ONE VBOX,
    // is so that more or less items can easily be added - such as
    // an option for mixing with casks, or extending with shelf

    /**
     * Used by the main window to request the proper set of buttons <br>
     * for the menu on the right side, so that there can be a unique <br>
     * contextual menu depending on what is shown in the main window (Shelf, Warehouse, etc)
     * @param entry
     * @return Correct VBox depending on what is clicked
     */
    public static VBox getContextButtons(Object entry) {
        switch (entry.getClass().getName()) {
            case "Shelf":
                return shelfContextMenu;
            case "Cask":
                return caskContextMenu;
            case "Warehouse":
                return warehouseContextMenu;
            default:
                return defaultContextMenu;
        }
    }

    private static VBox createCaskContextMenu() {
        VBox contextMenu = new VBox();
        contextMenu.getChildren().addAll(
                createButton("Edit", event -> {}),
                createButton("Create New", event -> {}),
                createButton("Delete Entry", event -> {})
        );
        return contextMenu;
    }

    private static VBox createShelfContextMenu() {
        VBox contextMenu = new VBox();
        contextMenu.getChildren().addAll(
                createButton("Edit", event -> {}),
                createButton("Create New", event -> {}),
                createButton("Delete Entry", event -> {})
        );
        return contextMenu;
    }

    private static VBox createWarehouseContextMenu() {
        VBox contextMenu = new VBox();
        contextMenu.getChildren().addAll(
                createButton("Edit", event -> {}),
                createButton("Create New", event -> {}),
                createButton("Delete Entry", event -> {})
        );
        return contextMenu;
    }

    private static VBox createDefaultContextMenu() {
        VBox contextMenu = new VBox();
        return contextMenu;
    }

    private static Button createButton(String text, EventHandler<ActionEvent> onAction) {
        Button button = new Button(text);
        button.setOnAction(onAction);
        button.getStyleClass().add("button");
        return button;
    }
}
