package ysit.professor.subject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

public class ProSubAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField subName;	// 과목명

    @FXML
    private Button btnCreate;	//개설버튼

    @FXML
    private TextField subId;	//과목코드

    @FXML
    private ComboBox<?> gubun;	//구분

    @FXML
    private Button curriculum;	//강의계획서업로드

    @FXML
    private ComboBox<?> subDate;	// 요일

    @FXML
    private ComboBox<?> subTime;	//교시

    @FXML
    private ComboBox<?> fixPeople;	//정원

    @FXML
    private TextArea txtArea;	//비고

    @FXML
    void addClicked(ActionEvent event) {

    }

    @FXML
    void clicked(ActionEvent event) {

    }

    @FXML
    void combo1(ActionEvent event) {

    }

    @FXML
    void combo2(ActionEvent event) {

    }

    @FXML
    void combo3(ActionEvent event) {

    }

    @FXML
    void combo4(ActionEvent event) {

    }

    @FXML
    void inputTxt(InputMethodEvent event) {

    }

    @FXML
    void onClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {
      
    }
}
