package ysit.admin.mprofessor.controller;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import ysit.admin.mprofessor.service.IMProfessorService;
import ysit.admin.mprofessor.service.MProfessorServiceImpl;
import ysit.com.alert.AlertController;
import ysit.vo.ProfessorVO;


// 교수 수정 
public class ModifyProfessorController {

	private MngProfessorController mainController;
	
	public void setMainController(MngProfessorController mainMngProfessorController) {
		this.mainController = mainMngProfessorController;
	}
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtFProAddr;								// 교수 주소

    @FXML
    private TextField txtFMajorName;							// 학과명

    @FXML
    private TextField txtFProName;								// 교수 이름

    @FXML
    private TextField txtFProPosition;							// 교수 직위

    @FXML
    private TextArea txtAProCareer;								// 교수 경력사항

    @FXML
    private TextField txtFProEducation;							// 교수 학력사항

    @FXML
    private TextField txtFProBir;							    // 교수 생년월일

    @FXML	
    private TextField txtFProAppointmentDate;					// 교수 임용날짜

    @FXML
    private TextField txtFProId;								// 교수 교번

    @FXML
    private TextField txtFProPass;								// 교수 비밀번호

    @FXML
    private TextField txtProEmail1;								// 교수 이메일1

    @FXML
    private TextField txtProEmail2;								// 교수 이메일2
    
    
    
    
    @FXML
    private ImageView imgView;									// 이미지뷰

    @FXML
    private Button btnModifyImg;								// 교수사진변경 버튼

    @FXML
    private Button btnDelImg;									// 교수사진삭제 버튼

    @FXML
    private Button btnModity;									// 정보수정 버튼

    @FXML
    private Button btnCancel;									// 정보삭제 버튼

    
    private IMProfessorService service;
    private String inputFilePath = "d:\\upload\\";				// 파일 읽어오기....
    private String inputFileName;
    
    
    // 버튼이벤트
    @FXML
    void btnCancelClicked(ActionEvent event) {
    	// 창 닫기를 하려면 현재 Stage객체를 얻어야 한다.
    	// javaFx의 컨트롤 객체를 이용하여 Stage객체를 구할 수 있다.
    	Stage thisForm = (Stage) btnCancel.getScene().getWindow();
    	thisForm.close(); 

    }

    @FXML
    void btnDelImgClicked(ActionEvent event) { // 이미지 삭제
    	
    	if(imgView.imageProperty().get()==null) {
    		AlertController.warnning("오류", "등록된 사진이 없습니다.");
    		return;
    	}
    	imgView.imageProperty().set(null);

    }
    
    

    @FXML
    void btnModifyImgClicked(ActionEvent event) {	// 이미지 교체

    }

    @FXML
    void btnModityClicked(ActionEvent event) {	     // 수정버튼 
    
    	
    	//index = tableView.getSelectionModel().getSelectedIndex();
    ////System.out.println("Controller pro_id: " + tableView.getSelectionModel().getSelectedItem().getPro_id());
    //
    //int cnt = service.removePro(tableView.getSelectionModel().getSelectedItem().getPro_id());
    //
    //if(cnt>0) {
//    	AlertController.info("처리결과", "해당 교수 삭제가 완료되었습니다.");
//    	setTableViewData();
    //}else {
//    	AlertController.warnning("처리결과", "교수 삭제 실패..전산팀에 문의하세요.");

    }

    @FXML
    void initialize() {
    	// 등록된 이미지 불러오기
    	service = MProfessorServiceImpl.getInstance();
    	
    	// 공유데이터 이용
    	// 이미지
    	String photo = ShareDate.shareProVO.getPro_photo();
    	
    	if(photo !=null) {
    		//File setImg = new File(photo);
    		//Image img = new Image(setImg.toURL().toURI(), )
    		System.out.println("사진변경 photo : " + photo);
    		
    	}

    	
    	
    	//if(!setImg.exists()) {	// DB에 사진경로가 없다면...
    	//	imgView.imageProperty().set(null);
    	//}
    	
    	//imgView.setImage(setImg);
    	
    	
    	
    	txtFProId.setText(ShareDate.shareProVO.getPro_id());
    	txtFProPass.setText(ShareDate.shareProVO.getPro_pass());
    	txtFProName.setText(ShareDate.shareProVO.getPro_name());
    	txtFProBir.setText(ShareDate.shareProVO.getPro_bir());
    	String[] email = ShareDate.shareProVO.getPro_mail().split("@");
    	txtProEmail1.setText(email[0]);
    	txtProEmail2.setText(email[1]);
    	txtFProAddr.setText(ShareDate.shareProVO.getPro_addr());
    	txtFProEducation.setText(ShareDate.shareProVO.getPro_edu());
    	txtAProCareer.setText(ShareDate.shareProVO.getPro_car());
    	txtFProAppointmentDate.setText(ShareDate.shareProVO.getPro_appointment_date());
    	txtFMajorName.setText(ShareDate.shareProVO.getMajor_name());
    	txtFProPosition.setText(ShareDate.shareProVO.getPro_position());
    	
     

    }
}
