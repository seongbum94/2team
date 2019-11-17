package ysit.student.grade.dao;

public class GradeDaoImpl implements IGradeDao{

	private static GradeDaoImpl dao;
	private GradeDaoImpl() {}
	
	public static GradeDaoImpl getInstance() {
		if(dao==null)
		dao = new GradeDaoImpl();
		return dao;
	}
}
