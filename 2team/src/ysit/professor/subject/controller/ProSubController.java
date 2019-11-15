package ysit.professor.subject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;

public class ProSubController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> tableColumn;

    @FXML
    private CheckBox checkBox;

    @FXML
    private TableColumn<?, ?> subId;

    @FXML
    private TableColumn<?, ?> subName;

    @FXML
    private TableColumn<?, ?> grade;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private TableColumn<?, ?> subClass;

    @FXML
    private TableColumn<?, ?> curriculum;

    @FXML
    private TableColumn<?, ?> fixPeople;

    @FXML
    private Button btnOk;

    @FXML
    private Button sendMsg;

    @FXML
    private Button createSub;

    @FXML
    private Button deleteSub;

    @FXML
    void initialize() {
       
    }
}

