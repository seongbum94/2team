package ysit.student.mschool.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.StudentVO;

public class MSchoolDaoImpl implements IMSchoolDao{
	private static MSchoolDaoImpl dao;
	SqlMapClient smc;
	
	private MSchoolDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static MSchoolDaoImpl getInstance() {
		if(dao == null)
			dao = new MSchoolDaoImpl();
		return dao;
		
	}

	@Override
	public int stuUpdate(StudentVO stuVO) {
		 int cnt = 0;
	      try {
	         cnt = smc.update("mschool.stuUpdate", stuVO);	         
	      } catch (SQLException e) {
	         cnt = 0;
	         e.printStackTrace();
	      }
	      return cnt;

	}
}
