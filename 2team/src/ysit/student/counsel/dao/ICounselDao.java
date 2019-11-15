package ysit.student.counsel.dao;

import java.util.List;

import ysit.vo.CounselVO;
import ysit.vo.ProfessorVO;

public interface ICounselDao {
	/**
	 * DB의 professor 테이블의 레코드를 가져와서 LIST에 담아서 반환하는 메서드
	 * @return ProfessorVO객체를 담고 있는 List객체
	 */
	List<ProfessorVO> getProList();

	/**
	 * CounselVO에 담겨진 자료를 DB에 insert하는 메서드
	 * @param conVO DB에 insert할 자료가 저장된 CounselVO객체
	 * @return insert작업이 성공하면 1, 실패하면 0 반환
	 */
	public int insertCon(CounselVO conVo);
}
