package ysit.admin.tuition.service;

import ysit.admin.tuition.dao.ITuitionDao;
import ysit.admin.tuition.dao.TuitionDaoImpl;

public class TuitionServiceImpl implements ITuitionService{
	private static TuitionServiceImpl service;
	private ITuitionDao dao;
	
	private TuitionServiceImpl() {
		dao = TuitionDaoImpl.getInstance();
	}
	
	public static TuitionServiceImpl getInstance() {
		if(service == null) service = new TuitionServiceImpl();
		return service;
	}
}
