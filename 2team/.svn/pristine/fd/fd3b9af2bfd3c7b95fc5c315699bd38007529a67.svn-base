package ysit.admin.notice.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ysit.vo.AdminVO;
import ysit.vo.LoginVO;
import ysit.vo.NoticeVO;

public class AdminUpdateNoticeController {
	
	private AdminVO loginAdm= (AdminVO)LoginVO.obj;
	
	private NoticeVO notVo;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField noticeTitle; // 제목 필드

    @FXML
    private TextField fileTextField; // 첨부파일 필드

    @FXML
    private Button btnSearch; // 찾기 버튼

    @FXML
    private TextArea noticeContent; // 내용 필드

    @FXML
    private Button btnUpdateNot; // 수정 버튼
    

    @FXML
    private Button btnExit; // 취소 버튼 
    

    @FXML
    void onClickedExit(ActionEvent event) { // 취소 버튼 클릭 시 
    	
    	Stage thisForm = (Stage)btnExit.getScene().getWindow();
    	thisForm.close();
    }

    @FXML
    void insertFile(ActionEvent event) {

    }

    @FXML
    void insertTitle(ActionEvent event) {

    }

    @FXML
    void onClickedFile(ActionEvent event) {

    }

    @FXML
    void updateNotice(ActionEvent event) { // 수정 버튼 클릭 시 

    }
    
    

    @FXML
    void initialize() {
    	
    }
    
    public void showNotice2 (NoticeVO notVo) {
    	this.notVo = notVo;
    	
    	noticeContent.setText(notVo.getNot_content());
    	fileTextField.setText(notVo.getNot_addcontent());
    	noticeTitle.setText(notVo.getNot_name());
    	
    
    }
}
