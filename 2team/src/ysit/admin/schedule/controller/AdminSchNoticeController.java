package ysit.admin.schedule.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class AdminSchNoticeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TitledPane adminNoticeTitle;

    @FXML
    private Label adminNotice;

    @FXML
    private Label adminEmp;

    @FXML
    private TitledPane adminSubject;

    @FXML
    private Label adminAddSub;

    @FXML
    private Label adminDelSub;

    @FXML
    private Label adminSearchSub;

    @FXML
    private TitledPane adminPro;

    @FXML
    private Label adminAddPro;

    @FXML
    private TitledPane adminStu;

    @FXML
    private Label adminStuInf;

    @FXML
    private Label adminStuGrade;

    @FXML
    private Label adminStuA;

    @FXML
    private TitledPane adminStuState;

    @FXML
    private Label adminRest;

    @FXML
    private Label adminComeBack;

    @FXML
    private Label adminLeave;

    @FXML
    private TitledPane adminSchTitle;

    @FXML
    private Label adminSch;

    @FXML
    private TitledPane adminTuit;

    @FXML
    private Label adminTuitOk;

    @FXML
    private Label adminTuitNo;

    @FXML
    private ComboBox<?> comTitleSearch;

    @FXML
    private TextField searchText;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnInsert;

    @FXML
    private TableView<?> noticeTableView;

    @FXML
    private TableColumn<?, ?> contentNum;

    @FXML
    private TableColumn<?, ?> contentTitle;

    @FXML
    private TableColumn<?, ?> contentDate;

    @FXML
    private TableColumn<?, ?> contentConut;

    @FXML
    private Pagination noticePagination;

    @FXML
    void onClickedComTitle(ActionEvent event) {

    }

    @FXML
    void onClickedNoticeInsert(ActionEvent event) {

    }

    @FXML
    void onClickedSearch(ActionEvent event) {

    }

    @FXML
    void searchTextfiled(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert adminNoticeTitle != null : "fx:id=\"adminNoticeTitle\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminNotice != null : "fx:id=\"adminNotice\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminEmp != null : "fx:id=\"adminEmp\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminSubject != null : "fx:id=\"adminSubject\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminAddSub != null : "fx:id=\"adminAddSub\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminDelSub != null : "fx:id=\"adminDelSub\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminSearchSub != null : "fx:id=\"adminSearchSub\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminPro != null : "fx:id=\"adminPro\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminAddPro != null : "fx:id=\"adminAddPro\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminStu != null : "fx:id=\"adminStu\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminStuInf != null : "fx:id=\"adminStuInf\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminStuGrade != null : "fx:id=\"adminStuGrade\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminStuA != null : "fx:id=\"adminStuA\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminStuState != null : "fx:id=\"adminStuState\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminRest != null : "fx:id=\"adminRest\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminComeBack != null : "fx:id=\"adminComeBack\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminLeave != null : "fx:id=\"adminLeave\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminSchTitle != null : "fx:id=\"adminSchTitle\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminSch != null : "fx:id=\"adminSch\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminTuit != null : "fx:id=\"adminTuit\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminTuitOk != null : "fx:id=\"adminTuitOk\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert adminTuitNo != null : "fx:id=\"adminTuitNo\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert comTitleSearch != null : "fx:id=\"comTitleSearch\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert searchText != null : "fx:id=\"searchText\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert btnSearch != null : "fx:id=\"btnSearch\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert btnInsert != null : "fx:id=\"btnInsert\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert noticeTableView != null : "fx:id=\"noticeTableView\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert contentNum != null : "fx:id=\"contentNum\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert contentTitle != null : "fx:id=\"contentTitle\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert contentDate != null : "fx:id=\"contentDate\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert contentConut != null : "fx:id=\"contentConut\" was not injected: check your FXML file 'adminSchNotice.fxml'.";
        assert noticePagination != null : "fx:id=\"noticePagination\" was not injected: check your FXML file 'adminSchNotice.fxml'.";

    }
}
