package ysit.student.emp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import ysit.student.emp.service.EmpServiceImpl;
import ysit.student.emp.service.IEmpService;
import ysit.vo.EmpVO;

public class empNoticeReadController {
	private IEmpService service;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane borderPane; // 껍데기

    @FXML
    private TextArea noticeContent; //글내용

    @FXML
    private Button btnOk;	// 확인버튼

    @FXML
    private TextField noticeTitle;	//게시글제목

    @FXML
    private TextField noticeWrite;	//게시글 작성자

    @FXML
    private TextField noticeFile;	//파일첨부

    @FXML
    private TextField noticeDate;	//작성일

    @FXML
    private TextField noticeCount;	//조회수

    @FXML
    void onClickedOk(ActionEvent event) {
    	Stage thisForm = (Stage)btnOk.getScene().getWindow();
        thisForm.close();
    }

    @FXML
    void onCountField(ActionEvent event) {

    }

    @FXML
    void onDateField(ActionEvent event) {

    }

    @FXML
    void onFileField(ActionEvent event) {

    }

    @FXML
    void onTitleField(ActionEvent event) {

    }

    @FXML
    void onWriteField(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	
    	service = EmpServiceImpl.getInstance();
    	service.incCnt(EmpVO.emp);
    	EmpVO.emp = service.getEmp(EmpVO.emp);
    	
    	noticeTitle.setText(EmpVO.emp.getEmp_notice_name());
    	noticeWrite.setText(EmpVO.emp.getAdmin_name());
    	noticeContent.setText(EmpVO.emp.getEmp_content());
    	noticeDate.setText(EmpVO.emp.getEmp_date());
    	noticeFile.setText(EmpVO.emp.getEmp_addcontent());
    	noticeCount.setText(Integer.toString(EmpVO.emp.getEmp_cnt()));
    	
    	
    	
    }
}