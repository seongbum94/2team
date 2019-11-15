package ysit.student.grade.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;

public class STD_AllGradeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> comboYear;	//조회학기선택

    @FXML
    private TableColumn<?, ?> year;		//학년

    @FXML
    private TableColumn<?, ?> semester;	//학기

    @FXML
    private TableColumn<?, ?> subCode;	//과목코드

    @FXML
    private TableColumn<?, ?> subName;	//과목명

    @FXML
    private TableColumn<?, ?> grade;	//등급

    @FXML
    private TableColumn<?, ?> score;	//점수

    @FXML
    private TableColumn<?, ?> totalScore;	//총점

    @FXML
    private TableColumn<?, ?> avgScore;	//평점

    @FXML
    void initialize() {
       

    }
}