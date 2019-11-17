package ysit.professor.subject.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.OpeningSubjectVO;
import ysit.vo.ProfessorVO;

public class SubjectDaoImpl implements ISubjectDao {
	private static SubjectDaoImpl dao;
	private SqlMapClient smc;
	
	private SubjectDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static SubjectDaoImpl getInstance() {
		if(dao == null)
			dao = new SubjectDaoImpl();
		return dao;
	}

	@Override
	public List<OpeningSubjectVO> getOpenList(ProfessorVO loginPro) {
		List<OpeningSubjectVO> openList;
		try {
			openList = smc.queryForList("subject.getOpenList",loginPro);
		} catch (SQLException e) {
			openList = null;
			e.printStackTrace();
		}
		return openList;
	}

	@Override
	public String getOpId(Integer newValue) {
		String opId;
		try {
			if(newValue ==  1) {
				opId = (String)smc.queryForObject("subject.getOpId","A");
			} else {
				opId = (String)smc.queryForObject("subject.getOpId","B");
			}
			if(opId.length() == 1) {
				opId += "001";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return opId;
	}

	@Override
	public int insertSubject(OpeningSubjectVO open) {
		int cnt = 0;
		try {
			Object obj = smc.insert("subject.insertSubject",open);
			if(obj == null) {
				cnt = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public void createSubject(OpeningSubjectVO open) {
		try {
			smc.insert("subject.createSubject",open);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getMaxOpId() {
		String opId;
		try {
			opId = (String)smc.queryForObject("subject.getMaxOpId");
			if(Integer.parseInt(opId) > 10) {
				opId = "0"+opId;
			} else {
				opId = "00"+opId;
			}
		} catch (SQLException e) {
			opId = null;
			e.printStackTrace();
		}
		return opId;
	}

	@Override
	public int getMaxRoom() {
		int room = 100;
		try {
			room = (int)smc.queryForObject("subject.getMaxRoom");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return room;
	}
}
