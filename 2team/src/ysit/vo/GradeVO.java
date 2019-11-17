package ysit.vo;

/**
 * 수강학생 과목별 학점에 대한 정보를 저장하는 VO 
 */

public class GradeVO {
	private String en_cart_id;		// 수강신청번호[PK, FK]
	private String gra_grade;		// 등급
	private int gra_avg;			// 평점
	private int gra_sum;			// 총점
	
	
	// getter, setter
	public String getEn_cart_id() {
		return en_cart_id;
	}
	public void setEn_cart_id(String en_cart_id) {
		this.en_cart_id = en_cart_id;
	}
	public String getGra_grade() {
		return gra_grade;
	}
	public void setGra_grade(String gra_grade) {
		this.gra_grade = gra_grade;
	}
	public int getGra_avg() {
		return gra_avg;
	}
	public void setGra_avg(int gra_avg) {
		this.gra_avg = gra_avg;
	}
	public int getGra_sum() {
		return gra_sum;
	}
	public void setGra_sum(int gra_sum) {
		this.gra_sum = gra_sum;
	}
	
	// toString
	@Override
	public String toString() {
		return "GradeVO [en_cart_id=" + en_cart_id + ", gra_grade=" + gra_grade + ", gra_avg=" + gra_avg + ", gra_sum="
				+ gra_sum + "]";
	}

}
