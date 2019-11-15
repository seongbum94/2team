package ysit.admin.tuition.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class tuitionMain extends Application {

	public static Stage tuitMainStage;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		tuitMainStage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("../fxml/Tuition.fxml"));
		
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.setTitle("등록금납부관리");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
