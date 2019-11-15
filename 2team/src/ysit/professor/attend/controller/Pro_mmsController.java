package ysit.professor.attend.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

public class Pro_mmsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnSend;

    @FXML
    private TableColumn<?, ?> major;

    @FXML
    private TableColumn<?, ?> year;

    @FXML
    private TableColumn<?, ?> stuId;

    @FXML
    private TableColumn<?, ?> stuName;

    @FXML
    private TableColumn<?, ?> tel;

    @FXML
    private TextArea txtArea;

    @FXML
    void btnSend(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
