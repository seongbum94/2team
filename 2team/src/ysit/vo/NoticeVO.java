
package ysit.vo;

/**
 * 공지사항 게시글 정보를 저장하는 VO 
 */

public class NoticeVO {
	private int not_id;				// 공지사항 게시글번호[PK]
	private String admin_id;		// 작성자(관리자아이디)[FK]
	private String not_name;		// 공지사항 게시글 제목
	private String not_content;		// 공지사항 게시글 내용
	private String not_date;		// 공지사항 게시글 작성일
	private int not_cnt;			// 공지사항 게시글 조회수
	private String not_addcontent;  // 공지사항 게시글 첨부파일 경로
	
	
	
	
	// getter, setter
	
	public String getNot_addcontent() {
		return not_addcontent;
	}
	public void setNot_addcontent(String not_addcontent) {
		this.not_addcontent = not_addcontent;
	}

	public int getNot_id() {
		return not_id;
	}
	public void setNot_id(int not_id) {
		this.not_id = not_id;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getNot_name() {
		return not_name;
	}
	public void setNot_name(String not_name) {
		this.not_name = not_name;
	}
	public String getNot_content() {
		return not_content;
	}
	public void setNot_content(String not_content) {
		this.not_content = not_content;
	}
	public String getNot_date() {
		return not_date;
	}
	public void setNot_date(String not_date) {
		this.not_date = not_date;
	}
	public int getNot_cnt() {
		return not_cnt;
	}
	public void setNot_cnt(int not_cnt) {
		this.not_cnt = not_cnt;
	}
	// toString
	@Override
	public String toString() {
		return "NoticeVO [not_id=" + not_id + ", admin_id=" + admin_id + ", not_name=" + not_name + ", not_content="
				+ not_content + ", not_date=" + not_date + ", not_cnt=" + not_cnt + ", not_addcontent=" + not_addcontent
				+ "]";
	}
	

	
	
	
	}
	
	
	
	
	


