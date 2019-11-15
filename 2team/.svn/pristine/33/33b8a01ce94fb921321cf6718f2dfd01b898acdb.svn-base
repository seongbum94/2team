package ysit.professor.schedule.service;

import ysit.professor.schedule.dao.IScheduleDao;
import ysit.professor.schedule.dao.ScheduleDaoImpl;

public class ScheduleServiceImpl implements IScheduleService {
	private static IScheduleDao dao;
	private static ScheduleServiceImpl service;
	
	private ScheduleServiceImpl() {
		dao = ScheduleDaoImpl.getInstance();
	}
	
	public static ScheduleServiceImpl getInstance() {
		if(service == null)
			service = new ScheduleServiceImpl();
		return service;
	}
}
