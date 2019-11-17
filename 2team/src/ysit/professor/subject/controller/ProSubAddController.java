package ysit.professor.subject.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.com.alert.AlertController;
import ysit.professor.subject.service.ISubjectService;
import ysit.professor.subject.service.SubjectServiceImpl;
import ysit.vo.LoginVO;
import ysit.vo.OpeningSubjectVO;
import ysit.vo.ProfessorVO;

public class ProSubAddController {
	ISubjectService service;
	private ProfessorVO loginPro= (ProfessorVO)LoginVO.obj;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField tfSubName;

    @FXML
    private Button btnCreate;

    @FXML
    private TextField tfsubId;

    @FXML
    private ComboBox<String> gubun;

    @FXML
    private ComboBox<String> subDate;

    @FXML
    private ComboBox<String> subTime;

    @FXML
    private TextArea txtArea;

    @FXML
    private Label labelFile;

    @FXML
    private Button curriculum1;

    @FXML
    private TextField tfMax;

    @FXML
    void addClicked(ActionEvent event) {

    }

    @FXML
    void clicked(ActionEvent event) {

    }

    @FXML
    void combo1(ActionEvent event) {

    }

    @FXML
    void combo2(ActionEvent event) {

    }

    @FXML
    void combo3(ActionEvent event) {

    }

    @FXML
    void inputTxt(InputMethodEvent event) {

    }

    @FXML
    void onClickeCreate(ActionEvent event) throws IOException {
    	OpeningSubjectVO open = new OpeningSubjectVO();
    	open.setOpsub_id(service.getMaxOpId());
    	open.setSub_id(tfsubId.getText());
    	open.setSub_name(tfSubName.getText());
    	open.setOp_class(Integer.parseInt(subTime.getValue().substring(0,1)));
    	open.setSub_room(service.getMaxRoom());
    	open.setOp_day(subDate.getValue().substring(0,1));
    	open.setOpsub_sem(Integer.parseInt(gubun.getValue().substring(0,1)));
    	open.setPro_plan(labelFile.getText());
    	open.setOpsub_limit_people(Integer.parseInt(tfMax.getText()));
    	open.setPro_id(loginPro.getPro_id());
    	
    	service.createSubject(open);
    	int cnt = service.insertSubject(open);
    	
    	if(cnt > 0) {
    		Stage myStage = new Stage(StageStyle.DECORATED);
    		myStage.initModality(Modality.WINDOW_MODAL);
    		Parent root = FXMLLoader.load(getClass().getResource("../fxml/pro_sub_add_ok.fxml"));
    		Scene scene = new Scene(root);
    		myStage.setScene(scene);
    		myStage.show();
    		
    		Stage stage = (Stage) btnCreate.getScene().getWindow();  
        	stage.close();  
    		
    	} else {
    		AlertController.warnning("개설 실패", "개설 신청을 실패했습니다!");
    	}
    	
    }

    @FXML
    void initialize() {
    	
    	service = SubjectServiceImpl.getInstance(); 
    	ObservableList<String> dayData = FXCollections.observableArrayList(
			"월요일","화요일","수요일","목요일","금요일"
		);
    	subDate.setItems(dayData);
    	
    	ObservableList<String> classData = FXCollections.observableArrayList(
			"1교시","2교시","3교시","4교시","5교시","6교시","7교시","8교시","9교시"
    	);
    	subTime.setItems(classData);
    	
    	ObservableList<String> gubunData = FXCollections.observableArrayList(
			"1학기","2학기"
    	);
    	gubun.setItems(gubunData);
    	
    	gubun.valueProperty().addListener(new ChangeListener<String>() {
    		@Override
    		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
    			tfsubId.setText(service.getOpId(Integer.parseInt(newValue.substring(0,1))));
    		}
		});;
    }
}
