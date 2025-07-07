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


public class AddMember extends Application {
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
         ImageView imageV=fun.imagev("Photo/newdark.jpg");
           imageV.setFitWidth(950);
         imageV.setFitHeight(600);
        // Form container
        VBox formContainer = new VBox(20);
          formContainer.setAlignment(Pos.CENTER);
        formContainer.setPadding(new Insets(30));
         formContainer.setMaxWidth(500);
         formContainer.getStyleClass().add("form-container");
        
        // Form title
        Label titleLabel = new Label("Add New Member");
         titleLabel.getStyleClass().add("form-title");
        
        // Form fields
        GridPane formGrid = new GridPane();
          formGrid.setVgap(15);
          formGrid.setHgap(10);
         formGrid.setAlignment(Pos.CENTER);

        Button uploadButton = fun.button("upload", "Photo/new icon/addplus.png");
        uploadButton.getStyleClass().add("save-button");
        

        uploadButton.setContentDisplay(ContentDisplay.LEFT);

        ImageView imageView=fun.imagev("Photo/new icon/account_username.png");
        
        Label profLabel = new Label();
    
       profLabel.setMaxHeight(100); 
        profLabel.setMaxWidth(100);


        imageView.setFitHeight(100);  
          imageView.setFitWidth(100);   
          imageView.setPreserveRatio(true);  
            imageView.setSmooth(true);   

           profLabel.setGraphic(imageView);

        HBox profBox = new HBox(160);
          profBox.setAlignment(Pos.CENTER);
            profBox.getChildren().addAll(profLabel, uploadButton);

        
        


       
        
        // Member ID
        Label idLabel = new Label("Member ID:");
        TextField idField = new TextField();
           idField.setPromptText("Auto-generated");
            idField.setDisable(true);
          formGrid.addRow(1, idLabel, idField);
 
           Label NameLabel = new Label("Name:");
        TextField NameField = new TextField();
          NameField.setPromptText("Enter full name");
        formGrid.addRow(2, NameLabel, NameField);
        
    
        Label cnic = new Label("cnic:");
        TextField cnicField = new TextField();
          cnicField.setPromptText("Enter cinc number");
        cnicField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                cnicField.setText(oldValue);
            }
        });
        formGrid.addRow(3, cnic, cnicField);
        
    
            Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        emailField.setPromptText("Enter email address");
        formGrid.addRow(4, emailLabel, emailField);

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();
        phoneField.setPromptText("Enter phone number");
       
        phoneField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                phoneField.setText(oldValue);
            }
        });
        formGrid.addRow(5, phoneLabel, phoneField);


       
         Label membershipLabel = new Label("Membership Type:");
         ComboBox<String> membershipCombo = new ComboBox<>();
          membershipCombo.getItems().addAll("Standard", "Premium", "Student", "Theacher");
         membershipCombo.setValue("Standard");
         formGrid.addRow(6, membershipLabel, membershipCombo);
        
  
        Label addressLabel = new Label("Address:");
         TextArea addressArea = new TextArea();
        addressArea.setPromptText("Enter full address");
        addressArea.setPrefRowCount(3);
        formGrid.addRow(7, addressLabel, addressArea);
        
       
        
        Button saveButton = fun.button("sava", "Photo/new icon/addplus.png");
        saveButton.getStyleClass().add("save-button");

        saveButton.setContentDisplay(ContentDisplay.LEFT);
        
        Button clearButton = fun.button("Clear Form", "Photo/new icon/1486564399-close_81512.png");
        clearButton.getStyleClass().add("clear-button");
        
        clearButton.setContentDisplay(ContentDisplay.LEFT);
        
      
      
       HBox buttonBox = new HBox(160);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(saveButton, clearButton);
       
       
      
        
        // Add all components to form
        formContainer.getChildren().addAll(profBox,titleLabel, formGrid,buttonBox);
        
        // Add to root
        root.getChildren().addAll(imageV,backgroundOverlay, formContainer);
        
        clearButton.setOnAction(e -> {
            NameField.clear();
            cnicField.clear();
            emailField.clear();
            phoneField.clear();
            addressArea.clear();
            membershipCombo.setValue("Standard");
        });
        
        // Scene setup
        Scene scene = new Scene(root, 950, 650);
        scene.getStylesheets().add(getClass().getResource("CSS/AddMember.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(fun.image("Photo/new icon/ADD MEMBER.png"));
        primaryStage.setTitle("Add Member");
        primaryStage.show();

        uploadButton.setOnAction(event ->
        {
            fun.FileChooser(primaryStage);
            ImageView image=fun.getImageView();
            image.setFitHeight(100);  
            image.setFitWidth(100);   
            image.setPreserveRatio(true);  
            profLabel.setGraphic(image);

            
        });

        fun.Responsive(scene, imageV, backgroundOverlay);
    }

    
 
    
    public static void main(String[] args) {
        launch(args);
    }
}