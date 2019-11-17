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
	public int getproIdYear(String pro_idYear) {
		int proIdMax = 0;
		try {
			proIdMax = (Integer) smc.queryForObject("mprofessor.getproIdYear", pro_idYear);
			System.out.println("Dao proIdMax: " + proIdMax);
		} catch (SQLException e) {
			proIdMax = 0;
			e.printStackTrace();
		}
		return proIdMax;
	}
	

	@Override
	public int getproLab() {
		int pro_lab = 0;
		try {
			pro_lab = (Integer) smc.queryForObject("mprofessor.getproLab");
		} catch (SQLException e) {
			pro_lab = 0;
			e.printStackTrace();
		}
		return pro_lab;
	}
	

	@Override
	public int insertPro(ProfessorVO proVO) {
		System.out.println("MProDao insertPro() proVO: " + proVO);
		Object obj = null;
		int cnt = 0;
		try {
			obj = smc.insert("mprofessor.insertPro", proVO);
			if(obj==null) cnt=1;
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
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

	@Override
	public int updatePro(ProfessorVO proVO) {
		int cnt = 0;
		try {
			cnt = smc.update("mprofessor.updatePro", proVO);
			System.out.println("Dao updatePro() cnt: " + cnt);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}


}
