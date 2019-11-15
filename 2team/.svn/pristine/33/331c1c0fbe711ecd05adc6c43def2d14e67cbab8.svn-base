package ysit.admin.apply.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import ysit.admin.apply.service.ApplyServiceImpl;
import ysit.admin.apply.service.IApplyService;
import ysit.com.alert.AlertController;


// 재적신청 반려창
public class ManageApplyFormController {
	
	private ApplyDropController mainController;
	
	public void setMainController(ApplyDropController mainApplyDropController) {
		this.mainController = mainApplyDropController;
	}

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtFStuName;		     // 학생이름	
	    
	    @FXML
	    private TextField txtFStuId;		     // 학번

	    @FXML
	    private TextField txtFStuApplydate;		// 신청일자

	    @FXML
	    private TextArea txtAReject;			// 반려사유

	    @FXML
	    private Button btnOk;					// 작성 버튼

	    @FXML
	    private Button btnCancel;				// 취소 버튼

	    
	    
	    
	    // 버튼 이벤트--------------------------------------------
	    
	    
	    // 작성(저장)
	    @FXML
	    void btnOkClicked(ActionEvent event) {	
	   
	    	Stage thisForm = (Stage) btnOk.getScene().getWindow();
	    
	    	
	    	// 글자 200자 이내
	    	// 내용이 없을경우 오류창 띄우기
	    	int length = txtAReject.getText().length();
	    	if(length==0 || length>200 || txtAReject.getText()==null) {
	    		AlertController.warnning("내용오류", "공백이거나 200자 이내로 작성해주세요.");
	    		
	    	}else {
	    		// 반려사유 DB에 Update하기
	    		ShareData.shareMap.put("app_res_rejection",txtAReject.getText());		// 반려사유
	    		int cnt = service.updateReject(ShareData.shareMap);
	    		
	    		if(cnt>0) {	// 업데이트 성공!!
    				AlertController.info("처리결과", "자퇴 반려 처리가 완료됐습니다.");
    				thisForm.close();
    				// 테이블 뷰에 다시 출력하기
    	    		mainController.setTableViewData();
    	    		//mainController.changeTableView(ShareData.currentIndex);
    				
    			}else {
    				AlertController.warnning("처리결과", "자퇴 반려 실패..전산팀에 문의하세요.");
    			}

	    	}
	    }


	    
	    // 취소
	    @FXML
	    void btnCancelClicked(ActionEvent event) {
	    	// 창 닫기를 하려면 현재 Stage객체를 얻어야 한다.
	    	// javaFx의 컨트롤 객체를 이용하여 Stage객체를 구할 수 있다.
	    	Stage thisForm = (Stage) btnCancel.getScene().getWindow();
	    	thisForm.close();
	    }


	    private IApplyService service;
	    @FXML
	    void initialize() {
	    	service = ApplyServiceImpl.getInstance();
	    	// 학생이름, 학번, 신청일자, 반려사유 DB에서 정보 가져오기
	    	
	    	// System.out.println("반려창: " + ShareData.shareMap.get("stu_name"));  // 확인용
	    	String stu_name = ShareData.shareMap.get("stu_name");
			// stu_name, stu_id, app_date
	    	txtFStuName.setText(stu_name);
	    	txtFStuId.setText(ShareData.shareMap.get("stu_id"));
	    	txtFStuApplydate.setText(ShareData.shareMap.get("app_date"));

	    }

}
