package ysit.student.mainPage.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;

public class MainPageDaoImpl implements IMainPageDao {
/**
 * @author 민영	
 */
	private static MainPageDaoImpl dao;
	private static SqlMapClient smc = null;
	
	private MainPageDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	public static MainPageDaoImpl getInstance() {
		if(dao==null) {
			dao = new MainPageDaoImpl();
		}
		return dao;
	}
}
