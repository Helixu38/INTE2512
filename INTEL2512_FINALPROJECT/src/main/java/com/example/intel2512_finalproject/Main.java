package com.example.intel2512_finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("MovieRent");
        stage.setScene(scene);
        stage.show();
    }
        public void changeScene(String fxml ) throws  IOException{
            Parent pane = FXMLLoader.load(getClass().getResource(fxml));
            stg.getScene().setRoot(pane);


    }


    public static void main(String[] args) {
        RentSystem rentSystem = new RentSystem();
//        rentSystem.displayItem();
        launch();
//        rentSystem.displayCustomer();
    }
}