package ysit.admin.mprofessor.controller;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import ysit.admin.apply.controller.ApplyDropController;
import ysit.admin.apply.service.IApplyService;
import ysit.admin.mprofessor.dao.MProfessorDaoImpl;
import ysit.admin.mprofessor.main.MProfessorMain;
import ysit.admin.mprofessor.service.IMProfessorService;
import ysit.admin.mprofessor.service.MProfessorServiceImpl;
import ysit.com.alert.AlertController;
import ysit.com.regex.RegEx;

public class  AddProfessorController{

private MngProfessorController mainController;
	
	public void setMainController(MngProfessorController mainMngProfessorController) {
		this.mainController = mainMngProfessorController;
	}
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    // 뷰--------------------------------------------------------------------
    @FXML
    private ImageView imgView;							// 이미지뷰

    
    @FXML
    private TextField txtFProId;						// 교번(임용년도 + 0001) 순차적 8자리

    @FXML
    private TextField txtFProPass;						// 교수 비밀번호(생년월일 8자리)
    
    @FXML
    private TextField txtFProName;						// 교수 이름

    @FXML
    private TextField txtFProBir;						// 교수 생년웡일
    
    @FXML
    private TextField txtProEmail1;						// 이메일1

    @FXML
    private TextField txtProEmail2;						// 이메일2
    
    @FXML
    private TextField txtFProAddr;						// 교수 주소
    
    @FXML
    private TextField txtFProEducation;					// 교수 학력사항
    
    @FXML
    private TextArea txtAProCareer;						// 교수 경력사항

    @FXML
    private TextField txtFProAppointmentDate;			// 교수 임용날짜

    @FXML
    private TextField txtFMajorName;					// 학과명

    @FXML
    private TextField txtFProPosition;					// 교수 직급

    
    // 버튼--------------------------------------------------------------------
    @FXML
    private Button btnAddImg;							// 사진추가 버튼

    @FXML
    private Button btnDelImg;							// 사진삭제 버튼
    
    
    @FXML
    private Button btnInsert;							// 등록 버튼

    @FXML
    private Button btnCancel;							// 취소 버튼

    private IMProfessorService service;
    
    // 파일
    private String filePath;
    
    // 버튼 이벤트 --------------------------------------------------------------------
    
    // 이미지 추가 버튼 이벤트
    @FXML
    void btnAddImgClicked(ActionEvent event) {
    	// File Open Dialog 창  -------------------------------------
    	FileChooser fileChooser = new FileChooser();
    	
    	// 파일을 Open창에서 보여줄 파일 종류를 설정하기
    	fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
		);
    	
    	// Open창을 열고 Open창에서 선택한 파일 정보 읽어오기
    	File selectFile = fileChooser.showOpenDialog(MProfessorMain.mainStage);
    	
    	if(selectFile!=null) {  // 파일이 선택되었으면...
			// 이 영역에서는 선택한 파일의 내용을 읽어오는 작업이 
			// 기술되어야 한다.
    		filePath = selectFile.getPath();
    		System.out.println("AddPro filePath: " + filePath);
    		Image img = new Image(selectFile.toURI().toString(), 150.0, 200.0, false, false);
    		imgView.setImage(img);
		}
    		
//    		try {
//				BufferedImage bufImg = ImageIO.read(selectFile);
//				
//				BufferedImage resized = resize(bufImg, 200, 100);
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
    		

    	
    }

    
    // 이미지 삭제 버튼 이벤트
    @FXML
    void btnDelImgClicked(ActionEvent event) {
    	imgView.imageProperty().set(null);

    }
    	
    
    // 교수 등록 버튼 이벤트
    @FXML
    void btnInsertClicked(ActionEvent event) {
 
    	// 교수이름 공백 확인
    	if(txtFProName==null|| txtFProName.getLength()==0) {
    		AlertController.warnning("입력 오류", "이름을 입력하세요.");
    		
    	}else if(!RegEx.checkMemName(txtFProName.getText().trim())){
    		AlertController.warnning("입력 오류", "한글 2 ~ 20자 이내로 입력하세요.");
    	}
    	
    	// 생년월일 공백 확인
    	if(txtFProBir==null|| txtFProBir.getLength()==0) {
    		AlertController.warnning("입력 오류", "생년월일을 입력하세요.");
    		
    	}else if(!RegEx.checkMemBirth(txtFProBir.getText().trim())){
    		AlertController.warnning("입력 오류", "YYYY-MM-DD 형식으로 입력하세요.");
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	// 중복검사??

    	
    	
    	
    	
    }
    
    
    // 교수 등록취소 버튼 이벤트
    @FXML
    void btnCancelClicked(ActionEvent event) {
    	Stage thisForm = (Stage) btnCancel.getScene().getWindow();
    	thisForm.close();

    }


 

    @FXML
    void initialize() {
      service = MProfessorServiceImpl.getInstance();

    }
  
//    private static BufferedImage resize(BufferedImage img, int height, int width) {
//        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
//        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = resized.createGraphics();
//        g2d.drawImage(tmp, 0, 0, null);
//        g2d.dispose();
//        return resized;
//    }
    
    
    
}

