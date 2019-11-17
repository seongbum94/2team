package ysit.student.mainPage.controller;

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
import ysit.vo.LoginVO;
import ysit.vo.StudentVO;

public class StuMainPageController {
	private StudentVO loginStu = (StudentVO)LoginVO.obj;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane studentMain;

    @FXML
    private TitledPane notice;  //공지사항

    @FXML
    private Label noticeId;  //공지사항 게시판 선택

    @FXML
    private Label jobNoticeId;  //취업정보 게시판 선택

    @FXML
    private TitledPane student;  //학사관리

    @FXML
    private Label InfoSearch;  //신상정보 조회 선택

    @FXML
    private Label StuChange;   //학적변동 신청 선택

    @FXML
    private Label cancelChange;   //학적변동 취소 선택

    @FXML
    private Label gradeSearch;  //성적조회 선택

    @FXML
    private TitledPane classMsg;  //수업 관리

    @FXML
    private Label classApply;  //수강신청 선택

    @FXML
    private Label classCancel;   //수강철회 선택

    @FXML
    private Label searchClass;  //개설과목 조회 선택

    @FXML
    private Label searchTimeTable;  //시간표조회 선택

    @FXML
    private Label AttSearch;  //출결조회 선택

    @FXML
    private Label evaluvation;  //수강과목 강의평가 선택

    @FXML
    private Label gvpScore;  //학점포기신청 선택

    @FXML
    private TitledPane tuitionMsg;  //등록금 관리

    @FXML
    private Label insertTui;  //등록금 납부 선택

    @FXML
    private Label reTui;  //등록금 환불 선택

    @FXML
    private TitledPane counsel;  //상담 신청

    @FXML
    private Label conApply;  //상담 신청 선택

    @FXML
    private Label opening;  //님 환영합니다 라벨

    @FXML
    private Label loginMsg;  //(으)로 로그인하셨습니다 라벨

    @FXML
    private Button btnLogOut;  //로그아웃 버튼

    @FXML
    private HBox hbox;

    @FXML
    private TextField txtName;  //이름

    @FXML
    private TextField txtStuId;  //학번

    @FXML
    private TableView<?> timetable;  //시간표

    @FXML
    private ListView<?> noticePage;  //공지사항

    @FXML
    void classClick(MouseEvent event) {   //수업관리 탭

    }

    @FXML
    void clickAtt(MouseEvent event) {  //출결조회 선택

    }

    @FXML
    void clickCancelclass(MouseEvent event) {  //수강철회 선택

    }

    @FXML
    void clickChange(MouseEvent event) {  //학적변동 신청 선택

    }

    @FXML
    void clickChangeCancel(MouseEvent event) { //학적변동 취소 선택

    }

    @FXML
    void clickClassApply(MouseEvent event) { //수강신청 선택

    }

    @FXML
    void clickCounsel(MouseEvent event) { //상담신청 탭

    }

    @FXML
    void clickCounselApply(MouseEvent event) { //상담신청 선택

    }

    @FXML
    void clickEvaluation(MouseEvent event) { //수강과목 강의평가 선택

    }

    @FXML
    void clickGvp(MouseEvent event) {  //학점포기신청 선택

    }

    @FXML
    void clickInfo(MouseEvent event) { //신상정보 조회 선택

    }

    @FXML
    void clickInsertThi(MouseEvent event) { //등록금 납부 선택

    }

    @FXML
    void clickJob(MouseEvent event) throws IOException {
    	  Parent studentEmp = FXMLLoader.load(getClass().getResource("../../emp/fxml/empBoard.fxml"));
    	  studentMain.setCenter(studentEmp);
    }

    @FXML
    void clickNotice(MouseEvent event) throws IOException {
    	Parent studentEmp = FXMLLoader.load(getClass().getResource("../../notice/fxml/notice.fxml"));
    	studentMain.setCenter(studentEmp);
    }

    @FXML
    void clickReTui(MouseEvent event) { //등록금 환불 선택

    }

    @FXML
    void clickSearchClass(MouseEvent event) { //개설과목 조회 선택

    }

    @FXML
    void clickSearchGrade(MouseEvent event) { //성적조회 선택

    }

    @FXML
    void clickTimeTable(MouseEvent event) { //시간표조회 선택

    }

    @FXML
    void clickTuition(MouseEvent event) { //등록금 관리 탭

    }

    @FXML
    void logOutOnClick(ActionEvent event) { //로그아웃버튼

    }

    @FXML
    void noticeClick(MouseEvent event) {  //공지사항 탭

    }

    @FXML
    void studyClick(MouseEvent event) {  //학사관리 탭

    }

    @FXML
    void initialize() {
    	opening.setText(loginStu.getStu_name()+"님 환영합니다.");
    	loginMsg.setText("학생(으)로 로그인 하셨습니다.");
    }
}
