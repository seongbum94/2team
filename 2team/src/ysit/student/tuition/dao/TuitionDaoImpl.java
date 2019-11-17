package ysit.student.tuition.dao;

public class TuitionDaoImpl implements ITuitionDao{
	private static TuitionDaoImpl dao;
	private TuitionDaoImpl() {}
	
	public static TuitionDaoImpl getInstance() {
		if(dao == null)
			dao = new TuitionDaoImpl();
		return dao;
			
	}
}
