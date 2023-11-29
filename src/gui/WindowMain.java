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


    //region Header
    private VBox headerPane = new VBox();
    private HBox hbxPathButtonContainer = new HBox();
    private void initHeader(){
        VBox vbxTitle = new VBox();
        VBox.setVgrow(vbxTitle, Priority.ALWAYS);
        vbxTitle.setAlignment(Pos.TOP_CENTER);
        Label lblTitle = new Label("\uD83C\uDF46 \uD83D\uDCA6");
        lblTitle.getStyleClass().add("main-title");
        vbxTitle.getChildren().add(lblTitle);

        hbxPathButtonContainer.getStyleClass().add("path-container");
        hbxPathButtonContainer.setAlignment(Pos.BOTTOM_CENTER);
        hbxPathButtonContainer.maxWidthProperty().bind(mainPane.widthProperty().divide(2));
        addSpacer();

        hbxPathButtonContainer.setAlignment(Pos.BASELINE_LEFT);

        headerPane.getChildren().addAll(vbxTitle, hbxPathButtonContainer);
        headerPane.getStyleClass().add("overlay-pane");
        headerPane.setPrefHeight(100);
        headerPane.setAlignment(Pos.TOP_CENTER);
    }
    private void buttonFactory(){

    }
    private void addButton(){

    }
    private void addSpacer(){
        Button btnRoot = new PathButton(">");
        btnRoot.getStyleClass().add("path-button");
        hbxPathButtonContainer.getChildren().add(btnRoot);
    }
    //endregion

    //region Center
    private void initCenter(){

    }


    //endregion

    //region Right
    private VBox contextPane = new VBox(10);
    private void initContextPane(){
        contextPane.getStyleClass().add("context-pane");
        contextPane.setPrefWidth(125);
        contextPane.setAlignment(Pos.CENTER);
        contextPane.setPadding(new Insets(10));

        VBox vbxNonContext = new VBox();
        //region non-context area
        Label lblSpacer = new Label("---");
        lblSpacer.getStyleClass().add("subtle-text");

        Button btnTest = new Button("Test button");
        btnTest.getStyleClass().add("button");
        vbxNonContext.getChildren().addAll(lblSpacer, btnTest);
        vbxNonContext.setAlignment(Pos.BOTTOM_CENTER);

        VBox vbxNull = new VBox();
        contextPane.getChildren().addAll(vbxNull, vbxNonContext);
        VBox.setVgrow(vbxNull, Priority.ALWAYS);
        //endregion
    }
    public void setContextPaneButtons(Object entry){
        contextPane.getChildren().remove(0);
        contextPane.getChildren().add(0, ContextButtons.getContextButtons(entry));
    }
    private void setContextMenuContent(Node node){
        //TODO:
        //Takes parameter for which item is selected, or which submenu is loaded
        //Default of no item selected
        //Below is a "---" seperated vbox of buttons for the section (mostly just an add entry button)
        //Header of the menu is for selected item (same as tooltip)
    }
    //endregion

    //region Footer
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
    private void updateFooterLabel(){
        //TODO:
    }
    //endregion

}
