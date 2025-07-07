package Programs;

import Programs.Function.Function;
import Programs.Function.TabCreate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Dashboard extends Application {
    Function fun = new Function();
    TabCreate tab = new TabCreate();
    
    @Override
    public void start(Stage primaryStage) {
        // Main root container
        StackPane root = new StackPane();
        root.getStyleClass().add("root");
        
        // Background image setup
        ImageView backgroundImage = fun.imagev("Photo/library.jpg");
        backgroundImage.setPreserveRatio(false);
        
        Scene scene = new Scene(root, 1300, 686);
        
   
      
        ImageView logo=fun.imagev("Photo/new icon/account_username.png");
        logo.setFitHeight(100);
        logo.setFitWidth(100);
        Label ProfileLabel = new Label("",logo);
        ProfileLabel.setAlignment(Pos.TOP_CENTER);
        ProfileLabel.getStyleClass().add("profile");

        Button addMemberButton = fun.button(" ADD MEMBER", "Photo/new icon/ADD MEMBER.png");
        Button addBookButton = fun.button("ADD BOOK      ", "Photo/new icon/books.png");
        Button issueBook = fun.button("ISSUE BOOK     ", "Photo/new icon/Books_icon.png");
        Button returnBook = fun.button("RETURN BOOK   ", "Photo/new icon/Return_icon-.png");
        Button updateBook = fun.button("UPDATE BOOK", "Photo/new icon/62863books_109231.png");
        Button updatemember = fun.button("UPDATE MEMBER","Photo/new icon/account_username.png");
        Button settings = fun.button("SETTINGS       ", "Photo/new icon/button_refresh.png");
        Button logout= fun.button("LOGOUT       ", "Photo/new icon/1486564399-close_81512.png");
        // Semi-transparent overlay for better text visibility
        StackPane backgroundOverlay = new StackPane();
        backgroundOverlay.getStyleClass().add("background-overlay");
        backgroundOverlay.setPrefSize(scene.getWidth(), scene.getHeight());
        
        // Vertical button container
        VBox buttonvbox = new VBox(30);
        buttonvbox.getStyleClass().add("Virt-form");
          
        buttonvbox.getChildren().addAll(
                ProfileLabel,addMemberButton, 
               addBookButton,issueBook,returnBook,
               updatemember,updateBook,settings,
               logout);
        
        // Main label
      Label nameLabel = new Label("Library Managment System");
      nameLabel.getStyleClass().add("library-title");

       nameLabel.setMaxWidth(Double.MAX_VALUE);
       nameLabel.setAlignment(Pos.CENTER);  
      StackPane.setAlignment(nameLabel, Pos.TOP_CENTER);
    
        
        // Container for the button panel with proper alignment
        StackPane buttonPanelContainer = new StackPane(buttonvbox);
          buttonPanelContainer.setMaxWidth(220);
        StackPane.setAlignment(buttonPanelContainer, Pos.TOP_LEFT);
       

         TabPane tabPane=tab.tabPane();

        StackPane TabOvelay = new StackPane(tabPane);
        
        StackPane.setMargin(TabOvelay, new Insets(75, 0, 0, 218));
        StackPane.setMargin(nameLabel, new Insets(0, 0, 0, 220));
      
      
        
        // Add all components to root
        root.getChildren().addAll(
            backgroundImage, 
            backgroundOverlay,
            TabOvelay ,
            nameLabel,
            buttonPanelContainer
        );
      
        
       
       fun.Responsive(scene, backgroundImage, backgroundOverlay);
        
        
        scene.getStylesheets().add(getClass().getResource("CSS/Dashboard.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.getIcons().add(fun.image("Photo/new icon/account_username.png"));
        primaryStage.show();

        

        addMemberButton.setOnAction(event -> {
            AddMember addMemberWindow = new AddMember();
            Stage newStage = new Stage();
            addMemberWindow.start(newStage);
        });

        addBookButton.setOnAction(event ->{
            AddBook addBookWindow =new AddBook();
            Stage newsStage = new Stage();
            addBookWindow.start(newsStage);
        });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}