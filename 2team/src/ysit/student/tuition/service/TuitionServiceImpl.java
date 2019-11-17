package ysit.student.tuition.service;

import ysit.student.tuition.dao.ITuitionDao;
import ysit.student.tuition.dao.TuitionDaoImpl;

public class TuitionServiceImpl {
	private static ITuitionDao dao;
	private static TuitionServiceImpl service;
	
	private TuitionServiceImpl() {
		dao = TuitionDaoImpl.getInstance();
	}
	
	public static TuitionServiceImpl getInstance() {
		if(service ==null)
			service = new TuitionServiceImpl();
		return service;
	}
}
