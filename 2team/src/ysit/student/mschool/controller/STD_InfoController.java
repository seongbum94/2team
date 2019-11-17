package ysit.student.mschool.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import ysit.professor.counsel.service.ICounselService;
import ysit.student.mschool.service.IMSchoolService;
import ysit.student.mschool.service.MSchoolServiceImpl;
import ysit.vo.LoginVO;
import ysit.vo.ProfessorVO;
import ysit.vo.StudentVO;

public class STD_InfoController {
	IMSchoolService service;
	private StudentVO loginStu= (StudentVO)LoginVO.obj;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtName;  //이름입력창

    @FXML
    private ImageView imgPicture;  //프로필사진창

    @FXML
    private TextField regNum1; //주민번호앞자리 입력창

    @FXML
    private TextField entDate;  //입학일자 입력창

    @FXML
    private TextField year;  //학년 입력창

    @FXML
    private TextField stuId; //학번 입력창
 
    @FXML
    private TextField major; //학과 입력창

    @FXML
    private TextField register; //학적상태

    @FXML
    private TextField addr1; //주소창(검색할수있는)

    @FXML
    private TextField tel1; //연락처1(앞자리)

    @FXML
    private TextField email1; //이메일주소1

    @FXML
    private TextField bankName; //은행명 입력창

    @FXML
    private TextField account; //계좌번호 입력창

    @FXML
    private TextField accountHolder; //예금주 입력창

    @FXML
    private TextField regNum2;  //주민번호뒷자리

    @FXML
    private TextField tel2; //연락처2(중간)

    @FXML
    private TextField tel3; //연락처3(끝자리)

    @FXML
    private TextField email2; //이메일2

    @FXML
    private Button btnUpdate; //수정버튼

    @FXML
    private TextField addr2;  //상세주소 입력창

    @FXML
    void updateOnClick(ActionEvent event) {  //수정버튼
    	
    	StudentVO stuVO = new StudentVO();
    	
    	service.stuUpdate(stuVO);
    }

    @FXML
    void initialize() {
//    	StudentVO st = new StudentVO();
//    	st.setStu_id("1");
//    	st.setMajor_id("1");
//    	st.setStu_name("1");
//    	st.setStu_ent("1");
//    	st.setStu_regno1("1");
//    	st.setStu_regno2("1");
//    	st.setStu_register("1");
//    	st.setStu_tel("010-1111-1111");
//    	st.setStu_mail("1");
//    	st.setStu_addr("1");
//    	st.setMajor_name("컴퓨터공학과");
//    	st.setStu_warn(2);
//    	st.setStu_credits_point(2);
//    	st.setStu_graduation_minimum_credits(2);
//    	st.setStu_grant(2);
//    	st.setStu_mail("asd@naver.com");
    	
    	service = MSchoolServiceImpl.getInstance();
    	txtName.setText(loginStu.getStu_name());
    	regNum1.setText(loginStu.getStu_regno1());
    	regNum2.setText(loginStu.getStu_regno2());
    	entDate.setText(loginStu.getStu_ent());
    	stuId.setText(loginStu.getStu_id());
    	major.setText(loginStu.getMajor_name());
    	register.setText(loginStu.getStu_register());
    	addr1.setText(loginStu.getStu_addr());
    	
    	String[] str = loginStu.getStu_tel().split("-");
    	tel1.setText(str[0]);
    	tel2.setText(str[1]);
    	tel3.setText(str[2]);
    	
    	String[] str2 = loginStu.getStu_mail().split("@");
    	email1.setText(str2[0]);
    	email2.setText(str2[1]);
    	
    	bankName.setText(loginStu.getStu_bankName());
    	account.setText(loginStu.getStu_account());
    	accountHolder.setText(loginStu.getStu_accountHolder());
    	
    	
    	
    	
    }
}
