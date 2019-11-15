package ysit.admin.mstudent.dao;


public class MStudentDaoImpl implements IMStudentDao {
	private static MStudentDaoImpl dao;
	
	private MStudentDaoImpl() {}
	
	public static MStudentDaoImpl getInstance() {
		if(dao == null) dao = new MStudentDaoImpl();
		return dao;
	}
}
