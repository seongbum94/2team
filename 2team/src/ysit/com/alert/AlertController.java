package ysit.com.alert;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertController {
	public static void warnning(String head, String msg) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setHeaderText(head);
		alert.setContentText(msg);
		
		alert.showAndWait();
	}
	public static void info(String head, String msg) {
		Alert alertInfo = new Alert(AlertType.INFORMATION);
		
		alertInfo.setHeaderText(head);
		alertInfo.setContentText(msg);
		
		alertInfo.showAndWait();
	}
}
