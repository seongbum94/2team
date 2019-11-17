package ysit.admin.notice.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.admin.notice.main.AdminNoticeMain;
import ysit.com.login.main.LoginMain;
import ysit.vo.AdminVO;
import ysit.vo.LoginVO;
import ysit.vo.NoticeVO;

public class AdminNoticeReadController {

	private AdminVO loginAdm= (AdminVO)LoginVO.obj;
	
	private NoticeVO notVo;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea noticeContent;

    @FXML
    private Button btnNotUp; // 수정 버튼

    @FXML
    private Button btnNotList; // 목록 버튼 (나가기)

    @FXML
    private TextField noticeTitle;

    @FXML
    private TextField noticeWrite;

    @FXML
    private TextField noticeFile;

    @FXML
    private TextField noticeDate;

    @FXML
    private TextField noticeCount;

    @FXML
    void onClickedList(ActionEvent event) { // 목록으로 나가기
    	
    	Stage thisForm = (Stage)btnNotList.getScene().getWindow();
    	thisForm.close();

    }

    @FXML
    void onClickedUpdate(ActionEvent event) { // 수정버튼 클릭 시 
    	

    	// 1. stage 생성
    	Stage stage = new Stage(StageStyle.DECORATED);
    	stage.initModality(Modality.WINDOW_MODAL);
    	stage.initOwner(LoginMain.LoginMainStage);
    	
    	// 2. fxml로드 하기
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/adminUpdateNotice.fxml"));
    	try {
			Parent root = loader.load();
			
			AdminUpdateNoticeController upController = loader.getController();
			upController.showNotice2(notVo);
						
			Scene s = new Scene(root);
			stage.setScene(s);
			stage.setTitle("공지사항 수정");
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
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

    }
    
    public void showNotice(NoticeVO notVo) {
    	
    	this.notVo = notVo;
    	
    	noticeContent.setText(notVo.getNot_content());
    	noticeDate.setText(notVo.getNot_date());
    	noticeWrite.setText(loginAdm.getAdmin_name());
    	noticeCount.setText(String.valueOf(notVo.getNot_cnt()));
    	noticeTitle.setText(notVo.getNot_name());
    	
    
    }
}
