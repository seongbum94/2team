package ysit.com.login.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.AdminVO;
import ysit.vo.ProfessorVO;
import ysit.vo.StudentVO;

public class LoginDaoImpl implements ILoginDao {
	private static LoginDaoImpl dao;
	SqlMapClient smc;
	
	private LoginDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static LoginDaoImpl getInstance() {
		if(dao == null) dao = new LoginDaoImpl();
		return dao;
	}

	@Override
	public Object login(Map loginMap, int grant) {
		Object obj = null;
		try {
			switch (grant) {
				case 1 : obj = smc.queryForObject("login.loginAdm",loginMap); break;
				case 2 : obj = smc.queryForObject("login.loginStu",loginMap); break;
				case 3 : obj = smc.queryForObject("login.loginPro",loginMap); break;
				default: obj = null;
			}
		} catch (SQLException e) {
			obj = null;
		}
		return obj;
	}

	@Override
	public Object getUserEmail(Object obj, int grant) {
		try {
			switch(grant) {
				case 2 : obj = smc.queryForObject("login.getStuEmail",(StudentVO)obj); break;
				case 3 : obj = smc.queryForObject("login.getProEmail",(ProfessorVO)obj); break; 
			}
			return obj;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
//		return obj;
	}
}
