package ysit.admin.notice.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminNoticeMain extends Application {

	public static Stage notMainStage;
	

	@Override
	public void start(Stage primaryStage) {
		notMainStage = primaryStage;
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("../fxml/adminNotice.fxml"));
			Scene s = new Scene(root);
			primaryStage.setScene(s);
			primaryStage.setTitle("공지사항관리");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
