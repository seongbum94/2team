package ysit.vo;

/**
 * 상담신청 정보를 저장하는 VO 
 *
 */

public class CounselVO {
	private String coun_id;			// 상담코드(PK)
	private String stu_id;			// 학생아이디(학번)(FK)
	private String pro_id;			// 교수아이디(교번)(FK)
	private String coun_type;		// 상담 종류
	private String coun_date;		// 상담 날짜
	private String coun_content;	// 상담 내용
	
	private String stu_name;		// 학생 이름(조인 결과 저장)
	
	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public CounselVO() {
	
	}
	
	public CounselVO(String coun_id, String stu_id, String pro_id, String coun_type, String coun_date, String coun_content) {
		this.coun_id = coun_id;
		this.stu_id = stu_id;
		this.pro_id = pro_id;
		this.coun_type = coun_type;
		this.coun_content = coun_content;
	}
	
	
	//getter, setter
	public String getCoun_id() {
		return coun_id;
	}
	public void setCoun_id(String coun_id) {
		this.coun_id = coun_id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getCoun_type() {
		return coun_type;
	}
	public void setCoun_type(String coun_type) {
		this.coun_type = coun_type;
	}
	public String getCoun_date() {
		return coun_date;
	}
	public void setCoun_date(String coun_date) {
		this.coun_date = coun_date;
	}
	public String getCoun_content() {
		return coun_content;
	}
	public void setCoun_content(String coun_content) {
		this.coun_content = coun_content;
	}
	
	// toString
	@Override
	public String toString() {
		return "CounselVO [coun_id=" + coun_id + ", stu_id=" + stu_id + ", pro_id=" + pro_id + ", coun_type="
				+ coun_type + ", coun_date=" + coun_date + ", coun_content=" + coun_content + "]";
	}
	
	
}
