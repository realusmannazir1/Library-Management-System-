package Programs;

import Programs.Function.Function;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AddBook extends Application {
    Function fun = new Function();
    
    @Override
    public void start(Stage primaryStage) {
        // Main container
        StackPane root = new StackPane();
        root.getStyleClass().add("root");
        
        // Background overlay
        StackPane backgroundOverlay = new StackPane();
        backgroundOverlay.getStyleClass().add("background-overlay");
        backgroundOverlay.setPrefSize(950, 600);
        
        ImageView imageV = fun.imagev("Photo/newdark.jpg");
        imageV.setFitWidth(950);
        imageV.setFitHeight(600);
        
        // Form container
        VBox formContainer = new VBox(20);
        formContainer.setAlignment(Pos.CENTER);
        formContainer.setPadding(new Insets(30));
        formContainer.setMaxWidth(500);
        formContainer.getStyleClass().add("form-container");
        
        // Form title
        Label titleLabel = new Label("Add New Book");
        titleLabel.getStyleClass().add("form-title");
        
        // Form fields
        GridPane formGrid = new GridPane();
        formGrid.setVgap(15);
        formGrid.setHgap(10);
        formGrid.setAlignment(Pos.CENTER);

        // Book image section
        Button uploadButton = fun.button("Upload Cover", "Photo/new icon/addplus.png");
        uploadButton.getStyleClass().add("save-button");
         uploadButton.setContentDisplay(ContentDisplay.LEFT);
  
        ImageView imageView = fun.imagev("Photo/new icon/book.png");
         Label profLabel = new Label();
          profLabel.setMaxHeight(130); 
          profLabel.setMaxWidth(100);
         imageView.setFitHeight(130);  
           imageView.setFitWidth(100);   
        imageView.setPreserveRatio(true);  
        imageView.setSmooth(true);   
          profLabel.setGraphic(imageView);

        HBox profBox = new HBox(160);
          profBox.setAlignment(Pos.CENTER);
        profBox.getChildren().addAll(profLabel, uploadButton);
        
        // Book ID
        Label idLabel = new Label("Book ID:");
        TextField idField = new TextField();
        idField.setPromptText("Auto-generated");
             idField.setDisable(true);
        formGrid.addRow(0, idLabel, idField);
        
        // Book Title
        Label nameLabel = new Label("Book Title:");
        TextField nameField = new TextField();
          nameField.setPromptText("Enter Book Title");
        formGrid.addRow(1, nameLabel, nameField);
        
        // Author Name (fixed from duplicate Book Title)
        Label authorNameLabel = new Label("Author Name:");
             TextField authorNameField = new TextField();
        authorNameField.setPromptText("Enter Author Name");
        formGrid.addRow(2, authorNameLabel, authorNameField);

        // Edition
        Label editionLabel = new Label("Edition:");
        TextField editionField = new TextField();
        editionField.setPromptText("Enter Edition number");
          formGrid.addRow(3, editionLabel, editionField);
        
        // Quantity
        Label quantityLabel = new Label("Quantity:");
        TextField quantityField = new TextField();
        quantityField.setPromptText("Enter Quantity");
         quantityField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                quantityField.setText(oldValue);
            }
        });
          formGrid.addRow(4, quantityLabel, quantityField);
        
        // Buttons
        Button saveButton = fun.button("Save", "Photo/new icon/addplus.png");
        saveButton.getStyleClass().add("save-button");
        saveButton.setContentDisplay(ContentDisplay.LEFT);
        
        Button clearButton = fun.button("Clear Form", "Photo/new icon/1486564399-close_81512.png");
        clearButton.getStyleClass().add("clear-button");
        clearButton.setContentDisplay(ContentDisplay.LEFT);
        
        HBox buttonBox = new HBox(160);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(saveButton, clearButton);
        
        // Add all components to form
        formContainer.getChildren().addAll(profBox, titleLabel, formGrid, buttonBox);
        
        // Add to root
        root.getChildren().addAll(imageV, backgroundOverlay, formContainer);
        
        // Clear button action
        clearButton.setOnAction(e -> {
            nameField.clear();
            authorNameField.clear();
            editionField.clear();
            quantityField.clear();
            profLabel.setGraphic(imageView);
        });
        
        // Upload button action
        uploadButton.setOnAction(event -> {
            fun.FileChooser(primaryStage);
            ImageView image = fun.getImageView();
            if (image != null) {
                image.setFitHeight(130);  
                image.setFitWidth(100);   
                image.setPreserveRatio(true);  
                profLabel.setGraphic(image);
            }
        });
        
        // Scene setup
        Scene scene = new Scene(root, 950, 650);
        try {
            scene.getStylesheets().add(getClass().getResource("CSS/AddMember.css").toExternalForm());
        } catch (NullPointerException e) {
            System.err.println("CSS file not found!");
        }
        
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(fun.image("Photo/new icon/ADD MEMBER.png"));
        primaryStage.setTitle("Add Book");  // Fixed title
        primaryStage.show();

        fun.Responsive(scene, imageV, backgroundOverlay);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}