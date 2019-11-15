package ysit.professor.notice.service;

import ysit.professor.notice.dao.INoticeDao;
import ysit.professor.notice.dao.NoticeDaoImpl;

public class NoticeServiceImpl implements INoticeService {
	private static INoticeDao dao;
	private static NoticeServiceImpl service;
	
	private NoticeServiceImpl() {
		dao = NoticeDaoImpl.getInstance();
	}
	
	public static NoticeServiceImpl getInstance() {
		if(service == null)
			service = new NoticeServiceImpl();
		return service;
	}
}
