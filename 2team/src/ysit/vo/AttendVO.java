package ysit.vo;

/**
 * 학생의 출결(출석, 결석, 지각, 조퇴) 정보를 저장하는 VO 
 *
 */


public class AttendVO {
	private String att_date;		// 학생 출석일 [PK]
	private String stu_id;			// 학번 [PK,FK]
	private String en_cart_id;		// 수강신청번호 [PK,FK]
	private String att_type;		// 학생 출석구분
	private String att_content;		// 사유(결석, 지각, 조퇴)
	
	
	//getter, setter
	public String getAtt_date() {
		return att_date;
	}
	public void setAtt_date(String att_date) {
		this.att_date = att_date;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getEn_cart_id() {
		return en_cart_id;
	}
	public void setEn_cart_id(String en_cart_id) {
		this.en_cart_id = en_cart_id;
	}
	public String getAtt_type() {
		return att_type;
	}
	public void setAtt_type(String att_type) {
		this.att_type = att_type;
	}
	public String getAtt_content() {
		return att_content;
	}
	public void setAtt_content(String att_content) {
		this.att_content = att_content;
	}
	
	// toString
	@Override
	public String toString() {
		return "AttendVO [att_date=" + att_date + ", stu_id=" + stu_id + ", en_cart_id=" + en_cart_id + ", att_type="
				+ att_type + ", att_content=" + att_content + "]";
	}
}