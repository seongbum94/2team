package ysit.admin.mstudent.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ysit.com.alert.AlertController;

public class MStudentMain extends Application {
	
	public static Stage mainStage;

	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("../fxml/FxmlMStudent.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene); 
			primaryStage.setTitle("학생관리");
			primaryStage.show();
			
		} catch (IOException e) {
			AlertController.warnning("에러", "학생관리 창 열기 실패!! 전산팀에 문의하세요.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
