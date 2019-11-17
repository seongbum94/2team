package ysit.student.notice.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import ysit.admin.notice.serivce.INoticeService;
import ysit.admin.notice.serivce.NoticeServiceImpl;
import ysit.vo.NoticeVO;

public class NoticeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Accordion accodion;

    @FXML
    private ComboBox<?> comboBox;

    @FXML
    private TextField txtfield;

    @FXML
    private Button search;

    @FXML
    private TableView<NoticeVO> tableView;

    @FXML
    private TableColumn<?, ?> title;	//제목

    @FXML
    private TableColumn<?, ?> writer;	//작성자

    @FXML
    private TableColumn<?, ?> date; 	//작성일

    @FXML
    private TableColumn<?, ?> count;	//조회수

    @FXML
    void ClickSearch(MouseEvent event) {

    }

    @FXML
    void clickComboBox(MouseEvent event) {

    }

    @FXML
    void clickedCombo(ActionEvent event) {    //검색 제목 콤보박스

    }

    @FXML
    void clickedSearch(ActionEvent event) {    //검색버튼

    }

    @FXML
    void clickedTxt(ActionEvent event) {   //검색 입력창

    }
    
    // TableView에 출력할 데이터가 저장될 List객체 선언
    private ObservableList<NoticeVO> data;
    
    // Service객체 변수 선언 서비스 호출하기 위해서
    private INoticeService service;
    
    private List<NoticeVO> notList;

    @FXML
    void initialize() {
    	title.setCellValueFactory(new PropertyValueFactory<>("not_name"));
    	writer.setCellValueFactory(new PropertyValueFactory<>("admin_id"));
    	date.setCellValueFactory(new PropertyValueFactory<>("not_date"));
    	date.setCellValueFactory(new PropertyValueFactory<>("not_cnt"));
    	
    	service = NoticeServiceImpl.getInstance();
    	
    	setTableViewData(); 
    }
    
    public void setTableViewData() {
    	notList = service.getAllNotice();
 
    	data = FXCollections.observableArrayList(notList);
    	tableView.setItems(data);
    }
    
}