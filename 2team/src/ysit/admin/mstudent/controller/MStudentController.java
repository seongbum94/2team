package ysit.admin.mstudent.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.admin.mprofessor.controller.AddProfessorController;
import ysit.admin.mprofessor.main.MProfessorMain;
import ysit.admin.mstudent.service.IMStudentService;
import ysit.admin.mstudent.service.MStudentServiceImpl;
import ysit.vo.StudentVO;


// 학생관리 메인
public class MStudentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<StudentVO> tableView;

    @FXML
    private TableColumn<StudentVO, String> txtFStuIdCol;

    @FXML
    private TableColumn<StudentVO, String> txtFStuName;

    @FXML
    private TableColumn<StudentVO, String> txtFMajorName;

    @FXML
    private TableColumn<StudentVO, String> txtFEnt;

    @FXML
    private TableColumn<StudentVO, String> txtFRegister;

    // 페이징
    @FXML
    private Pagination pagination;
    
    // 버튼
    @FXML
    private TextField txtFSearch;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnStuAdd;
    
    // 콤보박스
    @FXML
    private ComboBox<String> comboBox;
    
    //
    private IMStudentService service;
    private List<StudentVO> stuList;	
    private ObservableList<StudentVO> stuOList;	
    private List<StudentVO> stuSeachList;
    private String comboStr;
    
    
    // 페이징
    private int rowPerPage= 17;				// 한 화면에 보여줄 데이터(레코드) 수
    private int totalPages;				    // 전체 레코드 수
    
    private int index;
    
    // 버튼 이벤트
    
    // 검색
    @FXML
    // 학생이름, 학번
    void btnSearchCliceked(ActionEvent event) {	
    	comboStr = comboBox.getSelectionModel().getSelectedItem();
    	stuSeachList = null;
    	if(comboStr.equals("학생이름")) {
    		stuSeachList = service.getStuName(txtFSearch.getText());
    		changeTableView(0, stuSeachList);
    		pagination.setMaxPageIndicatorCount(17); // 기본값은 17개
        	
        	// pagination의 페이지 번호를 변경했을 때 이벤트 처리
        	pagination.currentPageIndexProperty().addListener(new ChangeListener<Number>(
        	) {

    			@Override
    			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
    				// 현재 선택한 index값을 이용해서 TableView에
    				// 데이터를 나타내는 메서드 호출
    				System.out.println("MStudentController addListener newValue :" + newValue); // 확인용
    				changeTableView(newValue.intValue(), stuSeachList);  
    			}	
    		});
    		

    	}
    	if(comboStr.equals("학번")) {
    		stuSeachList = service.getStuId(txtFSearch.getText());
    		changeTableView(0, stuSeachList);
    		pagination.setMaxPageIndicatorCount(17); // 기본값은 17개
        	
        	// pagination의 페이지 번호를 변경했을 때 이벤트 처리
        	pagination.currentPageIndexProperty().addListener(new ChangeListener<Number>(
        	) {

    			@Override
    			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
    				// 현재 선택한 index값을 이용해서 TableView에
    				// 데이터를 나타내는 메서드 호출
    				System.out.println("MStudentController addListener newValue :" + newValue); // 확인용
    				changeTableView(newValue.intValue(), stuSeachList);  
    			}	
    		});
    	}
    	

    }

    // 추가
    @FXML
    void btnStuAddClicked(ActionEvent event) {
    	// 자식창 띄우기 위한 설정
    	Stage addStage = new Stage(StageStyle.DECORATED);
    	addStage.initModality(Modality.WINDOW_MODAL);
    	addStage.initOwner(MProfessorMain.mainStage); // 부모창 설정
    	
    	try {
    		// Fxml문서에 설정된 Controller객체를 구하기 위해서는 
    		// FXMLLoader객체를 생성해야 한다.
    		
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/FxmlAddStudent.fxml"));  // 자식창
    		Parent root = loader.load();
    		
    		
    		// FXML문서에 설정된 컨트롤러 객체 구하기
    		AddStudentController addStudentController = loader.getController();
    		addStudentController.setMainController(this);
    		
    		Scene scene = new Scene(root);
    		addStage.setScene(scene);
    		addStage.setTitle("학생 등록");
    		addStage.show();


    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    @FXML
    void comboBoxClicked(ActionEvent event) {

    }
    
    
    
    // 초기 시작
    @FXML
    void initialize() {
    	txtFStuIdCol.setCellValueFactory(new PropertyValueFactory<StudentVO, String>("stu_id"));		
    	txtFStuName.setCellValueFactory(new PropertyValueFactory<StudentVO, String>("stu_name"));		
    	txtFMajorName.setCellValueFactory(new PropertyValueFactory<StudentVO, String>("major_name"));		
    	txtFEnt.setCellValueFactory(new PropertyValueFactory<StudentVO, String>("stu_ent"));		
    	txtFRegister.setCellValueFactory(new PropertyValueFactory<StudentVO, String>("stu_register"));	
    	
    	// service!!
    	service = MStudentServiceImpl.getInstance();

    	//TableView!!
    	setTableViewData();
    	
    	//totalPages = (int) Math.ceil(stuList.size()/(double)rowPerPage);
    	//System.out.println("ApplyDropController totaPages:" + totalPages); // 확인용
    	
    	//Pagination객체 
		// Pagination객체에 설정할 값은 기본적으로 전체 페이지 개수와
		// 처음 선택할 페이지의 index값을 설정한다.
    	//Pagination pagination = new Pagination();
    	//pagination.setPageCount(totalPages);	// 전체 페이지 수
    	//pagination.setCurrentPageIndex(0);		// 처음 선택할 페이지의 index
    	
    	changeTableView(0, stuList);		    // 맨 처음에은 1페이지(index값:0)가 나오도록한다. 

    	pagination.setMaxPageIndicatorCount(17); // 기본값은 17개
    	
    	// pagination의 페이지 번호를 변경했을 때 이벤트 처리
    	pagination.currentPageIndexProperty().addListener(new ChangeListener<Number>(
    	) {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// 현재 선택한 index값을 이용해서 TableView에
				// 데이터를 나타내는 메서드 호출
				System.out.println("MStudentController addListener newValue :" + newValue); // 확인용
				changeTableView(newValue.intValue(), stuList);  
			}	
		});

    }
    

 // DB의 전체 자료를 가져와 TableView에 보여주는 메서드 
    public void setTableViewData() {
    	stuList = service.getAllStudent();
    	System.out.println("setTableViewData stuList :" + stuList);
    	stuOList = FXCollections.observableArrayList(stuList);
    	tableView.setItems(stuOList);
    	
    	// 콤보박스 값 설정
    	comboBox.getItems().addAll("학번","학생이름");
    	// 콤보박스 초기값(학생이름)
    	comboBox.setValue(comboBox.getItems().get(1));
    	
    }
    
 // Pagination에서 선택한 페이지 index값을 매개변수로 받아서
 	// 전체 데이터 중 index번째에 맞는 데이터를 가져와 
 	// TableView에 다시 셋팅해 주는 메서드
     public void changeTableView(int index, List<StudentVO> stuList) {
    	totalPages = (int) Math.ceil(stuList.size()/(double)rowPerPage);
     	System.out.println("ApplyDropController totaPages:" + totalPages); // 확인용
     	
     	pagination.setPageCount(totalPages);	// 전체 페이지 수
    	pagination.setCurrentPageIndex(0);		// 처음 선택할 페이지의 index
    	 
     	// 시작위치 구하기
     	int fromIndex = index * rowPerPage;
     	int toIndex = Math.min(fromIndex + rowPerPage, stuList.size());
     	// 확인용
     	System.out.println("MStudentController changeTableView fromIndex: " + fromIndex);
     	System.out.println("MStudentController changeTableView toIndex: " + toIndex);
 
     	// 시작위치부터 종료위치 이전까지의 데이터를 가져와 TableView에 셋팅
     	stuOList = FXCollections.observableArrayList(stuList.subList(fromIndex, toIndex));
     	System.out.println(stuOList);
     	tableView.setItems(stuOList);

	}

    
}

