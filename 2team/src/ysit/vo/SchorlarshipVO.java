package ysit.vo;

/**
 * 장학금 정보를 저장하는 VO 
 * 
 *
 */

public class SchorlarshipVO {
	private String sch_id;			// 장학금번호[PK]
	private String opsub_year;		// 개설년도
	private String tuit_sem;		// 학기
	private String stu_id;			// 학번[FK]
	private int sch_money;			// 장학금액
	
	// getter, setter
	public String getSch_id() {
		return sch_id;
	}
	public void setSch_id(String sch_id) {
		this.sch_id = sch_id;
	}
	public String getOpsub_year() {
		return opsub_year;
	}
	public void setOpsub_year(String opsub_year) {
		this.opsub_year = opsub_year;
	}
	public String getTuit_sem() {
		return tuit_sem;
	}
	public void setTuit_sem(String tuit_sem) {
		this.tuit_sem = tuit_sem;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public int getSch_money() {
		return sch_money;
	}
	public void setSch_money(int sch_money) {
		this.sch_money = sch_money;
	}
	
	// toString
	@Override
	public String toString() {
		return "SchorlarshipVO [sch_id=" + sch_id + ", opsub_year=" + opsub_year + ", tuit_sem=" + tuit_sem
				+ ", stu_id=" + stu_id + ", sch_money=" + sch_money + "]";
	}
	
	
	
	
	

}
