package ysit.admin.mprofessor.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.ProfessorVO;


// 교수관리 메인
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

	
	@Override
	public int removePro(String pro_id) {
		int cnt = 0;
		System.out.println("Dao pro_id: " + pro_id);
		try {
			cnt = smc.delete("mprofessor.removePro", pro_id);
			System.out.println("Dao cnt: " + cnt);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}
}
