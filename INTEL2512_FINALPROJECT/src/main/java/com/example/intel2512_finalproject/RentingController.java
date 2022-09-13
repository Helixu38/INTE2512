package com.example.intel2512_finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class RentingController {
    private Label label;

    //Textfield
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfTitle;
    @FXML
    private TextField tfrentalType;
    @FXML
    private TextField tfloanType;
    @FXML
    private TextField tfnumberCopies;
    @FXML
    private TextField tfrentalFee;
    @FXML
    private TextField tfrentalStatus;

    //Table
    @FXML
    private TableView tvMovies;
    @FXML
    private TableColumn<? , ?> colid;
    @FXML
    private TableColumn<? , ?> colTitle;
    @FXML
    private TableColumn<? , ?> colrentalType;
    @FXML
    private TableColumn<? , ?> colloanType;
    @FXML
    private TableColumn<? , ?> colnumberCopies;
    @FXML
    private TableColumn<? , ?> colrentalFee;
    @FXML
    private TableColumn<? , ?> colrentalStatus;

    @FXML
    private Button btnInsert;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnRent;



}
