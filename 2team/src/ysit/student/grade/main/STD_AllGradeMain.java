package ysit.student.grade.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * 아싸~성적조회~Main
 * @author 민영
 *
 */
public class STD_AllGradeMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../fxml/CalApl.fxml"));
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
