package ysit.professor.counsel.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

public class Pro_counController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> appDate;

    @FXML
    private TableColumn<?, ?> major;

    @FXML
    private TableColumn<?, ?> year;

    @FXML
    private TableColumn<?, ?> stuId;

    @FXML
    private TableColumn<?, ?> stuName;

    @FXML
    private TableColumn<?, ?> appReason;

    @FXML
    private TableColumn<?, ?> aprType;

    @FXML
    private DatePicker counDate;

    @FXML
    private Button btnSearch;

    @FXML
    void searchOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
