package ysit.student.grade.service;

import ysit.student.grade.dao.GradeDaoImpl;
import ysit.student.grade.dao.IGradeDao;

public class GradeServiceImpl implements IGradeService{
	//ΩÃ±€≈Ê
	private static IGradeDao dao;
	private static GradeServiceImpl service;
	
	private GradeServiceImpl() {
		dao = GradeDaoImpl.getInstance();
	}
	
	public static GradeServiceImpl getInstance() {
		if(service==null)
			service = new GradeServiceImpl();
		return service;
	}
	
	
}
