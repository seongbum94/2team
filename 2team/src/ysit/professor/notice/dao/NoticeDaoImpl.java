package ysit.professor.notice.dao;

public class NoticeDaoImpl implements INoticeDao {
	private static NoticeDaoImpl dao;
	private NoticeDaoImpl() {}
	
	public static NoticeDaoImpl getInstance() {
		if(dao == null)
			dao = new NoticeDaoImpl();
		return dao;
		
	}
	
}
