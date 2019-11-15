package ysit.student.subject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;

public class GVU_CRDController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> aplYear;	//신청년도

    @FXML
    private ComboBox<?> aplSem;		//신청학기

    @FXML
    private TableColumn<?, ?> check;	//선택

    @FXML
    private TableColumn<?, ?> year;	//이수년도

    @FXML
    private TableColumn<?, ?> semester;	  //이수학기

    @FXML
    private TableColumn<?, ?> subCode;	//교과목코드

    @FXML
    private TableColumn<?, ?> subName;	//교과목명

    @FXML
    private TableColumn<?, ?> grade;	//등급

    @FXML
    private TableColumn<?, ?> score;	//점수

    @FXML
    private TableColumn<?, ?> totalScore;	//총점

    @FXML
    private TableColumn<?, ?> avgScore;	//평점
    
    @FXML
    private TableColumn<?, ?> semYear;	//이수년도

    @FXML
    private Button btnGvu;	//포기신청버튼

    @FXML
    private Button btnCancel;	//신청취소버튼

    @FXML
    void GvuOnClick(ActionEvent event) {

    }

    @FXML
    void cancelOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
