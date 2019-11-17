package ysit.vo;

/**
 * 학생이 수강신청한 정보를 저장하는 VO 
 */

public class EnClassVO {
	private String en_cart_id;		// 수강신청번호[PK]
	private String opsub_id;		// 개설코드[FK]
	private String stu_id;			// 학번[FK]
	private String sub_day_week;	// 요일
	private int sub_period;			// 교시
	private String en_date1;		// 신청시작일
	private String en_date2;		// 신청마감일
	
	
	// getter, setter
	public String getEn_cart_id() {
		return en_cart_id;
	}
	public void setEn_cart_id(String en_cart_id) {
		this.en_cart_id = en_cart_id;
	}
	public String getOpsub_id() {
		return opsub_id;
	}
	public void setOpsub_id(String opsub_id) {
		this.opsub_id = opsub_id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getSub_day_week() {
		return sub_day_week;
	}
	public void setSub_day_week(String sub_day_week) {
		this.sub_day_week = sub_day_week;
	}
	public int getSub_period() {
		return sub_period;
	}
	public void setSub_period(int sub_period) {
		this.sub_period = sub_period;
	}
	public String getEn_date1() {
		return en_date1;
	}
	public void setEn_date1(String en_date1) {
		this.en_date1 = en_date1;
	}
	public String getEn_date2() {
		return en_date2;
	}
	public void setEn_date2(String en_date2) {
		this.en_date2 = en_date2;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "EnClassVO [en_cart_id=" + en_cart_id + ", opsub_id=" + opsub_id + ", stu_id=" + stu_id
				+ ", sub_day_week=" + sub_day_week + ", sub_period=" + sub_period + ", en_date1=" + en_date1
				+ ", en_date2=" + en_date2 + "]";
	}


}
