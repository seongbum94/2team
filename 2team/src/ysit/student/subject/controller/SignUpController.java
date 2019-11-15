package ysit.student.subject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> subCode;	//과목번호

    @FXML
    private TableColumn<?, ?> subName;	//과목명

    @FXML
    private TableColumn<?, ?> ProName;	//담당교수

    @FXML
    private TableColumn<?, ?> score;	// 학점

    @FXML
    private TableColumn<?, ?> dateTime;	//요일/시간

    @FXML
    private TableColumn<?, ?> subClass;	//강의실

    @FXML
    private TableColumn<?, ?> people;	//신청인원

    @FXML
    private TableColumn<?, ?> fixNum;	//정원

    @FXML
    private TableColumn<?, ?> lecturePlan;	//강의계획서

    @FXML
    private TableColumn<?, ?> semester;	//수강신청

    @FXML
    void initialize() {
      
    }
}