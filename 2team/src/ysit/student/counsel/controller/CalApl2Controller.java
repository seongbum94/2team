package ysit.student.counsel.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import ysit.student.counsel.service.CounselServiceImpl;
import ysit.student.counsel.service.ICounselService;
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
    private TableView<?> selectSchedule;	

    @FXML
    private TableColumn<?, ?> selectDate;	// 날짜 선택 

    @FXML
    private TableColumn<?, ?> selectApply;	// 예약 신청

    @FXML
    void onClicked(MouseEvent event) {

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
