package ysit.professor.attend.vo;

import java.awt.Checkbox;

public class AttendentVO {
	String date;
	String major;
	String stu_id;
	int grade;
	String stu_name;
	String attend;
	Checkbox check;

	public String getDate() {
		return date;
	}
	public Checkbox getCheck() {
		return check;
	}
	public void setCheck(Checkbox check) {
		this.check = check;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getAttend() {
		return attend;
	}
	public void setAttend(String attend) {
		this.attend = attend;
	}
}
