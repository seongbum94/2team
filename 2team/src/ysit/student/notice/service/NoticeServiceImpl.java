package ysit.student.notice.service;

import java.util.List;

import ysit.student.notice.dao.INoticeDAO;
import ysit.student.notice.dao.NoticeDAOImpl;
import ysit.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeService{
	private static NoticeServiceImpl service;
	private static INoticeDAO dao;
	
	private NoticeServiceImpl() {
		dao = NoticeDAOImpl.getInstance();
	}
	
	public static NoticeServiceImpl getInstance() {
		if(service == null)
			service = new NoticeServiceImpl();
		return service;
	}

	@Override
	public List<NoticeVO> getAllNotice() {
		return dao.getAllNotice();
	}

	
	
	
}
