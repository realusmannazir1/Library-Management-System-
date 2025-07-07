package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Programs.Function.Function;
import Programs.Function.LoginButton;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.*;

public class LoginPage extends Application {
    Function fun = new Function();

    @Override
    public void start(Stage primaryStage) {
        // Load images
        ImageView backgroundView = fun.imagev("Photo/newdark.jpg");
          ImageView iconV = fun.imagev("Photo/new icon/login.png");
        
        // Configure the logo icon
         iconV.setFitWidth(80);
        iconV.setFitHeight(80);
       
        Label logoLabel = new Label();
         logoLabel.setGraphic(iconV);
        logoLabel.setContentDisplay(ContentDisplay.CENTER);
        
        backgroundView.setFitWidth(950);
        backgroundView.setFitHeight(600);

        // Main containers
        StackPane root = new StackPane();
        StackPane BGOL = new StackPane();
         BGOL.getStyleClass().add("background-overlay");
        BGOL.setPrefHeight(600);
         BGOL.setPrefWidth(950);

        StackPane overlay = new StackPane();
        overlay.setMaxWidth(400);

        // Login form container
          VBox loginForm = new VBox(25);
        loginForm.getStyleClass().add("login-form");
        loginForm.setAlignment(Pos.CENTER);

        // Title
        Text title = new Text("Login Form");
        title.getStyleClass().add("login-title");

        // Form fields
        TextField Nfield = new TextField();
         Nfield.setPromptText("Enter username");
        Nfield.getStyleClass().add("text-field");
        PasswordField Pfield = new PasswordField();
         Pfield.setPromptText("Password");
        Pfield.getStyleClass().add("password-field");

        // Login button with icon
         ImageView imageView = fun.imagev("Photo/new icon/iconfinder-key.png");
        imageView.getStyleClass().add("login-icon");
        Button loginButton = new Button("LOGIN", imageView);
        loginButton.getStyleClass().add("login-button");
         loginButton.setContentDisplay(ContentDisplay.LEFT); 

        // Add components to form
        loginForm.getChildren().addAll(logoLabel, title, Nfield, Pfield, loginButton);

        // Build the scene
        overlay.getChildren().add(loginForm);
        root.getChildren().addAll(backgroundView, BGOL, overlay);
        
        Scene scene = new Scene(root, 950, 600);
        scene.getStylesheets().add(getClass().getResource("CSS/Login.css").toExternalForm());

        // Stage configuration
        primaryStage.getIcons().add(fun.image("Photo/new icon/account_username.png"));
         primaryStage.setScene(scene);
        primaryStage.setResizable(false);
           primaryStage.setTitle("Login Form");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();

        Nfield.setOnAction(e -> Pfield.requestFocus());

        Pfield.setOnAction(e -> loginButton.fire());
    
        


        loginButton.setOnAction(event ->{

            LoginButton login=new LoginButton();
            login.login_button(Nfield, Pfield);

          });
    }


   

    public static void main(String[] args) {
        launch(args);
    }
}