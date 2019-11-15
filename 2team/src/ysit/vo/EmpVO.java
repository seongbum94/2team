package ysit.vo;

/**
 * 취업정보 게시글 정보를 저장하는 VO 
 */

public class EmpVO {
	private int emp_notice_id;			// 취업정보 게시물번호[PK]
	private String admin_id;			// 사번(관리자아이디)[FK]
	private String emp_notice_name;		// 취업정보 게시글 제목
	private String emp_content;			// 취업정보 게시글 내용
	private String emp_date;			// 취업정보 게시글 작성일
	private int emp_cnt;				// 취업정보 게시글 조회수
	private String emp_addcontent;		// 취업정보 파일첨부 경로
	private String admin_name; 	//admin 테이블의 관리자 이름(민영추가했어용)
	
	public static EmpVO emp;
	
	// getter, setter
	public int getEmp_notice_id() {
		return emp_notice_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public void setEmp_notice_id(int emp_notice_id) {
		this.emp_notice_id = emp_notice_id;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getEmp_notice_name() {
		return emp_notice_name;
	}
	public void setEmp_notice_name(String emp_notice_name) {
		this.emp_notice_name = emp_notice_name;
	}
	public String getEmp_content() {
		return emp_content;
	}
	public void setEmp_content(String emp_content) {
		this.emp_content = emp_content;
	}
	public String getEmp_date() {
		return emp_date;
	}
	public void setEmp_date(String emp_date) {
		this.emp_date = emp_date;
	}
	public int getEmp_cnt() {
		return emp_cnt;
	}
	public void setEmp_cnt(int emp_cnt) {
		this.emp_cnt = emp_cnt;
	}
	public String getEmp_addcontent() {
		return emp_addcontent;
	}
	public void setEmp_addcontent(String emp_addcontent) {
		this.emp_addcontent = emp_addcontent;
	}
	// toString
	@Override
	public String toString() {
		return "EmpVO [emp_notice_id=" + emp_notice_id + ", admin_id=" + admin_id + ", emp_notice_name="
				+ emp_notice_name + ", emp_content=" + emp_content + ", emp_date=" + emp_date + ", emp_cnt=" + emp_cnt
				+ ", emp_addcontent=" + emp_addcontent + ", admin_name=" + admin_name + "]";
	}
	

	
	
}
