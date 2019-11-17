package ysit.admin.mprofessor.controller;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import ysit.admin.mprofessor.main.MProfessorMain;
import ysit.admin.mprofessor.service.IMProfessorService;
import ysit.admin.mprofessor.service.MProfessorServiceImpl;
import ysit.com.alert.AlertController;
import ysit.com.regex.RegEx;
import ysit.vo.ProfessorVO;

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
    
    @FXML
    private TextField txtFProStat;						// 재직상태

    
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
    
 
    private String inputFilePath;  					    // 파일 경로
    
    //private String outputFilePath = "../../../../../images/";  // 출력 파일경로
    //private String outputFilePath = "d:\\upload\\";
    private String outputFilePath = "\\C:\\A_TeachingMaterial\\5.MiddleProject\\workspace\\2team\\images";
    private String outputFileName;
    private boolean imgCheck = false;
    
    
    
    
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
    		Image img = new Image(selectFile.toURI().toString(), 150.0, 200.0, false, false);
    		System.out.println("AddController img.toURI():" + selectFile.toURI().toString());
    		imgView.setImage(img);
    		
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

	    		System.out.println("AddController fout: " + fout);
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
			}else {
				imgCheck = false;
			}
    		
//    		try {
//				BufferedImage bufImg = ImageIO.read(selectFile);
//				
//				BufferedImage resized = resize(bufImg, 200, 100);
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
    		
    	
    	
