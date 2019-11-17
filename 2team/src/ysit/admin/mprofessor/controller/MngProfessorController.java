package ysit.admin.mprofessor.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import ysit.admin.apply.controller.ManageApplyFormController;
import ysit.admin.apply.service.IApplyService;
import ysit.admin.mprofessor.main.MProfessorMain;
import ysit.admin.mprofessor.service.IMProfessorService;
import ysit.admin.mprofessor.service.MProfessorServiceImpl;
import ysit.com.alert.AlertController;
import ysit.vo.ProfessorVO;



// 교수관리 Main
public class MngProfessorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;



    @FXML
    private TableView<ProfessorVO> tableView;			                 // 테이블 뷰

    @FXML
    private TableColumn<ProfessorVO, String> proIdCol;					// 교수id 컬럼

    @FXML
    private TableColumn<ProfessorVO, String> majorNameCol;				// 학과명 컬럼

    @FXML
    private TableColumn<ProfessorVO, String> proNameCol;				// 교수이름 컬럼

    @FXML
    private TableColumn<ProfessorVO, String> proAppPointmentDateCol;	// 교수 임용날짜 컬럼

    @FXML
    private TableColumn<ProfessorVO, Integer> proLabCol;				// 교수 연구실번호 컬럼

    @FXML
    private TableColumn<ProfessorVO, String> proStatCol;				// 교수 재직상태 컬럼

    
    //------------버튼-------------------------------------------------
    @FXML
    private Button btnProAdd;						                  	// 교수 추가 버튼

    @FXML
    private Button btnProModify;					                	// 교수 수정 버튼

    @FXML	
    private Button btnProDel;							                // 교수 삭제 버튼		
    
    
    private IMProfessorService service;
    private List<ProfessorVO> proAddList;	
    private ObservableList<ProfessorVO> proAddOList;	
    
    private int index;
    
    
    // 버튼 클릭 이벤트
    // 교수 추가 버튼 이벤트
    @FXML
    void btnProAddClicked(ActionEvent event) {
    	// 자식창 띄우기 위한 설정
    	Stage addStage = new Stage(StageStyle.DECORATED);
    	addStage.initModality(Modality.WINDOW_MODAL);
    	addStage.initOwner(MProfessorMain.mainStage); // 부모창 설정
    	
    	try {
    		// Fxml문서에 설정된 Controller객체를 구하기 위해서는 
    		// FXMLLoader객체를 생성해야 한다.
    		
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/FxmlAddProfessor.fxml"));  // 자식창
    		Parent root = loader.load();
    		
    		
    		// FXML문서에 설정된 컨트롤러 객체 구하기
    		AddProfessorController addProfessorController = loader.getController();
    		addProfessorController.setMainController(this);
    		
    		Scene scene = new Scene(root);
    		addStage.setScene(scene);
    		addStage.setTitle("교수 등록");
    		addStage.show();


    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	

    }

    // 교수 삭제 버튼 이벤트
    @FXML
    void btnProDelClicked(ActionEvent event) {
    	if(!tableView.getSelectionModel().isEmpty()) {
    		index = tableView.getSelectionModel().getSelectedIndex();
    		//System.out.println("Controller pro_id: " + tableView.getSelectionModel().getSelectedItem().getPro_id());
    		
    		int cnt = service.removePro(tableView.getSelectionModel().getSelectedItem().getPro_id());
    		
    		if(cnt>0) {
    			AlertController.info("처리결과", "해당 교수 삭제가 완료되었습니다.");
    			setTableViewData();
    		}else {
    			AlertController.warnning("처리결과", "교수 삭제 실패..전산팀에 문의하세요.");
    		}
    	}else {
    		AlertController.warnning("선택오류", "선택한 교수가 없습니다.");
    	}

    }

    // 교수 수정 버튼 이벤트
    @FXML
    void btnProModifyClicked(ActionEvent event) {
    	
    	if(!tableView.getSelectionModel().isEmpty()) {
    		index = tableView.getSelectionModel().getSelectedIndex();
    		
    		// 공유 데이터에 추가
    		ShareData.setShareIndex(index);
    		ShareData.shareProVO = proAddList.get(index);
    		//ShareDate.shareProList = new ArrayList<ProfessorVO>(proAddList.get(0));
    		
    		
        	// 자식창 띄우기 위한 설정
        	Stage modifyStage = new Stage(StageStyle.DECORATED);
        	modifyStage.initModality(Modality.WINDOW_MODAL);
        	modifyStage.initOwner(MProfessorMain.mainStage); // 부모창 설정
    		
        	try {
        		// Fxml문서에 설정된 Controller객체를 구하기 위해서는 
        		// FXMLLoader객체를 생성해야 한다.
        		
        		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/FxmlModifyProfessor.fxml"));  // 자식창
        		Parent root = loader.load();
        		
        		
        		// FXML문서에 설정된 컨트롤러 객체 구하기
        		ModifyProfessorController modifyProfessorController = loader.getController();
        		modifyProfessorController.setMainController(this);
        		
        		Scene scene = new Scene(root);
        		modifyStage.setScene(scene);
        		modifyStage.setTitle("교수정보 수정");
        		modifyStage.show();
        		
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        	
    	
    	}else {
    		AlertController.warnning("선택오류", "선택한 교수가 없습니다.");
    	}
    }


    // 초기 시작
    @FXML
    void initialize() {
    	// 컬럼 셋팅
    	proIdCol.setCellValueFactory(new PropertyValueFactory<ProfessorVO, String>("pro_id"));										
    	majorNameCol.setCellValueFactory(new PropertyValueFactory<ProfessorVO, String>("major_name"));
    	proNameCol.setCellValueFactory(new PropertyValueFactory<ProfessorVO, String>("pro_name"));
    	proAppPointmentDateCol.setCellValueFactory(new PropertyValueFactory<ProfessorVO, String>("pro_appointment_date"));
    	proLabCol.setCellValueFactory(new PropertyValueFactory<ProfessorVO, Integer>("pro_lab"));
    	proStatCol.setCellValueFactory(new PropertyValueFactory<ProfessorVO, String>("pro_stat"));
    	
    	
    	// service!!
    	service = MProfessorServiceImpl.getInstance();

    	//TableView!!
    	setTableViewData();

    }
    
    
	// DB의 전체 자료를 가져와 TableView에 보여주는 메서드 
    public void setTableViewData() {
    	proAddList = service.getAllPro();
    	//System.out.println("setTableViewData proAddList :" + proAddList);
    	proAddOList = FXCollections.observableArrayList(proAddList);
    	tableView.setItems(proAddOList);
    }
    
    // 재직상태에 따른 연구실 
    public int proLab(String proStat) {
    	int resLab = 0;
    	if(proStat.equals("휴직")||proStat.equals("퇴직")){	// 재직상태
    		resLab = 0;
    	}else if(proStat.equals("재직")) {
    		resLab = service.getproLab();
    	}else {
    		resLab = 0;
    	}
    	return resLab;
    }
    
    
}

