package ysit.student.counsel.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.CounselVO;
import ysit.vo.Counsel_dateVO;
import ysit.vo.EmpVO;
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
	// 상담 가능한 교수 목록을 불러옴
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
	
	//상담날짜를 불러오는 메서드
	@Override
	public List<Counsel_dateVO> ConDateList(ProfessorVO pro) {
		List<Counsel_dateVO> conDateList = null;
		
		try {
			conDateList = smc.queryForList("counsel.selectConDate", pro);
		} catch (Exception e) {
			conDateList = null;
			e.printStackTrace();
		}
		return conDateList;
	}

	@Override
	public int reservedCon(CounselVO conVo) {
		int cnt = 0;
		
		try {
			Object obj = smc.insert("counsel.reserveCounsel", conVo);
			if(obj == null) {
				cnt = 1;
			}
		} catch (Exception e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public CounselVO getCon(CounselVO conVo) {
		
			CounselVO conVO;
			try {
				conVO = (CounselVO)smc.queryForObject("counsel.getCon",conVo);
			} catch (SQLException e) {
				conVO= null;
				e.printStackTrace();
			}
			return conVO; 
		
	}

	
}//전체 끝
