package ysit.student.tuition.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TTN_REND2Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private TextField txtTuition;	//등록금

    @FXML
    private TextField txtSchorlarship;	//장학금

    @FXML
    private TextField txtTotal;	//총금액

    @FXML
    private Button btnRefund;	//등록금환불 버튼

    @FXML
    void refundOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
