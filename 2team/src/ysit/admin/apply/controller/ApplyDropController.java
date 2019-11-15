package ysit.admin.apply.controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import ysit.admin.apply.main.ApplyMain;
import ysit.admin.apply.service.ApplyServiceImpl;
import ysit.admin.apply.service.IApplyService;
import ysit.com.alert.AlertController;
//

// 자퇴신청 창

public class ApplyDropController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    /*
    @FXML
    private TitledPane adminNoticeTitle;           // 공지사항

    @FXML
    private Label adminNotice;

    @FXML
    private Label adminEmp;

    @FXML
    private TitledPane adminSubject;               // 수강편람관리

    @FXML
    private Label adminAddSub;

    @FXML
    private Label adminDelSub;

    @FXML
    private Label adminSearchSub;

    @FXML
    private TitledPane adminPro;                     // 교수관리

    @FXML
    private Label adminAddPro;

    @FXML
    private TitledPane adminStu;                     // 학생관리

    @FXML
    private Label adminStuInf;

    @FXML
    private Label adminStuGrade;

    @FXML
    private Label adminStuA;

    @FXML
    private TitledPane adminStuState;                // 재적상태관리

    @FXML
    private Label adminRest;

    @FXML
    private Label adminComeBack;

    @FXML
    private Label adminLeave;

    @FXML
    private TitledPane adminSchTitle;               // 학상일정관리

    @FXML
    private Label adminSch;

    @FXML
    private TitledPane adminTuit;		    // 등록금 관리

    @FXML
    private Label adminTuitOk;

    @FXML
    private Label adminTuitNo;
    */
    
    // ---------------------------------------------------
    // 뷰
    @FXML
    private TableView<Map<String,String>> tableView;     // 리스트 출력할 테이블뷰
    

    // 컬럼명
    @FXML
    private TableColumn<Map<String,String>, String> appIdCol;		// 신청번호 컬럼
    
    @FXML
    private TableColumn<Map<String,String>, String> stuIdCol;	    // 학번 컬럼	

    @FXML
    private TableColumn<Map<String,String>, String> majorCol;       // 학과 컬럼

    @FXML
    private TableColumn<Map<String,String>, String> stuNameCol;     // 학생이름 컬럼

    @FXML
    private TableColumn<Map<String,String>, String> applyCol;       // 신청사유 컬럼

    @FXML
    private TableColumn<Map<String,String>, String> applyDateCol;	// 신청일 컬럼

    @FXML
    private TableColumn<Map<String,String>, String> proAppDateCol;  // 교수승인일 컬럼					

    @FXML
    private TableColumn<Map<String,String>, String> admAppDateCol;  // 관리자승인일 컬럼
    
    @FXML
    private TableColumn<Map<String,String>, String> admRejectDateCol; // 관리자거절일 컬럼
    
    @FXML
    private TableColumn<Map<String,String>, String> admRejectCol;     // 관리자 반려사유 컬럼
    
    //@FXML
    //private TableColumn<Map<String,String>, String> rejectCol;	  // 반려사유 컬럼
    

    @FXML
    private Pagination pagination;									// 페이징 처리

    
    // ---------------------------------------------------
    
    // 버튼

    @FXML
    private Button btnOk;				// 승인 버튼

    @FXML
    private Button btnReject;			// 반려 버튼


    
    
    //
    private int rowPerPage= 5;				// 한 화면에 보여줄 데이터(레코드) 수
    private int totalPages;				    // 전체 레코드 수

    private IApplyService service;
    private List<Map<String, String>> appList;	
    private ObservableList<Map<String, String>> applyOList;	
    
    
    // 버튼 이벤트--------------------------------------------

    
    // 승인 버튼 이벤트
    @FXML
    void btnOkClicked(ActionEvent event) {		
    	// 관리자가 자퇴 승인버튼을 누르면 
    	// 신청T에 승인여부_관리자, 승인일_관리자를 채울 것
    	// 학생T에 학적상태 : '자퇴'로 할 것
  	
    	// 1. TableView에 선택한 값 불러오기
    	if(!tableView.getSelectionModel().isEmpty()) {	// 선택한 값이 있다면...
    		int index = tableView.getSelectionModel().getSelectedIndex();

    		if(tableView.getSelectionModel().getSelectedItem().get("app_adm_date") !=null 
    				|| tableView.getSelectionModel().getSelectedItem().get("app_adm_reject_date") != null) {
    			AlertController.warnning("승인오류", "이미 처리된 학생입니다.");
    			//alert("승인오류", "이미 처리된 학생입니다.");
    			return;
    		}
    		
    		ButtonType bt = confirm("자퇴 승인 처리할 학생: " + applyOList.get(index).get("stu_name"), "해당 학생의 자퇴 승인을 하시겠습니까?");
    		
    		if(bt.getText().equals("OK")) {
    			// (1) 선택한 항목의 객체 구해오기
    			//String stu_id = appList.get(index).get("stu_id");
    			//String app_id = appList.get(index).get("app_id");
    			
    			HashMap<String, String> parmMap = new HashMap<String, String>();
    			
    			String stu_name = appList.get(index).get("stu_name");	// 학생이름
    			String stu_id = appList.get(index).get("stu_id");		// 학번
    			String app_date = appList.get(index).get("app_date");	// 신청일자
    			
    			parmMap.put("stu_id", stu_id);
    			parmMap.put("app_id", appList.get(index).get("app_id"));
    			
    			// 데이터 공유
    			ShareData.shareMap.put("stu_name", stu_name);
    			ShareData.shareMap.put("stu_id", stu_id);
    			ShareData.shareMap.put("app_date", app_date);
    			
    			int cnt = service.updateApproval(parmMap);
    			System.out.println("btnOkClicked cnt: " + cnt);
    			
    			if(cnt>1) {	// 업데이트 성공!!
    				infoMsg("처리결과", "자퇴 승인 처리가 완료됐습니다.");	
    				// 테이블 뷰에 다시 출력하기
    	    		setTableViewData();
    				//changeTableView(index);
    			}else {
    				alert("처리결과", "자퇴 처리 실패..전산팀에 문의하세요.");
    			}
    		}

    	}else {		// 선택한 값이 없는 경우
    		alert("선택오류", "선택한 학생이 없습니다.");
    	}
    }

    
    
    
    // 반려 버튼 이벤트
    @FXML
    void btnRejectClicked(ActionEvent event) {	 
    	// 관리자가 자퇴 반려버튼을 누르면
    	// 반려 FXML창을 띄우고 
    	// 학생T에서 학번과 
    	// 반려사유를 입력받아 신청T에 거절일, 반려사유를 채울 것
    	
    	
    	// 1. TableView에 선택한 값 불러오기
    	if(!tableView.getSelectionModel().isEmpty()) {	// 선택한 값이 있다면...
    		int index = tableView.getSelectionModel().getSelectedIndex();
    		
    		if(tableView.getSelectionModel().getSelectedItem().get("app_adm_date") !=null 
    				|| tableView.getSelectionModel().getSelectedItem().get("app_adm_reject_date") != null ) {
    			AlertController.warnning("승인오류", "이미 처리된 학생입니다.");
    			//alert("승인오류", "이미 처리된 학생입니다.");
    			return;
    		}

    		ButtonType bt = confirm("자퇴신청 반려 처리할 학생: " + applyOList.get(index).get("stu_name"), "해당 학생의 자퇴신청 반려을 하시겠습니까?");
    		
    		//System.out.println(bt.getText().equals("OK"));
    		if(bt.getText().equals("OK")) {	
  
    			// 데이터 공유
    			ShareData.shareMap.put("app_id", appList.get(index).get("app_id"));         // 신청번호
    			ShareData.shareMap.put("stu_name", appList.get(index).get("stu_name"));		// 학생이름
    			ShareData.shareMap.put("stu_id", appList.get(index).get("stu_id"));			// 학번
    			ShareData.shareMap.put("app_date", appList.get(index).get("app_date"));		// 신청일자
    			ShareData.setCurrentIndex(index);
    			
    			
    			// 자식창 설정
    	    	Stage rejectStage = new Stage(StageStyle.DECORATED);
    	    	rejectStage.initModality(Modality.WINDOW_MODAL);
    	    	rejectStage.initOwner(ApplyMain.mainStage); // 부모창 설정

    	    	try {
    	    		// Fxml문서에 설정된 Controller객체를 구하기 위해서는 
    	    		// FXMLLoader객체를 생성해야 한다.
    	    		
    	    		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/FxmlManageApplyForm.fxml"));  // 자식창
    	    		Parent rejectRoot = loader.load();	// 자식
    	    		
    	    		
    	    		// FXML문서에 설정된 컨트롤러 객체 구하기
    	    		ManageApplyFormController manageApplyFormController = loader.getController();
    	    		manageApplyFormController.setMainController(this);
    	    		
    	    		Scene scene = new Scene(rejectRoot);
    	    		rejectStage.setScene(scene);
    	    		rejectStage.setTitle("반려");
    	    		rejectStage.show();
    	    		
    	    	} catch (IOException e) {
    	    		e.printStackTrace();
    	    	}
    		}

    	}else {		// 선택한 값이 없는 경우
    		alert("선택오류", "선택한 학생이 없습니다.");
    	}
    }

