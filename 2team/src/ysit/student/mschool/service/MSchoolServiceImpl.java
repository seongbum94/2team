package ysit.student.mschool.service;

import ysit.student.mschool.dao.IMSchoolDao;
import ysit.student.mschool.dao.MSchoolDaoImpl;

public class MSchoolServiceImpl {
	private static IMSchoolDao dao;
	private static MSchoolServiceImpl service;
	
	private MSchoolServiceImpl() {
		dao = MSchoolDaoImpl.getInstance();
	}
	
	public static MSchoolServiceImpl getInstance() {
		if(service == null)
			service = new MSchoolServiceImpl();
		return service;
	}
}
