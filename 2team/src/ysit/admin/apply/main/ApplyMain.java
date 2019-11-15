package ysit.admin.apply.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplyMain extends Application {
	public static Stage mainStage;

	
	@Override
	public void start(Stage primaryStage) throws IOException {
		mainStage = primaryStage;
		Parent root = 
			FXMLLoader.load(getClass().getResource("../fxml/FxmlApplyDrop.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("자퇴신청관리");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
