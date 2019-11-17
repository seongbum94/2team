package ysit.professor.notice.service;

import java.util.List;

import ysit.professor.notice.dao.INoticeDao;
import ysit.professor.notice.dao.NoticeDaoImpl;
import ysit.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeService {
	private static INoticeDao dao;
	private static NoticeServiceImpl service;
	
	private NoticeServiceImpl() {
		dao = NoticeDaoImpl.getInstance();
	}
	
	public static NoticeServiceImpl getInstance() {
		if(service == null) service = new NoticeServiceImpl();
		return service;
	}

	@Override
	public List<NoticeVO> getNoticeList() {
		return dao.getNoticeList();
	}
}
