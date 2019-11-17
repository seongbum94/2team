package ysit.student.tuition.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ysit.com.alert.AlertController;

public class TTN_RFNDController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private ComboBox<String> comboBank;  //환불계좌 은행명

    @FXML
    private TextField txtAccountNum;  //환불계좌번호

    @FXML
    private TextField txtAccountHolder; //환불계좌예금주

    @FXML
    private Button btnApply;  //환불신청 버튼

    @FXML
    void applyOnClick(ActionEvent event) { //환불버튼 실행
    	String content = txtAccountNum.getText();
    	
    	if(content.isEmpty()) {
    		AlertController.warnning("입력 오류", "계좌번호를 입력해주세요.");
    		txtAccountNum.requestFocus();
    		return;
    	}
    	
    	String content2 = txtAccountHolder.getText();
    	
    	if(content2.isEmpty()) {
    		AlertController.warnning("입력 오류", "예금주를 입력해주세요.");
    		txtAccountHolder.requestFocus();
    		return;
    	}
    }

    @FXML
    void initialize() {
    	comboBank.getItems().addAll("신한은행");
    	comboBank.setValue("선택하세요");
    	
    }
}

