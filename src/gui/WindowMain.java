package gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowMain extends Application {

    private BorderPane mainPane = new BorderPane();



    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sall Whisky Inventory Management");
        stage.setScene(new Scene(mainPane));
        mainPane.getStylesheets().add(getClass().getResource("/Stylesheets/Dark.css").toExternalForm());
        mainPane.getStyleClass().add("root-pane");
        stage.setHeight(500);
        stage.setWidth(800);
        initGUI();
        stage.show();

    }

    private void initGUI(){

        initHeader();
        initFooter();
        mainPane.setTop(headerPane);
        mainPane.setBottom(footerPane);
    }

    private VBox headerPane = new VBox();
    private HBox hbxPathButtonContainer = new HBox();
    private void initHeader(){
        Label lblTitle = new Label("\uD83C\uDF46 \uD83D\uDCA6 \uD83D\uDD1E");
        lblTitle.getStyleClass().add("main-title");
        Button btnRoot = new PathButton("/");
        headerPane.getChildren().addAll(lblTitle, hbxPathButtonContainer);
        headerPane.getStyleClass().add("overlay-pane");
        headerPane.setPrefHeight(100);
        headerPane.setAlignment(Pos.TOP_CENTER);
    }

    private HBox footerPane = new HBox();
    private void initFooter(){
        footerPane.getStyleClass().add("overlay-pane");
        footerPane.setPrefHeight(20);
        footerPane.setAlignment(Pos.BASELINE_LEFT);

        HBox hbxZoom = new HBox(5);
        hbxZoom.setAlignment(Pos.BASELINE_LEFT);
        HBox.setHgrow(hbxZoom, Priority.ALWAYS);
        Label lblInfo = new Label("Zoom:");
        lblInfo.getStyleClass().add("subtle-text");
        Slider sliZoom = new Slider();
        hbxZoom.getChildren().addAll(lblInfo, sliZoom);

        Label lblContent = new Label("xx Shelves(xx Casks)");
        lblContent.getStyleClass().add("subtle-text");
        lblContent.setAlignment(Pos.BASELINE_RIGHT);

        footerPane.getChildren().addAll(hbxZoom, lblContent);

    }
    private void updateFooter(){

    }

    private void buttonFactory(){

    }

    private void initContextMenu(){

    }
    private void setContextMenuContent(Node node){
        //Takes parameter for which item is selected, or which submenu is loaded
        //Default of no item selected
        //Below is a "---" seperated vbox of buttons for the section (mostly just an add entry button)
        //Header of the menu is for selected item (same as tooltip)
    }

}