//	private String coun_id;			// 상담코드(PK)
//	private String stu_id;			// 학생아이디(학번)(FK)
//	private String pro_id;			// 교수아이디(교번)(FK)
//	private String coun_type;		// 상담 종류
//	private String coun_date;		// 상담 날짜
//	private String coun_content;	// 상담 내용
    
    
    // 초기 시작
    @FXML
    void initialize() {

    	appIdCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
            	// 키값은 쿼리문의 컬럼명 이나 Alias를 사용하는데,
            	// 이것을 '대문자'로 지정한다.
                return new SimpleStringProperty(p.getValue().get("app_id"));
            }
        });

    	stuIdCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
            	// 키값은 쿼리문의 컬럼명 이나 Alias를 사용하는데,
            	// 이것을 '대문자'로 지정한다.
                return new SimpleStringProperty(p.getValue().get("stu_id"));
            }
        });
    	
    	
    	majorCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("major_name"));
            }
        });
    	
    	stuNameCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("stu_name"));
            }
        });
    	
    	applyCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("app_content"));
            }
        });
    	
    	applyDateCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("app_date"));
            }
        });
    	
    	proAppDateCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("app_pro_date"));  
            }
        });
    	
    	
    	admAppDateCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("app_adm_date")); 
            }
        });
    	
    	
    	admRejectDateCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("app_adm_reject_date"));
            }
        });
    	
    	
    	admRejectCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Map<String, String>, String> p) {
                return new SimpleStringProperty(p.getValue().get("app_res_rejection"));
            }
        });

    	
    	service = ApplyServiceImpl.getInstance();
    	//appList = service.getAllAppDrop();
    	
    	//TableView
    	setTableViewData();
    	
    	//totalPages = (int) Math.ceil(appList.size()/(double)rowPerPage);
    	//System.out.println("ApplyDropController totaPages:" + totalPages); // 확인용
    	
    	// Pagination객체 생성 및 초기화
		// Pagination객체에 설정할 값은 기본적으로 전체 페이지 개수와
		// 처음 선택할 페이지의 index값을 설정한다.
    	// Pagination pagination = new Pagination();
    	// pagination.setPageCount(totalPages);	// 전체 페이지 수
    	// pagination.setCurrentPageIndex(0);		// 처음 선택할 페이지의 index
    	
    	//changeTableView(0);						// 맨 처음에은 1페이지(index값:0)가 나오도록한다. 

    	//pagination.setMaxPageIndicatorCount(5); // 기본값은 5개
    	
    	// pagination의 페이지 번호를 변경했을 때 이벤트 처리
    	//pagination.currentPageIndexProperty().addListener(new ChangeListener<Number>(
    	//) {

