package ysit.admin.notice.dao;

import java.util.List;

import ysit.vo.NoticeVO;

public interface INoticeDao {

	
	public List<NoticeVO> getAllNotice();
	
	public boolean insertNotice(NoticeVO notVo);
	
//	public int setCountIncrement (int notCnt);
}
