package ysit.admin.notice.controller;

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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.admin.notice.main.AdminNoticeMain;
import ysit.admin.notice.serivce.INoticeService;
import ysit.admin.notice.serivce.NoticeServiceImpl;
import ysit.vo.NoticeVO;

public class AdminNoticeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<NoticeVO> noticeTableView; // 공지사항 목록 테이블

    @FXML
    private TableColumn<?, ?> contentNum; // 글번호 컬럼

    @FXML
    private TableColumn<?, ?> contentTitle; // 글제목 컬럼

    @FXML
    private TableColumn<?, ?> contentDate; // 글작성일 컬럼

    @FXML
    private TableColumn<?, ?> contentConut; // 글조회수 컬럼

    @FXML
    private Pagination noticePagination; // pagination

    @FXML
    private ComboBox<String> comTitleSearch; // 검색 제목 콤보박스

    @FXML
    private TextField searchText;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnInsert;

    @FXML
    void onClickedComTitle(ActionEvent event) { // 콤보박스 클릭시 이벤트 실행 메서드

    }

    @FXML
    void onClickedNoticeInsert(ActionEvent event) { // 등록 버튼 클릭시 
    	Stage addStage = new Stage(StageStyle.DECORATED);
    	addStage.initModality(Modality.WINDOW_MODAL);
    	addStage.initOwner(AdminNoticeMain.notMainStage);

    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/adminAddComment.fxml"));
    	try {
			Parent root = loader.load();
			AdminAddCommentController addCont = loader.getController();
			addCont.setMainController(this);
			
			Scene s = new Scene(root);
			addStage.setScene(s);
			addStage.setTitle("공지사항 등록");
			addStage.show();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    @FXML
    void clickedNoticeTableView(MouseEvent event) { // 테이블 클릭 시 
    	if(!noticeTableView.getSelectionModel().isEmpty()) {
    		NoticeVO notVo = noticeTableView.getSelectionModel().getSelectedItem();
    		
    		Stage notr = new Stage(StageStyle.DECORATED);
    		notr.initModality(Modality.WINDOW_MODAL);
    		notr.initOwner(AdminNoticeMain.notMainStage);
    		
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/adminNoticeRead.fxml"));
    		try {
				Parent root = loader.load();
				AdminNoticeReadController noticeReadCon = loader.getController();
				
				noticeReadCon.showNotice(notVo);
				
				Scene s = new Scene(root);
				notr.setScene(s);
				notr.setTitle("공지사항");
				notr.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}

    }

    @FXML
    void onClickedSearch(ActionEvent event) { // 제목 검색 시 

    }

    @FXML
    void searchTextfiled(ActionEvent event) { // 검색 제목 입력 필드 
    	

    }

    // TableView에 출력할 데이터가 저장될 List객체 선언
    private ObservableList<NoticeVO> data;
    
    // Service객체 변수 선언 서비스 호출하기 위해서
    private INoticeService service;
    
    private List<NoticeVO> notList;
    
    
    
    @FXML
    void initialize() {
    	
    	contentNum.setCellValueFactory(new PropertyValueFactory<>("not_id"));
    	contentTitle.setCellValueFactory(new PropertyValueFactory<>("not_name"));
    	contentDate.setCellValueFactory(new PropertyValueFactory<>("not_date"));
    	contentConut.setCellValueFactory(new PropertyValueFactory<>("not_cnt"));
    	
    	service = NoticeServiceImpl.getInstance();
    	
    	setTableViewData(); 
    	
    	
    }
    
    public void setTableViewData() {
    	notList = service.getAllNotice();
 
    	data = FXCollections.observableArrayList(notList);
    	noticeTableView.setItems(data);
    }

}
