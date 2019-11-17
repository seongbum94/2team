package ysit.com.login.service;

import java.util.Map;

import ysit.com.login.dao.ILoginDao;
import ysit.com.login.dao.LoginDaoImpl;
import ysit.vo.AdminVO;
import ysit.vo.StudentVO;

public class LoginServiceImpl implements ILoginService {
	private static LoginServiceImpl service;
	private ILoginDao dao;
	
	private LoginServiceImpl() {
		dao = LoginDaoImpl.getInstance();
	}
	
	public static LoginServiceImpl getInstance() {
		if(service == null) service = new LoginServiceImpl();
		return service;
	}

	@Override
	public Object login(Map loginMap, int grant) {
		return dao.login(loginMap, grant);
	}

	@Override
	public Object getUserEmail(Object obj, int grant) {
		return dao.getUserEmail(obj, grant);
	} 
}
