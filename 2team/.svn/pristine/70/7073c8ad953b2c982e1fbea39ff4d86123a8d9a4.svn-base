package ysit.admin.mainPage.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import ysit.vo.AdminVO;
import ysit.vo.LoginVO;
import ysit.vo.StudentVO;

public class AdmMainPageController {
	private AdminVO loginAdm= (AdminVO)LoginVO.obj;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane adminMain;

    @FXML
    private TitledPane adminNotice;

    @FXML
    private Label adminNoticeLabel;

    @FXML
    private Label adminEmp;

    @FXML
    private TitledPane adminSubject;

    @FXML
    private Label adminAddSub;

    @FXML
    private Label adminDelSub;

    @FXML
    private Label adminSearchSub;

    @FXML
    private TitledPane adminPro;

    @FXML
    private Label adminAddPro;

    @FXML
    private TitledPane adminStu;

    @FXML
    private Label adminStuInf;

    @FXML
    private Label adminStuGrade;

    @FXML
    private Label adminStuA;

    @FXML
    private TitledPane adminStuState;

    @FXML
    private Label adminRest;

    @FXML
    private Label adminComeBack;

    @FXML
    private Label adminLeave;

    @FXML
    private TitledPane adminSch;

    @FXML
    private Label adminSchLabel;

    @FXML
    private TitledPane adminTuit;

    @FXML
    private Label adminTuitOk;

    @FXML
    private Label adminTuitNo;

    @FXML
    private ListView<?> empNotice;

    @FXML
    private ListView<?> noticePage;

    @FXML
    private TextField txtName;

    @FXML
    private Label txtAdmId;

    @FXML
    private TextField txtEmpId;

    @FXML
    private Label opening;

    @FXML
    private Label loginLabel;

    @FXML
    private Button btnLogOut;
    
    @FXML
    void logOutOnClick(ActionEvent event) {

    }
    
    @FXML
    void onClickDrop(MouseEvent event) throws IOException {
    	Parent AdminApplyDrop= FXMLLoader.load(getClass().getResource("../../apply/fxml/fxmlApplyDrop.fxml"));
   		adminMain.setCenter(AdminApplyDrop);
    }

    @FXML
    void onClickRest(MouseEvent event) {

    }

    @FXML
    void onClickReturn(MouseEvent event) {

    }
    
    @FXML
    void onClickNotice(MouseEvent event) throws IOException {
    	Parent AdminNotice= FXMLLoader.load(getClass().getResource("../../notice/fxml/adminNotice.fxml"));
   		adminMain.setCenter(AdminNotice);
    }
    @FXML
    void initialize() {
    	opening.setText(loginAdm.getAdmin_name()+"님 환영합니다.");
    	loginLabel.setText("관리자(으)로 로그인 하셨습니다.");
    }
}
