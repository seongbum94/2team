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
import javafx.stage.Stage;
import ysit.student.counsel.service.CounselServiceImpl;
import ysit.student.counsel.service.ICounselService;
import ysit.vo.CounselVO;
import ysit.vo.EmpVO;
/**
 * 상담신청 1번화면에서 2번화면으로 넘어가는 컨트롤러
 * @author 민영
 *
 */
public class CalAplController {
	private ICounselService service;
	ObservableList<CounselVO> data;
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
    	List<CounselVO> conList;
    	if (selectCon.getValue().equals("자퇴상담")) {
    		//conList = service. 	
    		//data.clear();
    		//data = FXCollections.observableArrayList(conList);
    		//tableView.setItems(data);
		}
    	
    	   
    	
    }
    
    @FXML
    void onClickedCancel(ActionEvent event) {	
    	Stage thisForm = (Stage)btnCancel.getScene().getWindow();
        thisForm.close();
    }

    @FXML
    void onClickedRes(ActionEvent event) {
    	
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
