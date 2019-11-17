package ysit.admin.schedule.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class scheduleMain extends Application {
	
	public static Stage schMainStage;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		schMainStage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("../fxml/AdminSchNotice.fxml"));
		
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.setTitle("학사일정관리");
		primaryStage.show();
	
	}


	public static void main(String[] args) {
		launch(args);
	}
}
