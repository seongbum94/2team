package ysit.admin.emp.service;

import ysit.admin.emp.dao.EmpDaoImpl;
import ysit.admin.emp.dao.IEmpDao;

public class EmpServiceImpl implements IEmpService {
	private static EmpServiceImpl service;
	private static IEmpDao dao;
	
	private EmpServiceImpl() {
		dao = EmpDaoImpl.getInstance();
	}
	
	public static EmpServiceImpl getInstance() {
		if(service == null) service = new EmpServiceImpl();
		return service;
	}

}
