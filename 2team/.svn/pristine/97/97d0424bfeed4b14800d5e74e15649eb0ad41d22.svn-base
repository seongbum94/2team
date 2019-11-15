package ysit.professor.emp.service;

import ysit.professor.emp.dao.EmpDaoImpl;
import ysit.professor.emp.dao.IEmpDao;

public class EmpServiceImpl implements IEmpService {
	private static EmpServiceImpl service;
	private IEmpDao dao;
	
	private EmpServiceImpl() {
		dao = EmpDaoImpl.getInstance();
	}
	
	public static EmpServiceImpl getInstance() {
		if(service == null) service = new EmpServiceImpl();
		return service;
	}
	
}
