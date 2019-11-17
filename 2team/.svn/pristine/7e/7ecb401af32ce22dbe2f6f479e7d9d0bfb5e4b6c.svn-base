package ysit.student.mschool.service;

import ysit.student.mschool.dao.IMSchoolDao;
import ysit.student.mschool.dao.MSchoolDaoImpl;
import ysit.vo.StudentVO;

public class MSchoolServiceImpl implements IMSchoolService {
	private static IMSchoolDao dao;
	private static MSchoolServiceImpl service;
	
	private MSchoolServiceImpl() {
		dao = MSchoolDaoImpl.getInstance();
	}
	
	public static MSchoolServiceImpl getInstance() {
		if(service == null)
			service = new MSchoolServiceImpl();
		return service;
	}

	@Override
	public int stuUpdate(StudentVO stuVO) {
		return dao.stuUpdate(stuVO);
	}
}
