package ysit.professor.attend.service;

import ysit.professor.attend.dao.AttendDaoImpl;
import ysit.professor.attend.dao.IAttendDao;

public class AttendServiceImpl implements IAttendService{
	private static AttendServiceImpl service;
	private IAttendDao dao;
	
	private AttendServiceImpl() {
		dao = AttendDaoImpl.getInstance();
	}
	
	public static AttendServiceImpl getInstance() {
		if(service == null) service = new AttendServiceImpl();
		return service;
	}
}
