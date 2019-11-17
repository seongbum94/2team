package ysit.student.tuition.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ysit.admin.notice.controller.AdminAddCommentController;
import ysit.com.login.main.LoginMain;

public class TTN_REND2Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private TextField txtTuition;	//등록금 금액

    @FXML
    private TextField txtSchorlarship;	//장학금 금액

    @FXML
    private TextField txtTotal;	//총 합계금액

    @FXML
    private Button btnRefund;	//등록금환불 버튼

    @FXML
    void refundOnClick(ActionEvent event) {  //등록금 환불 버튼 실행
    	
    	Stage addStage = new Stage(StageStyle.DECORATED);
    	addStage.initModality(Modality.WINDOW_MODAL);

    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/TTN_RFND.fxml"));
    	try {
			Parent root = loader.load();
			TTN_RFNDController addCont = loader.getController();
			
			//addCont.setMainController(this);
			
			Scene s = new Scene(root);
			addStage.setScene(s);
			addStage.setTitle("등록금 환불");
			addStage.show();
			
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {

    }
}
