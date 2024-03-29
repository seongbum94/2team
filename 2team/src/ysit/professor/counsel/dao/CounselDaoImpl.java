package ysit.professor.counsel.dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.CounselVO;

public class CounselDaoImpl implements ICounselDao {
	private static CounselDaoImpl dao;
	private SqlMapClient smc;
	
	private CounselDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static CounselDaoImpl getInstance() {
		if(dao == null) dao = new CounselDaoImpl();
		return dao;
	}

	@Override
	public List<CounselVO> getCounselList(String pro_id) {
		List<CounselVO> counselList;
		
		try {
			counselList = smc.queryForList("counsel.getCounselList",pro_id);
		} catch (SQLException e) {
			counselList = null;
			e.printStackTrace();
		}
		return counselList;
	}

	@Override
	public void changeConsent(CounselVO counsel) {
		try {
			smc.update("counsel.changeConsent",counsel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CounselVO> searchCounsel(CounselVO counsel) {
		List<CounselVO> counselList;
		try {
			counselList = smc.queryForList("counsel.searchCounsel",counsel);
		} catch (SQLException e) {
			counselList = null;
			e.printStackTrace();
		}
		return counselList;
	}
}
