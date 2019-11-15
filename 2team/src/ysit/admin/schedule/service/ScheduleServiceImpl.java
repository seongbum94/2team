package ysit.admin.schedule.service;

import ysit.admin.schedule.dao.IScheduleDao;
import ysit.admin.schedule.dao.ScheduleDaoImpl;

public class ScheduleServiceImpl implements IScheduleService{
	private static ScheduleServiceImpl service;
	private IScheduleDao dao;
	
	private ScheduleServiceImpl() {
		dao = ScheduleDaoImpl.getInstance();
	}
	
	public static ScheduleServiceImpl getInstance() {
		if(service == null) service = new ScheduleServiceImpl();
		return service;
	}
}
