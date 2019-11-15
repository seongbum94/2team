package ysit.student.counsel.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.CounselVO;
import ysit.vo.ProfessorVO;

public class CounselDaoImpl implements ICounselDao {
	/**
	 * @author 민영
	 */
	private static CounselDaoImpl dao;
	private static SqlMapClient smc = null;
	private CounselDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
		
	}
	
	public static CounselDaoImpl getInstance() {
		if (dao==null) {
			dao = new CounselDaoImpl();
		}
		return dao;
	}

	@Override
	public List<ProfessorVO> getProList() {
		
		List<ProfessorVO> proList = null;
		
		try {
			
			proList = smc.queryForList("counsel.getProList", 10);
			
		} catch (SQLException e) {
			
			proList = null;
			e.printStackTrace();
		}
		return proList;
	}

	@Override
	public int insertCon(CounselVO conVo) {
		int cnt = 0;
		try {
			Object obj = smc.insert("counsel.insertConsel", conVo);
			if(obj==null) {
				cnt = 1;
			}
		} catch (Exception e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	} //insertCon

	
}//전체 끝
