package ysit.student.emp.dao;

import java.util.List;

import ysit.vo.EmpVO;
import ysit.vo.NoticeVO;

public interface IEmpDao {

	/**
	 * DB의 emp_notice 테이블의 전체 레코드를 가져와 List에 담아서 반환하는 메서드
	 *  @return NoticeVO객체를 담고있는 List객체
	 */
	
	public List<EmpVO> getAllBoList();
	
	/**
	 * DB의 emp_notice 테이블에서 게시글의 제목의 내용이 포함되는 게시글을 검색하는 메서드
	 * @param emp_notice_id로 검색할 게시글 제목
	 * @return 검색된 결과가 저장된 List객체
	 */
	public List<EmpVO> searchBoardTitle(String title);
	
	
	/**
	 * DB의 emp_notice 테이블에서 게시글의 작성자로 검색하는 메서드
	 * @param name 
	 * @param admin_name으로 검색할 게시글 제목
	 * @return 검색된 결과가 저장된 List객체
	 */
	public List<EmpVO> searchBoardWriter(String name);
	
	
	/**
	 * DB의 emp_notice 테이블에서 게시글의 내용이 포함되는 게시물을 검색하는 메서드
	 * @param emp_content로 검색할 게시글 제목
	 * @return 검색된 결과가 저장된 List객체
	 */
	public List<EmpVO> searchBoardContent(String content);
	
	/**
	 * DB의 emp_notice 테이블에서 사용자가 클릭한 글의 내용을 가져와서 보여주는 메서드
	 * @param letter
	 * @return 클릭한 결과가 저장된 List객체
	 */
	public List<EmpVO> clickedNotice(String letter);
	
}
