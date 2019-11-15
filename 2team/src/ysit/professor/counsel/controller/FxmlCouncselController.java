package ysit.professor.counsel.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import ysit.professor.counsel.service.CounselServiceImpl;
import ysit.professor.counsel.service.ICounselService;
import ysit.vo.CounselVO;
import ysit.vo.LoginVO;
import ysit.vo.ProfessorVO;

public class FxmlCouncselController {
	ICounselService service;
	private ProfessorVO loginPro= (ProfessorVO)LoginVO.obj;
	ObservableList<CounselVO> data;
	
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
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colMajor;

    @FXML
    private TableColumn<?, ?> colStu;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableColumn<?, ?> colConsent;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnReset;

    @FXML
    void okOnClick(ActionEvent event) {
    	CounselVO counsel = (CounselVO)tableView.getSelectionModel().getSelectedItem();
    	counsel.setCoun_consent("승인");
    	System.out.println(counsel.toString());
    	service.changeConsent(counsel);
    	tableView.refresh();
    }

    @FXML
    void onClickTable(MouseEvent event) {
    	
    }

    @FXML
    void refusalClick(ActionEvent event) {
    	CounselVO counsel = (CounselVO)tableView.getSelectionModel().getSelectedItem();
    	counsel.setCoun_consent("반려");
    	System.out.println(counsel.toString());
    	service.changeConsent(counsel);
    	tableView.refresh();
    }

    @FXML
    void initialize() {
    	service = CounselServiceImpl.getInstance();
    	
    	List<CounselVO> counselList = service.getCounselList(loginPro.getPro_id());
    	
    	data = FXCollections.observableArrayList(counselList);
    	
    	colDate.setCellValueFactory(new PropertyValueFactory<>("coun_date"));
    	colMajor.setCellValueFactory(new PropertyValueFactory<>("major_name"));
    	colStu.setCellValueFactory(new PropertyValueFactory<>("stu_id"));
    	colName.setCellValueFactory(new PropertyValueFactory<>("stu_name"));
    	colType.setCellValueFactory(new PropertyValueFactory<>("coun_type"));
    	colConsent.setCellValueFactory(new PropertyValueFactory<>("coun_consent"));
    	
    	tableView.setItems(data);
    }
}
