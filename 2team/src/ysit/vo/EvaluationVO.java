package ysit.vo;

/**
 * 학생이 수강한 강의에 대한 평가를 저장하는 VO 
 */

public class EvaluationVO {
	private String stu_id;					 // 학번[PK, FK]
	private String opsub_id;				 // 개설코드[FK]
	private int eval_score;					 // 평가점수
	private String eval_descriptive_test;	 // 서술형평가
	
	
	// getter, setter
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getOpsub_id() {
		return opsub_id;
	}
	public void setOpsub_id(String opsub_id) {
		this.opsub_id = opsub_id;
	}
	public int getEval_score() {
		return eval_score;
	}
	public void setEval_score(int eval_score) {
		this.eval_score = eval_score;
	}
	public String getEval_descriptive_test() {
		return eval_descriptive_test;
	}
	public void setEval_descriptive_test(String eval_descriptive_test) {
		this.eval_descriptive_test = eval_descriptive_test;
	}
	
	// toString
	@Override
	public String toString() {
		return "EvaluationVO [stu_id=" + stu_id + ", opsub_id=" + opsub_id + ", eval_score=" + eval_score
				+ ", eval_descriptive_test=" + eval_descriptive_test + "]";
	}

	
}
