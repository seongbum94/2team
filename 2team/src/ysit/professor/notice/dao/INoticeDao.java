package ysit.professor.notice.dao;

import java.util.List;

import ysit.vo.NoticeVO;

public interface INoticeDao {

	List<NoticeVO> getNoticeList();
}
