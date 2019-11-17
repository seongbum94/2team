package ysit.professor.emp.service;

import java.util.List;

import ysit.vo.EmpVO;

public interface IEmpService {

	List<EmpVO> getEmpList();

	void increaseCnt(EmpVO emp);

	EmpVO getSelectedEmp(EmpVO emp);
	
	/**
	 * DB의 emp_notice 테이블에서 게시글의 제목의 내용이 포함되는 게시글을 검색하는 메서드
	 * @param emp_notice_id로 검색할 게시글 제목
	 * @return 검색된 결과가 저장된 List객체
	 */
	public List<EmpVO> searchTitle(String title);
	
	
	
	/**
	 * DB의 emp_notice 테이블에서 게시글의 작성자로 검색하는 메서드
	 * @param admin_name으로 검색할 게시글 제목
	 * @return 검색된 결과가 저장된 List객체
	 */
	public List<EmpVO> searchWriter(String name);
	
	
	
	/**
	 * DB의 emp_notice 테이블에서 게시글의 내용이 포함되는 게시물을 검색하는 메서드
	 * @param emp_content로 검색할 게시글 제목
	 * @return 검색된 결과가 저장된 List객체
	 */
	public List<EmpVO> searchContent(String content);
	
	/**
	 * DB의 emp_notice 테이블에서 사용자가 클릭한 글의 내용을 가져와서 보여주는 메서드
	 * @param letter
	 * @return 클릭한 결과가 저장된 List객체
	 */
	public List<EmpVO> clickNotice(String letter);
	
	
}
