package ysit.professor.mainPage.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import ysit.vo.AdminVO;
import ysit.vo.LoginVO;
import ysit.vo.ProfessorVO;

public class ProMainPageController {
	private ProfessorVO loginPro= (ProfessorVO)LoginVO.obj;
	
    @FXML
    private BorderPane ProMainBorder;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TitledPane notice;  //공지사항

    @FXML
    private Label noticeId;  //공지사항게시판 선택

    @FXML
    private Label jobNoticeId;  //취업정보게시판 선택

    @FXML
    private TitledPane attendance;  //출결관리

    @FXML
    private Label attendanceLabel;  //출결관리 선택

    @FXML
    private TitledPane student;  //학생관리
    
    @FXML
    private Label studentLabel;  //학생관리 선택

    @FXML
    private Label counselLabel;  //상담관리 선택

    @FXML
    private TitledPane classMng;  //수업관리

    @FXML
    private Label classOpCl;  //강의개설,폐강 선택

    @FXML
    private TableView<?> timetable;  //시간표 관리

    @FXML
    private Label classList;  //강의목록 선택

    @FXML
    private TitledPane evluation;  //강의평가 조회

    @FXML
    private Label evluationLabel;  //과목별 강의평가 선택

    @FXML
    private ListView<?> noticePage;  //공지사항

    @FXML
    private TextField txtName;  //이름

    @FXML
    private TextField txtStuId;  // 사번

    @FXML
    private Label opening;  //님 환영합니다 라벨

    @FXML
    private Label loginMsg;  //(으)로 로그인 하셨습니다 라벨

    @FXML
    private Button btnLogOut;  //로그아웃버튼
    
    @FXML
    private HBox hbox;
    
    @FXML
    void attendanceClick(MouseEvent event) {

    }

    @FXML
    void attendanceLabelClick(MouseEvent event) {

    }

    @FXML
    void classListClick(MouseEvent event) {

    }

    @FXML
    void classMngClick(MouseEvent event) {

    }

    @FXML
    void classOpClClick(MouseEvent event) {

    }

    @FXML
    void clickJob(MouseEvent event) {

    }

    @FXML
    void clickNotice(MouseEvent event) {

    }

    @FXML
    void counselLabelClick(MouseEvent event) throws IOException {
    	Parent ProCounsel = FXMLLoader.load(getClass().getResource("../../counsel/fxml/FxmlCounsel.fxml"));
    	ProMainBorder.setCenter(ProCounsel);
    }

    @FXML
    void evluationClick(MouseEvent event) {

    }

    @FXML
    void evluationLabelClick(MouseEvent event) {

    }

    @FXML
    void logOutOnClick(ActionEvent event) {

    }

    @FXML
    void noticeClick(MouseEvent event) {

    }

    @FXML
    void studentClick(MouseEvent event) {

    }

    @FXML
    void studentLabelClick(MouseEvent event) {

    }

    @FXML
    void initialize() {
    	opening.setText(loginPro.getPro_name()+"님 환영합니다.");
    	loginMsg.setText("교수(으)로 로그인 하셨습니다.");
    }
}
