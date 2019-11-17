package ysit.student.subject.service;

import ysit.student.subject.dao.ISubjectDao;
import ysit.student.subject.dao.SubjectDaoImpl;

public class SubjectServiceImpl implements ISubjectService{
	private static ISubjectDao dao;
	private static SubjectServiceImpl service;
	
	private SubjectServiceImpl() {
		dao= SubjectDaoImpl.getInstance();
	}
	
	public static ISubjectService getInstance() {
		if(service == null) service = new SubjectServiceImpl();
		return service;
	}
}
