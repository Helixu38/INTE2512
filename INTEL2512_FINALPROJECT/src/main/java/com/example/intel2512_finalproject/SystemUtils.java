package com.example.intel2512_finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SystemUtils {
    static RentSystem rentSystem = new RentSystem();
    public static void changeScene(ActionEvent event , String fxmlFile , String title , String username ,String name, String address , String phoneNumber , String accountType){
        Parent root = null;

        if(username != null && address != null && phoneNumber != null && accountType != null){
            try {
                FXMLLoader loader = new FXMLLoader(SystemUtils.class.getResource(fxmlFile));
                root = loader.load();
                AfterLoginController afterLoginController = loader.getController();
                afterLoginController.setUserInformation(name , address , phoneNumber , accountType , username);

            } catch (IOException e ){
                e.printStackTrace();
            }
        } else {
            try{
                root = FXMLLoader.load(SystemUtils.class.getResource(fxmlFile));

            }   catch (IOException e){
                    e.printStackTrace();

            }

        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle((title));
        stage.setScene(new Scene(root, 600 , 400));
        stage.show();
    }

    public static void signUpUser(ActionEvent event , String name , String address ,String phoneNumber , String username , String password){

        rentSystem.addUser(name, address, phoneNumber, username, password);
    }

    public static void loginUser(ActionEvent event , String username , String password){

        rentSystem.loginUser(username , password);

    }
}
