package ysit.professor.notice.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import ysit.professor.notice.service.INoticeService;
import ysit.professor.notice.service.NoticeServiceImpl;
import ysit.vo.NoticeVO;

public class Pro_Notice_Controller {
	INoticeService service;
	ObservableList<NoticeVO> data;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> combo;

    @FXML
    private TextField textField;

    @FXML
    private Button btnSearch;

    @FXML
    private TableView<NoticeVO> tableView;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableColumn<?, ?> colWriter;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colCount;

    @FXML
    void onClickedCom(ActionEvent event) {

    }

    @FXML
    void onClickedSear(ActionEvent event) {

    }

    @FXML
    void textFiledClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	service = NoticeServiceImpl.getInstance();
    	List<NoticeVO> noticeList = service.getNoticeList();
    	data = FXCollections.observableArrayList(noticeList);
    	tableView.setItems(data);
    }
}
