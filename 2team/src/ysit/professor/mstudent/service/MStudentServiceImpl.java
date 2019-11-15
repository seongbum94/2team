package ysit.professor.mstudent.service;

import ysit.professor.mstudent.dao.IMStudentDao;
import ysit.professor.mstudent.dao.MStudentDaoImpl;

public class MStudentServiceImpl implements IMStudentService {
	private static IMStudentDao dao;
	private static MStudentServiceImpl service;
	
	private MStudentServiceImpl() {
		dao = MStudentDaoImpl.getInstance();
	}
	
	public static MStudentServiceImpl getInstance() {
		if(service == null)
			service = new MStudentServiceImpl();
		return service;
	}
}
