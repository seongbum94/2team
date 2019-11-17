package ysit.professor.schedule.dao;

public class ScheduleDaoImpl implements IScheduleDao {
	private static ScheduleDaoImpl dao;
	private ScheduleDaoImpl() {}
	
	public static ScheduleDaoImpl getInstance() {
		if(dao == null)
			dao = new ScheduleDaoImpl();
		return dao;
	}
}
