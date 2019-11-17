package ysit.admin.notice.serivce;

import java.util.List;

import ysit.admin.notice.dao.INoticeDao;
import ysit.admin.notice.dao.NoticeDaoImpl;
import ysit.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeService{
	private static NoticeServiceImpl service;
	private INoticeDao dao;
	
	private NoticeServiceImpl() {
		dao = NoticeDaoImpl.getInstance();
	}
	
	public static NoticeServiceImpl getInstance() {
		if(service == null) service = new NoticeServiceImpl();
		return service;
	}

	@Override
	public List<NoticeVO> getAllNotice() {
		return dao.getAllNotice();
	}

	@Override
	public boolean insertNotice(NoticeVO notVo) {
		return dao.insertNotice(notVo);
	}




}
