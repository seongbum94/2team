package ysit.professor.mainPage.service;

import ysit.student.emp.dao.EmpDaoImpl;
import ysit.student.emp.dao.IEmpDao;

public class MainPageServiceImpl implements IMainPageService {
	private static IEmpDao dao;
	private static MainPageServiceImpl service;
	
	public MainPageServiceImpl() {
		dao = EmpDaoImpl.getInstance();
	}
	
	public static MainPageServiceImpl getInstance() {
		if(service==null) {
			service = new MainPageServiceImpl();
		}
		return service;
	}
	
	
	
}
