package ysit.com.login.controller;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.mail.MessagingException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import ysit.api.SendEmail;
import ysit.com.alert.AlertController;
import ysit.com.login.service.ILoginService;
import ysit.com.login.service.LoginServiceImpl;
import ysit.vo.ProfessorVO;
import ysit.vo.StudentVO;

public class PassWordController {
	ILoginService service = LoginServiceImpl.getInstance();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton stuRadio;

    @FXML
    private ToggleGroup Member;

    @FXML
    private RadioButton proRadio;

    @FXML
    private TextField tfId;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfEmail;

    @FXML
    private Label txtCode;

    @FXML
    private TextField tfCode;

    @FXML
    private Button btnCert;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnCancel;

    @FXML
    void onClickCancel(ActionEvent event) {

    }

    @FXML
    void onClickCert(ActionEvent event) {
    	
    	if(tfId.getText().isEmpty() || tfEmail.getText().isEmpty() || tfName.getText().isEmpty()) {
    		AlertController.warnning("정보 입력", "모두 입력하세요!");
    		return;
    	}
    	
    	int grant = (int)Member.getSelectedToggle().getUserData();
    	
    	Object obj = null;
    	
    	SendEmail send = new SendEmail();
    	if(grant == 2) {
    		StudentVO stuVO = new StudentVO();
    		stuVO.setStu_id(tfId.getText());
        	stuVO.setStu_name(tfName.getText());
        	stuVO.setStu_mail(tfEmail.getText());
    		obj = service.getUserEmail(stuVO, grant);
    	} else if(grant == 3) {
    		ProfessorVO proVO = new ProfessorVO();
    		proVO.setPro_id(tfId.getText());
        	proVO.setPro_name(tfName.getText());
        	proVO.setPro_mail(tfEmail.getText());
    		obj = service.getUserEmail(proVO, grant);
    	}
    	
    	if(obj == null) {
    		AlertController.warnning("", "일치하는 회원의 정보가 없습니다.");
    		return;
    	}
    	
    	tfCode.setDisable(false);
    	try {
			send.sendEmail(tfEmail.getText());
		} catch (UnsupportedEncodingException | MessagingException e) {
			AlertController.warnning("이메일 오류","이메일 전송 오류");
		}
    }

    @FXML
    void onClickOk(ActionEvent event) {
    	if(tfCode.getText().equals(SendEmail.code)) {
//    		AlertController.info("아이디 찾기", "비밀번호는 : " +  + " 입니다.";
    	}
    }

    @FXML
    void initialize() {
    	proRadio.setUserData(3);
    	proRadio.setToggleGroup(Member);
    	
    	stuRadio.setUserData(2);
    	stuRadio.setToggleGroup(Member);
    }
}
