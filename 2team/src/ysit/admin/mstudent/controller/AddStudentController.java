package ysit.admin.mstudent.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import ysit.admin.mprofessor.main.MProfessorMain;
import ysit.admin.mstudent.service.IMStudentService;
import ysit.admin.mstudent.service.MStudentServiceImpl;
import ysit.com.alert.AlertController;


// 학생추가 화면
public class AddStudentController {
	private MStudentController mainController;
	
	public void setMainController(MStudentController mainMStudentController) {
		this.mainController = mainMStudentController;
	}
	
	public void setMainController() {
		
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label txtFStuName;

    @FXML
    private Label txtFGraPoint;
    
    
    // txtField
    @FXML
    private TextField txtFRegno1;

    @FXML
    private TextField txtFEnt;

    @FXML
    private TextField txtFStuId;

    @FXML
    private TextField txtFRegister;

    @FXML
    private TextField txtFAddr1;

    @FXML
    private TextField txtFTel1;

    @FXML
    private TextField txtFemail1;

    @FXML
    private TextField txtFStuWarn;

    @FXML
    private TextField txtF;

    @FXML
    private TextField txtFRegno2;

    @FXML
    private TextField txtFTel2;

    @FXML
    private TextField txtFTel3;

    @FXML
    private TextField txtFemail2;
    
    // 버튼
    @FXML
    private Button btnOk;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtFAddr2;
    
    @FXML
    private Button btnImgAdd;

    @FXML
    private Button btnImgDel;
    
    // 뷰
    @FXML
    private ImageView imageView;


    // 콤보박스
    @FXML
    private ComboBox<String> comboBox;
    
    private IMStudentService service;
    
    
    //private String outputFilePath = "d:\\upload\\";
    private String outputFilePath = "\\D:\\A_TeachingMaterial\\5.MiddleProject\\workspace\\2team\\images";
   // /C:/A_TeachingMaterial/5.MiddleProject/workspace/2team/images/
    private String outputFileName;
    private boolean imgCheck = false;
    
    
    // 버튼 이벤트
    @FXML
    void btnCancelClicked(ActionEvent event) {		// 취소 버튼
    	Stage thisForm = (Stage) btnCancel.getScene().getWindow();
    	thisForm.close();
    }

    @FXML
    void btnImgAddClicked(ActionEvent event) {		// 학생 이미지 추가
    	// File Open Dialog 창  -------------------------------------
    	FileChooser fileChooser = new FileChooser();
    	
    	// 파일을 Open창에서 보여줄 파일 종류를 설정하기
    	fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
		);
    	
    	// Open창을 열고 Open창에서 선택한 파일 정보 읽어오기
    	File selectFile = fileChooser.showOpenDialog(MProfessorMain.mainStage);
    	System.out.println(selectFile.toURI());
    	
    	
    	
    	if(selectFile!=null) {  // 파일이 선택되었으면...
			// 이 영역에서는 선택한 파일의 내용을 읽어오는 작업이 
			// 기술되어야 한다.
    		Image img = new Image(selectFile.toURI().toString(), 150.0, 200.0, false, false);
    		System.out.println("AddStudentController img.toURI():" + selectFile.toURI().toString());
    		imageView.setImage(img);
    		
    		// 파일 출력
    		outputFileName = selectFile.getName();
    		
    		try {
    			FileInputStream fis = new FileInputStream(selectFile);
    			
    			File outFile = new File(outputFilePath);
    			
    			
    			// 폴더가 없을경우 만들기..
    			if(!outFile.mkdirs()) {
    				outFile.mkdirs();
    			}
	    		FileOutputStream fout = new FileOutputStream(outputFilePath+outputFileName);

	    		System.out.println("AddStudentController fout: " + fout);
	    		BufferedOutputStream bos = new BufferedOutputStream(fout);	
	    		imgCheck = true;	
	    		int c;	
	    		byte[] buffer = new byte[512];
	    		while((c=fis.read(buffer)) != -1){
					bos.write(buffer, 0, c);
				}
	    			
				bos.close();
				fis.close();
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

    }

    @FXML
    void btnImgDelCliecked(ActionEvent event) {		// 학생 이미지 삭제
    	if(imageView.imageProperty().get()==null) {
    		AlertController.warnning("오류", "등록된 사진이 없습니다.");
    		return;
    	}
    	File profile = new File(outputFilePath+"프로필사진.jpg");
    	Image img = new Image(profile.toURI().toString(),150.0, 200.0, false, false);
    	imageView.setImage(img);

    }

    @FXML
    void btnOkCllicked(ActionEvent event) {		// 학생정보 등록 버튼
    	
    	

    }

    @FXML
    void btnSearchCliecked(ActionEvent event) {	// 주소 검색

    }

    
    // 초기 시작
    @FXML
    void initialize() {
    	 service = MStudentServiceImpl.getInstance();
    	 File profile = new File(outputFilePath+"프로필사진.jpg");
    	 System.out.println(profile.toURI());
    	 if(!profile.exists()) {
    		 System.out.println("존재안함");
    	 }
     	 Image img = new Image(profile.toURI().toString(),150.0, 200.0, false, false);
     	 imageView.setImage(img);
    }
}

