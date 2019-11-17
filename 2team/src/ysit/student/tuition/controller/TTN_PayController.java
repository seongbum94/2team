package ysit.student.tuition.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TTN_PayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private TextField txtTuition;  //등록금 금액

    @FXML
    private TextField txtSchorlarship;  //장학금 금액

    @FXML
    private TextField txtTotal;  //총 합계 금액

    @FXML
    private Button btnPay;  //등록금 납부 버튼

    @FXML
    void payOnClick(ActionEvent event) { //등록금 납부 버튼 실행

    }

    @FXML
    void initialize() {

    }
}

