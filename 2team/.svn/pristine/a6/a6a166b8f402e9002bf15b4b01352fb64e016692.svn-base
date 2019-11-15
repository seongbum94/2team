package ysit.professor.subject.service;

import ysit.professor.subject.dao.ISubjectDao;
import ysit.professor.subject.dao.SubjectDaoImpl;

public class SubjectServiceImpl implements ISubjectService {
	private static ISubjectDao dao;
	private static SubjectServiceImpl service;
	
	private SubjectServiceImpl() {
		dao = SubjectDaoImpl.getInstance();
	}
	
	public static SubjectServiceImpl getInstance() {
		if(service == null)
			service = new SubjectServiceImpl();
		return service;
	}
}
