package ysit.student.counsel.controller;

import java.awt.image.ConvolveOp;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import ysit.student.counsel.service.CounselServiceImpl;
import ysit.student.counsel.service.ICounselService;
import ysit.vo.CounselVO;
/**
 * 상담신청 1번화면에서 2번화면으로 넘어가는 컨트롤러
 * @author 민영
 *
 */
public class CalAplController {
	private ICounselService service;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtArea; 	//상담요청내용

    @FXML
    private ComboBox<String> selectCon;   //상담유형선택

    @FXML
    private Button btnReserve;	//예약하기버튼

    @FXML
    private Button btnCancel;	//취소버튼

    @FXML
    void SelectCombo(ActionEvent event) {	//콤보박스선택

    }
    
    @FXML
    void onClickedCancel(ActionEvent event) {	
    	Platform.exit();
    }

    @FXML
    void onClickedRes(ActionEvent event) {
    	CounselVO conVo = new CounselVO();
    	conVo.setCoun_id("014");
    	conVo.setStu_id("20115085");
    	conVo.setPro_id("19970002");
    	conVo.setCoun_type("진로");
    	conVo.setCoun_date("19/11/14");
    	conVo.setCoun_content("이정민좀 집에보내주세요..");
    	service.insertCon(conVo);
    }

    @FXML
    void initialize() {
    	service = CounselServiceImpl.getInstance();
    	
    	ObservableList<String> dataList = FXCollections.observableArrayList(
    			"자퇴상담","휴학상담", "기타상담");
        //reason.setValue("선택하세요");
    	selectCon.setItems(dataList);
        TextArea txtArea = new TextArea();
        
        //ComboBox의 선택값이 변경되었을 때 처리
        selectCon.valueProperty().addListener(new ChangeListener<String>() {
        //combo.valueProperty().addListener(new ChangeListener<String>() {
           
           @Override
           public void changed(ObservableValue<? extends String> observable, 
                 String oldValue, String newValue) {
              txtArea.setText(newValue);
           }
           
        });
    	
    }
}
