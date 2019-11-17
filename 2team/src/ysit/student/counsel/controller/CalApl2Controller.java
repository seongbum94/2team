package ysit.student.counsel.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.student.counsel.service.CounselServiceImpl;
import ysit.student.counsel.service.ICounselService;
import ysit.vo.Counsel_dateVO;
import ysit.vo.EmpVO;
import ysit.vo.ProfessorVO;

public class CalApl2Controller {
	private ICounselService service;
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane clickedStackPane;

    @FXML
    private TableView<ProfessorVO> selectTable;
    
    @FXML
    private TableColumn<ProfessorVO, String> selectPro;	//교수 컬럼

    @FXML
    private TableColumn<ProfessorVO, String> selectCon;	//학과 컬럼

    @FXML
    private TableColumn<ProfessorVO, String> selectOk;		//직위 컬럼

    @FXML
    private TableView<Counsel_dateVO> selectSchedule;	

    @FXML
    private TableColumn<Counsel_dateVO, String> selectDate;	// 날짜 선택 

    @FXML
    private TableColumn<?, ?> selectApply;	// 예약 신청

    @FXML
    void onClicked(MouseEvent event) {
    	if(!selectTable.getSelectionModel().isEmpty()) {
    		 ProfessorVO pro= selectTable.getSelectionModel().getSelectedItem();
    		List<Counsel_dateVO> date = service.ConDateList(pro);
    		ObservableList<Counsel_dateVO> conDate = FXCollections.observableArrayList(date);
    		selectDate.setCellValueFactory(new PropertyValueFactory<>("Imp_date"));
    		selectSchedule.setItems(conDate);
    		
    	}
    	
    }
    
    
    @FXML
    void onClicked2(MouseEvent event) {
    	//if(!selectSchedule.getSelectionModel().isEmpty()) {
    		Counsel_dateVO conDate2 = selectSchedule.getSelectionModel().getSelectedItem();
    	try {
    		Stage myStage = new Stage(StageStyle.DECORATED);
    		myStage.initModality(Modality.WINDOW_MODAL);
    		Parent root = null;
    		root = FXMLLoader.load(getClass().getResource("../fxml/AplOk.fxml"));
    		Scene scene = new Scene(root);
    		myStage.setScene(scene);
    		myStage.show();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	//}//2번 if	
    }
    
    @FXML
    void initialize() {
        service = CounselServiceImpl.getInstance();
        List<ProfessorVO> proList = service.getProList();
        System.out.println(proList.toString());
       
       ObservableList<ProfessorVO> data = FXCollections.observableArrayList(proList);
       
       selectPro.setCellValueFactory(
    		   new PropertyValueFactory("pro_name"));
       
       selectCon.setCellValueFactory(
    		   new PropertyValueFactory("major_name"));
       
       selectOk.setCellValueFactory(
    		   new PropertyValueFactory("pro_position"));
       
       selectTable.setItems(data);
       
    }
}
