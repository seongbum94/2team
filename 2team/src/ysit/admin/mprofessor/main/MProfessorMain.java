package ysit.admin.mprofessor.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ysit.com.alert.AlertController;

public class MProfessorMain extends Application {

public static Stage mainStage;

	
	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("../fxml/MngProfessor.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene); 
			primaryStage.setTitle("교수관리");
			primaryStage.show();
			
		} catch (IOException e) {
			AlertController.warnning("에러", "교수관리 창 열기 실패!! 전산팀에 문의하세요.");
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