//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				// 현재 선택한 index값을 이용해서 TableView에
//				// 데이터를 나타내는 메서드 호출
//				// System.out.println("ApplyDropController addListener newValue :" + newValue); // 확인용
//				changeTableView(newValue.intValue());  
//			}
//    		
//		});


    }
    
	
    
	// Pagination에서 선택한 페이지 index값을 매개변수로 받아서
	// 전체 데이터 중 index번째에 맞는 데이터를 가져와 
	// TableView에 다시 셋팅해 주는 메서드
    public void changeTableView(int index) {
    	
    	// 시작위치 구하기
    	int fromIndex = index * rowPerPage;
    	int toIndex = Math.min(fromIndex + rowPerPage, appList.size());
    	// 확인용
    	//System.out.println("ApplyDropController changeTableView fromIndex: " + fromIndex);
    	//System.out.println("ApplyDropController changeTableView toIndex: " + toIndex);
 
    	// 시작위치부터 종료위치 이전까지의 데이터를 가져와 TableView에 셋팅
    	applyOList = FXCollections.observableArrayList(appList.subList(fromIndex, toIndex));
    	tableView.setItems(applyOList);

	}




	// DB의 전체 자료를 가져와 TableView에 보여주는 메서드 
    public void setTableViewData() {
    	appList = service.getAllAppDrop();
    	applyOList = FXCollections.observableArrayList(appList);
    	tableView.setItems(applyOList);
    }
    
    
    public void alert(String head, String msg) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setHeaderText(head);
		alert.setContentText(msg);
		
		alert.showAndWait();
	}
	
	public void infoMsg(String head, String msg) {
		Alert info = new Alert(AlertType.INFORMATION);
		info.setHeaderText(head);
		info.setContentText(msg);
		
		info.showAndWait();
	}
	
	public ButtonType confirm(String head, String msg) {
		Alert conf = new Alert(AlertType.CONFIRMATION);
		conf.setHeaderText(head);
		conf.setContentText(msg);
		
		return conf.showAndWait().get();
	}
    
    
   
    

	
}
