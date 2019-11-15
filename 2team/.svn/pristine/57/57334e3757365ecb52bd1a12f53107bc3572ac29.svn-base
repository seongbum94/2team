package ysit.admin.notice.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ysit.vo.AdminVO;
import ysit.vo.LoginVO;
import ysit.vo.NoticeVO;

public class AdminNoticeReadController {

	private AdminVO loginAdm= (AdminVO)LoginVO.obj;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea noticeContent;

    @FXML
    private Button btnNotUp;

    @FXML
    private Button btnNotList;

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
    void onClickedList(ActionEvent event) {

    }

    @FXML
    void onClickedUpdate(ActionEvent event) {

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
    	
    	
    	noticeContent.setText(notVo.getNot_content());
    	noticeDate.setText(notVo.getNot_date());
    	noticeWrite.setText(loginAdm.getAdmin_name());
    	noticeCount.setText(String.valueOf(notVo.getNot_cnt()));
    	noticeTitle.setText(notVo.getNot_name());
    	
    
    }
}
