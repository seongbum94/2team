package ysit.professor.attend.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Pro_att_contentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> combo;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextArea Content;
    
    @FXML
    void onClick(ActionEvent event) {
    }
    
    @FXML
    void initialize() {
       List<String> content = new ArrayList<String>();
       content.add("질병결석");
       content.add("기타결석");
       content.add("미인정결석");
       ObservableList<String> dataList = FXCollections.observableList(content);
       combo.setItems(dataList);
    }
}