package ysit.student.notice.dao;

import java.util.List;

import ysit.vo.NoticeVO;

public interface INoticeDAO {
	/**
	 *  DB의 notice 테이블의 전체 레코드를 가져와 List에 담아서 반환하는 메서드
	 * @return NovtiveVo 객체를 담고있는 List객체
	 */
	public List<NoticeVO> getAllNotice();
	
}
