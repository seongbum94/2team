package ysit.student.counsel.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.vo.EmpVO;

public class AplOkController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnNo;

    @FXML
    void clickNo(ActionEvent event) {
    	Stage thisForm = (Stage)btnOk.getScene().getWindow();
        thisForm.close();
    }

    @FXML
    void clickOk(ActionEvent event) {
   
    		try {
    	    	Stage myStage = new Stage(StageStyle.DECORATED);
    	        myStage.initModality(Modality.WINDOW_MODAL);
    	        Parent root = null;
    			root = FXMLLoader.load(getClass().getResource("../fxml/CalApl.fxml"));
    			Scene scene = new Scene(root);
    			myStage.setScene(scene);
    			myStage.show();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    }

    @FXML
    void initialize() {
        
    }
}
