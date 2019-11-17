package ysit.admin.csubject.dao;

public class CSubjectDaoImpl implements ICSubjectDao{
	private static CSubjectDaoImpl dao;
	
	private CSubjectDaoImpl() {}
	
	public static CSubjectDaoImpl getInstance() {
		if(dao == null) dao = new CSubjectDaoImpl();
		return dao;
	}
}
