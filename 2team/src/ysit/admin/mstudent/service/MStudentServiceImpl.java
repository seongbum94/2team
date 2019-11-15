package ysit.admin.mstudent.service;

import ysit.admin.mstudent.dao.IMStudentDao;
import ysit.admin.mstudent.dao.MStudentDaoImpl;

public class MStudentServiceImpl implements IMStudentService{
	private static MStudentServiceImpl service;
	private IMStudentDao dao;
	
	private MStudentServiceImpl() {
		dao = MStudentDaoImpl.getInstance();
	}
	public static MStudentServiceImpl getInstance() {
		if(service == null) service = new MStudentServiceImpl();
		return service;
	}
}
