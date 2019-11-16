package ysit.professor.emp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.professor.emp.service.EmpServiceImpl;
import ysit.professor.emp.service.IEmpService;
import ysit.vo.EmpVO;

public class EmpBoardController {
	private IEmpService service;
	private ObservableList<EmpVO> data;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Accordion accodion;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField txtfield;

    @FXML
    private Button btnSearch;

    @FXML
    private TableView<EmpVO> tableView;

    @FXML
    private TableColumn<?, ?> colNum;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableColumn<?, ?> colWriter;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colCount;

    @FXML
    void ClickSearch(MouseEvent event) {

    }

    @FXML
    void clickComboBox(MouseEvent event) {

    }

    @FXML
    void clickedCol(MouseEvent event) {
    	if(!tableView.getSelectionModel().isEmpty()) {
    		EmpVO.emp = tableView.getSelectionModel().getSelectedItem();
    		
    		try {
    	    	Stage myStage = new Stage(StageStyle.DECORATED);
    	        myStage.initModality(Modality.WINDOW_MODAL);
    	        Parent root = null;
    			root = FXMLLoader.load(getClass().getResource("../fxml/empNoticeRead.fxml"));
    			Scene scene = new Scene(root);
    			myStage.setScene(scene);
    			myStage.showAndWait();
    			
    			data = FXCollections.observableArrayList(service.getEmpList());
    			tableView.setItems(data);
    			
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }

    @FXML
    void clickedCombo(ActionEvent event) {

    }

    @FXML
    void inputTxt(InputMethodEvent event) {

    }

    @FXML
    void onClickSearch(ActionEvent event) {
    	
    }

    @FXML
    void initialize() {
    	service = EmpServiceImpl.getInstance();
    	data = FXCollections.observableArrayList(service.getEmpList());
    	
    	colNum.setCellValueFactory(new PropertyValueFactory<>("emp_notice_id"));
    	colTitle.setCellValueFactory(new PropertyValueFactory<>("emp_notice_name"));
    	colWriter.setCellValueFactory(new PropertyValueFactory<>("admin_name"));
    	colDate.setCellValueFactory(new PropertyValueFactory<>("emp_date"));
    	colCount.setCellValueFactory(new PropertyValueFactory<>("emp_cnt"));
    	tableView.setItems(data);
    	
    	ObservableList<String> boxData = FXCollections.observableArrayList("제목","작성자","내용");
    	comboBox.setItems(boxData);
    }
}
