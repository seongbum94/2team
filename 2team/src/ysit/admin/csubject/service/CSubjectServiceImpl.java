package ysit.admin.csubject.service;

import ysit.admin.csubject.dao.CSubjectDaoImpl;
import ysit.admin.csubject.dao.ICSubjectDao;

public class CSubjectServiceImpl implements ICSubjectService{
	private static CSubjectServiceImpl service;
	private static ICSubjectDao dao;
	
	private CSubjectServiceImpl() {
		dao = CSubjectDaoImpl.getInstance();
	}
	
	public static CSubjectServiceImpl getInstance() {
		if(service == null) service = new CSubjectServiceImpl();
		return service;
	}
}
