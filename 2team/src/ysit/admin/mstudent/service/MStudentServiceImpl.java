package ysit.admin.mstudent.service;

import java.util.List;

import ysit.admin.mstudent.dao.IMStudentDao;
import ysit.admin.mstudent.dao.MStudentDaoImpl;
import ysit.vo.StudentVO;


public class MStudentServiceImpl implements IMStudentService{
	private static MStudentServiceImpl service;
	private IMStudentDao dao;
	
	private MStudentServiceImpl() {
		dao = MStudentDaoImpl.getInstance();
	}
	public static MStudentServiceImpl getInstance() {
		if(service == null) service = new MStudentServiceImpl();
		return service;
	}
	@Override
	public List<StudentVO> getAllStudent() {
		return dao.getAllStudent();
	}
	@Override
	public List<StudentVO> getStuName(String stu_name) {
		return dao.getStuName(stu_name);
	}
	@Override
	public List<StudentVO> getStuId(String stu_id) {
		return dao.getStuId(stu_id);
	}

}
