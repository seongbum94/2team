package ysit.professor.counsel.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ysit.professor.counsel.service.CounselServiceImpl;
import ysit.professor.counsel.service.ICounselService;
import ysit.vo.CounselVO;
import ysit.vo.LoginVO;
import ysit.vo.ProfessorVO;

public class FxmlCouncselController {
	ICounselService service;
	private ProfessorVO loginPro= (ProfessorVO)LoginVO.obj;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnOk;

    @FXML
    private Button refusal;

    @FXML
    private TableView<CounselVO> tableView;

    @FXML
    private TableColumn<?, ?> counNum;

    @FXML
    private TableColumn<?, ?> stuId;

    @FXML
    private TableColumn<?, ?> stuName;

    @FXML
    private TableColumn<?, ?> counType;

    @FXML
    private TableColumn<?, ?> counContent;

    @FXML
    void okOnClick(ActionEvent event) {

    }

    @FXML
    void refusalClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	service = CounselServiceImpl.getInstance();
    	
    	List<CounselVO> counselList = service.getCounselList(loginPro.getPro_id());
    	
    	ObservableList<CounselVO> data = FXCollections.observableArrayList(counselList);
    	
    	counNum.setCellValueFactory(new PropertyValueFactory<>("coun_id"));
    	stuId.setCellValueFactory(new PropertyValueFactory<>("stu_id"));
    	stuName.setCellValueFactory(new PropertyValueFactory<>("stu_name"));
    	counType.setCellValueFactory(new PropertyValueFactory<>("coun_type"));
    	counContent.setCellValueFactory(new PropertyValueFactory<>("coun_content"));
    	
    	tableView.setItems(data);
    }
}
