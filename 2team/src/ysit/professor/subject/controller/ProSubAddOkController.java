package ysit.professor.subject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProSubAddOkController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnOk;

    @FXML
    void Clicked(ActionEvent event) {
    	Stage stage = (Stage) btnOk.getScene().getWindow();  
    	stage.close();  
    }

    @FXML
    void initialize() {

    }
}
