package ysit.admin.notice.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ysit.admin.notice.main.AdminNoticeMain;
import ysit.admin.notice.serivce.INoticeService;
import ysit.admin.notice.serivce.NoticeServiceImpl;
import ysit.com.alert.AlertController;
import ysit.vo.AdminVO;
import ysit.vo.LoginVO;
import ysit.vo.NoticeVO;

public class AdminAddCommentController {
	
	private AdminVO loginAdm= (AdminVO)LoginVO.obj;
	
	private INoticeService service;
	
	private AdminNoticeController mainController;
	
	public void setMainController(AdminNoticeController mainController) {
		this.mainController = mainController;
	}
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField noticeTitle; // 제목 입력 필드

    @FXML
    private TextField fileTextField; // 첨부파일 필드

    @FXML
    private Button btnSearch; // 첨부파일 찾기 버튼

    @FXML
    private TextArea noticeContent; // 공지사항 내용 입력

    @FXML
    private Button btnNoticeWrite; // 공지사항 등록 버튼
    
    @FXML
    private Button btnExit; // 취소 버튼 
    

    @FXML
    void onClickedExit(ActionEvent event) { // 취소 버튼 클릭 시 
    	
    	Stage thisForm = (Stage)btnExit.getScene().getWindow();
    	thisForm.close();
    }


    @FXML
    void insertFile(ActionEvent event) { // 첨부파일 삽입시 실행 메서드

    }


    
    @FXML
    void insertNotice(ActionEvent event) {  // 등록 버튼 실행시 
    	
    	String title = noticeTitle.getText();
    	String content = noticeContent.getText();
    	
    	if(title.isEmpty()) {
    		AlertController.warnning("입력 오류", "제목을 입력해주세요.");
    		noticeTitle.requestFocus();
    		return;
    	}
    	
    	if(content.isEmpty()) {
    		AlertController.warnning("입력 오류", "내용을 입력해주세요.");
    		noticeContent.requestFocus();
    		return;
    	}
    	
    	NoticeVO notvo = new NoticeVO();
    	notvo.setAdmin_id(loginAdm.getAdmin_id());
    	//notvo.setAdmin_id("20190001");
    	notvo.setNot_name(title);
    	notvo.setNot_content(content);

    	
    	boolean cnt = service.insertNotice(notvo);
    	Stage thisForm = (Stage)btnNoticeWrite.getScene().getWindow();
    	
    	
    	
    	if(cnt==true) {
    		mainController.setTableViewData();
    		AlertController.info("새 글 등록 완료", title + "게시글이 등록 되었습니다.");
    		thisForm.close();
    	} else {
    		AlertController.info("새 글 등록 실패", title + "게시글 등록을 실패했습니다.");
    	}
    	noticeTitle.clear();
    	noticeContent.clear();
    	
    
    	
    	
    }

    
    
    @FXML
    void insertTitle(ActionEvent event) {
    	
    }

    @FXML
    void onClickedFile(ActionEvent event) {

    }



    @FXML
    void initialize() {
    	service = NoticeServiceImpl.getInstance();
    }
    
    
}
