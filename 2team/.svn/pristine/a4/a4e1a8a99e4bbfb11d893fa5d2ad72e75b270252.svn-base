package ysit.student.mschool.controller;

/**
 * 학사관리>>휴학신청하는 페이지
 * @author 조나현
 * 
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RST_SCHController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> reason;  //(휴학,복학,자퇴)사유선택하는 콤보박스

    @FXML
    private ComboBox<String> date;  //(휴학,복학,자퇴)일자선택 콤보박스

    @FXML
    private TextArea textArea; //(휴학,복학,자퇴)신청내용 입력하는 창

    @FXML
    private Button btnSbmt;  //제출버튼

    @FXML
    private Button btnupdt;  //수정버튼

    @FXML
    void sbmtOnClick(ActionEvent event) {   //제출버튼클릭 시 실행

    }

    @FXML
    void updtOnClick(ActionEvent event) {  //수정버튼 클릭 시 실행

    }

    
    @FXML
    void initialize() {
    	/*ComboBox<String> combo = new ComboBox<String>();
    	combo.getItems().addAll("일반", "질병", "창업", "출산/육아","군입대");
    	combo.setValue("선택하세요");*/
    	
    	reason.getItems().addAll("일반", "질병", "창업", "출산/육아","군입대","기타");
    	reason.setValue("선택하세요");
    	
    	TextArea txtArea = new TextArea();
    	
    	//ComboBox의 선택값이 변경되었을 때 처리
    	//combo.valueProperty().addListener(new ChangeListener<String>() {
    	reason.valueProperty().addListener(new ChangeListener<String>() {
    		
    		@Override
    		public void changed(ObservableValue<? extends String> observable, 
    				String oldValue, String newValue) {
    			txtArea.setText(newValue);
    		}		
    	});
    	
    }
}
