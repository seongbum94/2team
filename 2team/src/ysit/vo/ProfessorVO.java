package ysit.vo;

/**
 * 교수의 정보를 저장하는 VO
 *
 */

public class ProfessorVO {
	private String pro_id;					//교수 아이디 [PK]
	private String pro_pass;				//비밀번호
	private String pro_photo;				//사진 경로
	private String pro_name;				//교수 이름
	private String major_id;				//학과코드[FK]
	private String pro_bir;					//생일
	private String pro_position;			//직위
	private String pro_mail;				//이메일
	private String pro_addr;				//주소
	private String pro_car;					//경력
	private String pro_edu;					//학력
	private int pro_lab;					//연구실 번호
	private String pro_appointment_date;	//임용날짜
	private String pro_stat;				//재직 상태
	private int pro_grant;					//권한
	
	private String major_name; //join한 학과명 받아옴
	
	
	//getter, setter
	public String getMajor_name() {
		return major_name;
	}
	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_pass() {
		return pro_pass;
	}
	public void setPro_pass(String pro_pass) {
		this.pro_pass = pro_pass;
	}
	public String getPro_photo() {
		return pro_photo;
	}
	public void setPro_photo(String pro_photo) {
		this.pro_photo = pro_photo;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getMajor_id() {
		return major_id;
	}
	public void setMajor_id(String major_id) {
		this.major_id = major_id;
	}
	public String getPro_bir() {
		return pro_bir;
	}
	public void setPro_bir(String pro_bir) {
		this.pro_bir = pro_bir;
	}
	public String getPro_position() {
		return pro_position;
	}
	public void setPro_position(String pro_position) {
		this.pro_position = pro_position;
	}
	public String getPro_mail() {
		return pro_mail;
	}
	public void setPro_mail(String pro_mail) {
		this.pro_mail = pro_mail;
	}
	public String getPro_addr() {
		return pro_addr;
	}
	public void setPro_addr(String pro_addr) {
		this.pro_addr = pro_addr;
	}
	public String getPro_car() {
		return pro_car;
	}
	public void setPro_car(String pro_car) {
		this.pro_car = pro_car;
	}
	public String getPro_edu() {
		return pro_edu;
	}
	public void setPro_edu(String pro_edu) {
		this.pro_edu = pro_edu;
	}
	public int getPro_lab() {
		return pro_lab;
	}
	public void setPro_lab(int pro_lab) {
		this.pro_lab = pro_lab;
	}
	public String getPro_appointment_date() {
		return pro_appointment_date;
	}
	public void setPro_appointment_date(String pro_appointment_date) {
		this.pro_appointment_date = pro_appointment_date;
	}
	public String getPro_stat() {
		return pro_stat;
	}
	public void setPro_stat(String pro_stat) {
		this.pro_stat = pro_stat;
	}
	public int getPro_grant() {
		return pro_grant;
	}
	public void setPro_grant(int pro_grant) {
		this.pro_grant = pro_grant;
	}
	@Override
	public String toString() {
		return "ProfessorVO [pro_id=" + pro_id + ", pro_pass=" + pro_pass + ", pro_photo=" + pro_photo + ", pro_name="
				+ pro_name + ", major_id=" + major_id + ", pro_bir=" + pro_bir + ", pro_position=" + pro_position
				+ ", pro_mail=" + pro_mail + ", pro_addr=" + pro_addr + ", pro_car=" + pro_car + ", pro_edu=" + pro_edu
				+ ", pro_lab=" + pro_lab + ", pro_appointment_date=" + pro_appointment_date + ", pro_stat=" + pro_stat
				+ ", pro_grant=" + pro_grant + ", major_name=" + major_name + "]";
	}
	

	
}
