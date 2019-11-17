package ysit.professor.subject.controller;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.professor.subject.service.ISubjectService;
import ysit.professor.subject.service.SubjectServiceImpl;
import ysit.vo.Counsel_dateVO;
import ysit.vo.LoginVO;
import ysit.vo.OpeningSubjectVO;
import ysit.vo.ProfessorVO;

public class ProSubController {
	ObservableList<OpeningSubjectVO> data;
	ISubjectService service;
	private ProfessorVO loginPro= (ProfessorVO)LoginVO.obj;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<OpeningSubjectVO> tableView;

    @FXML
    private TableColumn<?, ?> tableColumn;

    @FXML
    private CheckBox checkBox;

    @FXML
    private TableColumn<?, ?> colSubId;

    @FXML
    private TableColumn<?, ?> colSubName;

    @FXML
    private TableColumn<?, ?> colGrade;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colRoom;

    @FXML
    private TableColumn<?, ?> colCurriculum;

    @FXML
    private TableColumn<?, ?> colFixPeople;

    @FXML
    private Button btnOk;

    @FXML
    private Button sendMsg;

    @FXML
    private Button createSub;

    @FXML
    private Button deleteSub;

    @FXML
    void onClickCreateSub(ActionEvent event) {
		try {
			Stage myStage = new Stage(StageStyle.DECORATED);
			myStage.initModality(Modality.WINDOW_MODAL);
			
			Parent root = FXMLLoader.load(getClass().getResource("../fxml/pro_sub_add.fxml"));
			Scene scene = new Scene(root);
			myStage.setScene(scene);
			myStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void onClickDeleteSub(ActionEvent event) {

    }

    @FXML
    void onClickMsg(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	service = SubjectServiceImpl.getInstance(); 
    	
    	List<OpeningSubjectVO> openList = service.getOpenList(loginPro); 
    	for (OpeningSubjectVO open : openList) {
			open.setOpsub_date(open.getOp_day()+ " / " + open.getOp_class() + "교시");
		}
    	data = FXCollections.observableArrayList(openList);
    	
    	colSubId.setCellValueFactory(new PropertyValueFactory<>("opsub_id"));
    	colSubName.setCellValueFactory(new PropertyValueFactory<>("sub_name"));
    	colGrade.setCellValueFactory(new PropertyValueFactory<>("opsub_credit"));
    	colDate.setCellValueFactory(new PropertyValueFactory<>("opsub_date"));		
    	colRoom.setCellValueFactory(new PropertyValueFactory<>("sub_room"));
    	colCurriculum.setCellValueFactory(new PropertyValueFactory<>("pro_plan"));
    	colFixPeople.setCellValueFactory(new PropertyValueFactory<>("opsub_limit_people"));
    	
    	tableView.setItems(data);
    }
}