//    	try {
//    		//파일로 출력하기위해 파일출력스트림 생성
//			OutputStream out = new FileOutputStream(outputFilePath+outputFileName);
//			RenderedImage img2 = img;
//			ImageIO.write(img2, "JPG", out);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

    	
    }

    
    // 이미지 삭제 버튼 이벤트
    @FXML
    void btnDelImgClicked(ActionEvent event) {
    	if(imgView.imageProperty().get()==null) {
    		AlertController.warnning("오류", "등록된 사진이 없습니다.");
    		return;
    	}
    	File profile = new File(outputFilePath+"프로필사진.jpg");
    	Image img = new Image(profile.toURI().toString(),150.0, 200.0, false, false);
    	imgView.setImage(img);
    	
//      C:\A_TeachingMaterial\5.MiddleProject\workspace\2team\images
//    	File profile = new File("C:\\A_TeachingMaterial\\5.MiddleProject\\workspace\\2team..\\..\\..\\..\\..\\images\\프로필사진.jpg");
//    	File imgFile = new File("../../../../../images/프로필사진.jpg");
//    	if(!imgFile.exists()) {
//    		System.out.println("존재안함");
//    	}
//    	Image img = new Image(imgFile.toURI().toString(),150.0, 200.0, false, false);
//    	imgView.setImage(img);
//    	
    	

    }
    	
    
    // 교수 등록 버튼 이벤트
    @FXML
    void btnInsertClicked(ActionEvent event) {
 
    	String msg = "";
    	// 교수이름 공백 확인
    	int cnt = 0;		// 오류 횟수
    	
    	if(txtFProName==null|| txtFProName.getLength()==0) {
    		AlertController.warnning("입력 오류", "이름을 입력하세요.");
    		++cnt;
    		
    	}else if(!RegEx.checkMemName(txtFProName.getText().trim())){
    		AlertController.warnning("입력 오류", "한글 2 ~ 20자 이내로 입력하세요.");
    		++cnt;
    	}
    	
    	// 생년월일 공백 확인
    	if(txtFProBir==null|| txtFProBir.getLength()==0) {
    		AlertController.warnning("입력 오류", "생년월일을 입력하세요.");
    		++cnt;
    		
    	}else if(!RegEx.checkMemBirth(txtFProBir.getText().trim())){
    		AlertController.warnning("입력 오류", "YYYY-MM-DD 형식으로 입력하세요.");
    		++cnt;
    	}
    	
    	// 학과코드 공백확인
    	if(txtFMajorName==null|| txtFMajorName.getLength()==0) {
    		AlertController.warnning("입력 오류", "학과명를 입력하세요.");
    		++cnt;
    	}// 학과코드도 정규식????????????????????? (보류)
    	
    	// 이메일 공백확인
    	if(txtProEmail1==null|| txtProEmail1.getLength()==0) {
    		AlertController.warnning("입력 오류", "이메일을 입력하세요.");
    		++cnt;
    	}
    	
    	if(txtProEmail2==null|| txtProEmail2.getLength()==0) {
    		AlertController.warnning("입력 오류", "이메일 주소를 입력하세요.");
    		++cnt;
    	}
    	
    	if(txtFProAppointmentDate==null|| txtFProAppointmentDate.getLength()==0) {
    		AlertController.warnning("입력 오류", "임용날짜를 입력하세요.");
    		++cnt;
    	}else if(!RegEx.checkMemBirth(txtFProAppointmentDate.getText().trim())){
    		AlertController.warnning("입력 오류", "YYYY-MM-DD 형식으로 입력하세요.");
    		++cnt;
    	}
    	
    	
    	if(txtFProStat==null|| txtFProStat.getLength()==0) {
    		AlertController.warnning("입력 오류", "재직상태를 입력하세요.");
    		++cnt;
    	}
    	
    	if(cnt==0) {
    		ProfessorVO proVO = new ProfessorVO();
    		// 교번 자동생성
    		// 임용년도 4자리 + 순차번호
    		// SELECT NVL(MAX(PRO_ID),0) FROM PROFESSOR WHERE PRO_ID LIKE '1970%';
    		String[] date = txtFProAppointmentDate.getText().split("-");
    		
    		
    		// 비밀번호 생일
    		String[] birth = txtFProBir.getText().split("-");
    		String pass = birth[0] + birth[1] + birth[2];
    		System.out.println("AddProController pass: " + pass);
    		
    		// vo에 데이터 넣기
    		int proIdMax = service.getproIdYear(date[0]);
    		if(proIdMax==0) {
    			proVO.setPro_id(date[0]+"0001");
    		}else {
    			proVO.setPro_id(String.valueOf(proIdMax+1));
    		}
    		
    		proVO.setPro_pass(pass);
    		if(imgCheck) {		// 이미지 경로가 있을때
    			proVO.setPro_photo(outputFilePath+outputFileName);
    			System.out.println("교수 추가 이미지 경로 있을때");
    			System.out.println(proVO.getPro_photo());
    		}else {
    			proVO.setPro_photo("null");
    		}
    		proVO.setPro_name(txtFProName.getText());
    		proVO.setPro_bir(txtFProBir.getText());
    		
    		if(!txtFProAddr.getText().isEmpty()) {
    			proVO.setPro_addr(txtFProAddr.getText());
    		}else {
    			proVO.setPro_addr("null");
    		}
    		
    		proVO.setPro_mail(txtProEmail1.getText() + "@" +txtProEmail2.getText());
    		
    		if(!txtFProEducation.getText().isEmpty()) {
    			proVO.setPro_edu(txtFProEducation.getText());
    		}else {
    			proVO.setPro_edu("null");
    		}
    		
    		if(!txtAProCareer.getText().isEmpty()) {
    			proVO.setPro_car(txtAProCareer.getText());
    		}else {
    			proVO.setPro_car(null);
    		}
    		
    		proVO.setPro_appointment_date(txtFProAppointmentDate.getText());
    		proVO.setMajor_id(ShareData.majorId(txtFMajorName.getText()));
    		
    		
    		if(!txtFProPosition.getText().isEmpty()) {
    			proVO.setPro_position(txtFProPosition.getText());
    		}else {
    			proVO.setPro_position(null);
    		}
    		
    		proVO.setPro_stat(txtFProStat.getText());
    		proVO.setPro_lab(mainController.proLab(txtFProStat.getText())); 
    	

    		
    		// service 호출
    		int res = service.insertPro(proVO);
    		if(res > 0) {
    			AlertController.info("작업결과", "교수 등록 성공!!");
    			Stage thisForm = (Stage) btnInsert.getScene().getWindow();
    	    	thisForm.close();
    	    	mainController.setTableViewData();
    		}else {
    			AlertController.warnning("작업결과", "교수 등록 실패..전산팀에 문의하세요.");
    		}
    		
    	}
  
    	
    	
    	// 중복검사??
    	// 교번 (임용날짜 + 순번)
    	// 비번 (생년월일!!!)

    }
    
    // ************************** 새로 FXML 만들기?? 부모창에서 수정버튼 누르면
    //                            TextField 교번 비활성화, 나머지는 활성화 (TableView선택값으로 넣기)
    //                            						  
    
    
    // 교수 등록취소 버튼 이벤트
    @FXML
    void btnCancelClicked(ActionEvent event) {
    	Stage thisForm = (Stage) btnCancel.getScene().getWindow();
    	thisForm.close();

    }


 
    // 초기 시작
    @FXML
    void initialize() {
      service = MProfessorServiceImpl.getInstance();
      File profile = new File(outputFilePath+"프로필사진.jpg");
  	  Image img = new Image(profile.toURI().toString(),150.0, 200.0, false, false);
  	  imgView.setImage(img);

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

