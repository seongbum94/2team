package ysit.admin.mprofessor.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.ProfessorVO;

public class MProfessorDaoImpl implements IMProfessorDao {
	private static MProfessorDaoImpl dao;
	private SqlMapClient smc;
	
	private MProfessorDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static MProfessorDaoImpl getInstance() {
		if(dao == null) dao = new MProfessorDaoImpl();
		return dao;
	}

	@Override
	public List<ProfessorVO> getAllPro() {
		List<ProfessorVO> proList = null;
		
		try {
			proList = smc.queryForList("mprofessor.getAllPro");
			
		} catch (SQLException e) {
			proList = null;
			e.printStackTrace();
		}
		return proList;
	}
}
