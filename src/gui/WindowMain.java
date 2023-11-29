package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        stage.setHeight(500);
        stage.setWidth(800);
        stage.show();
        initGUI();
    }

    private void initGUI(){

        mainPane.getStylesheets().add(getClass().getResource("/Stylesheets/Dark.css").toExternalForm());
        mainPane.getStyleClass().add("root-pane");
        mainPane.setTop(headerPane);
        mainPane.setBottom(footerPane);
        mainPane.setRight(contextPane);
        initHeader();
        initFooter();
        initContextPane();
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
        footerPane.setAlignment(Pos.CENTER);
        footerPane.setPadding(new Insets(5));

        HBox hbxZoom = new HBox(5);
        hbxZoom.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(hbxZoom, Priority.ALWAYS);

        Label lblInfo = new Label("Zoom:");
        lblInfo.getStyleClass().add("subtle-text");
        Slider sliZoom = new Slider();
        hbxZoom.getChildren().addAll(lblInfo, sliZoom);

        Label lblContent = new Label("xx Shelves(xx Casks)");
        lblContent.getStyleClass().add("subtle-text");
        lblContent.setAlignment(Pos.CENTER_RIGHT);

        footerPane.getChildren().addAll(hbxZoom, lblContent);

    }

    private VBox contextPane = new VBox();
    private VBox contextButtons = new VBox();
    private void initContextPane(){
        contextPane.getStyleClass().add("overlay-pane");
        contextPane.setPrefWidth(100);

        //non-context area
        VBox vbxNonContext = new VBox();
        Button btnAddWarehouse = new Button();
        btnAddWarehouse.getStyleClass().add("button");

    }

    public void setContextPaneButtons(Object entry){
        contextButtons.getChildren().remove(0);
        contextButtons.getChildren().add(0, ContextMenu.generateContextMenu(entry));
    }

    private void updateFooterLabel(){

    }

    private void buttonFactory(){

    }


    private void setContextMenuContent(Node node){
        //Takes parameter for which item is selected, or which submenu is loaded
        //Default of no item selected
        //Below is a "---" seperated vbox of buttons for the section (mostly just an add entry button)
        //Header of the menu is for selected item (same as tooltip)
    }

}
