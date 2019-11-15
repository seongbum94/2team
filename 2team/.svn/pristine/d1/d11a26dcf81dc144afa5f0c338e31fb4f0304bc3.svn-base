package ysit.student.emp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.student.emp.service.EmpServiceImpl;
import ysit.student.emp.service.IEmpService;
import ysit.vo.EmpVO;
import ysit.vo.NoticeVO;
/**
 * 
 * @author 민영
 */
public class empController {
	
	private IEmpService service;
	ObservableList<EmpVO> data;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Accordion accodion;

    @FXML
    private ComboBox<String> comboBox;	//검색유형

    @FXML
    private TextField txtfield;

    @FXML
    private Button search;	//검색버튼 클릭
    	
    @FXML
    private TableView<EmpVO> tableView;
    
    @FXML
    private TableColumn<EmpVO, Integer> boardNum; 	//게시글번호
    
    @FXML
    private TableColumn<EmpVO, String> title;	//게시글제목

    @FXML
    private TableColumn<EmpVO, String> writer;	//작성자

    @FXML
    private TableColumn<EmpVO, String> date;		//작성일

    @FXML
    private TableColumn<EmpVO, Integer> count;	//조회수

    @FXML
    void ClickSearch(MouseEvent event) {

    }

    @FXML
    void clickComboBox(MouseEvent event) {

    }

    @FXML
    void clickedCombo(ActionEvent event) {

    }
    
    @FXML
    void clickedCol(MouseEvent event) {	//테이블뷰 클릭하면 작성된 내용을 볼 수 있음
    	if(!tableView.getSelectionModel().isEmpty()) {
    		EmpVO.emp = tableView.getSelectionModel().getSelectedItem();
    		
    		try {
    	    	Stage myStage = new Stage(StageStyle.DECORATED);
    	        myStage.initModality(Modality.WINDOW_MODAL);
    	        Parent root = null;
    			root = FXMLLoader.load(getClass().getResource("../fxml/empNoticeRead.fxml"));
    			Scene scene = new Scene(root);
    			myStage.setScene(scene);
    			myStage.show();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
    		
    		
    	}
    }

    @FXML
    void clickedSearch(ActionEvent event) {
    	List<EmpVO> empList;
    	if (comboBox.getValue().equals("작성자")) {
    		empList = service.searchBoardWriter(txtfield.getText()); 	//작성자로 검색
    		data.clear();
    		data = FXCollections.observableArrayList(empList);
    		tableView.setItems(data);
		}
    	
    	if(comboBox.getValue().equals("제목")) {
    	   empList = service.searchBoardTitle(txtfield.getText());		//제목으로 검색
    	   data.clear();
    	   data = FXCollections.observableArrayList(empList);
    	   tableView.setItems(data);
    	}
    	
    	if(comboBox.getValue().equals("내용")) {
    	   empList =service.searchBoardContent(txtfield.getText());	//내용으로 검색
    	   data.clear();
    	   data = FXCollections.observableArrayList(empList);
    	   tableView.setItems(data);
    	   
    	}
    }	
    @FXML
    void clickedTxt(ActionEvent event) {

    }

    @FXML
    void inputTxt(InputMethodEvent event) {

    }

    @FXML
    void initialize() {
    	service = EmpServiceImpl.getInstance();
    	
    	ObservableList<String> dataList = FXCollections.observableArrayList(
    			"제목","작성자", "내용검색");
        //reason.setValue("선택하세요");
    	comboBox.setItems(dataList);
        TextArea txtArea = new TextArea();
        
        //ComboBox의 선택값이 변경되었을 때 처리
        comboBox.valueProperty().addListener(new ChangeListener<String>() {
        //combo.valueProperty().addListener(new ChangeListener<String>() {
           
           @Override
           public void changed(ObservableValue<? extends String> observable, 
                 String oldValue, String newValue) {
              txtArea.setText(newValue);
           }
           
        });
        
       List<EmpVO> empNoticeList = service.getAllBoardList();
       
       data = FXCollections.observableArrayList(empNoticeList);
       boardNum.setCellValueFactory(new PropertyValueFactory("emp_notice_id"));
       title.setCellValueFactory(new PropertyValueFactory("emp_notice_name"));
       writer.setCellValueFactory(new PropertyValueFactory("admin_name"));
       date.setCellValueFactory(new PropertyValueFactory("emp_date"));
       count.setCellValueFactory(new PropertyValueFactory("emp_cnt"));
       
       tableView.setItems(data);
       

    }
}
