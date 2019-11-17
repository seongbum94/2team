package ysit.admin.tuition.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UnpaidController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnOk; // 확인 버튼 

    @FXML
    void onClickedExit(ActionEvent event) { // 확인 버튼 클릭 시 실행 메서드 
    	Stage thisForm = (Stage)btnOk.getScene().getWindow();
    	thisForm.close();
    }

    @FXML
    void initialize() {

    }
}
