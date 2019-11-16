package ysit.professor.emp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.EmpVO;

public class EmpDaoImpl implements IEmpDao {
	private static EmpDaoImpl dao;
	SqlMapClient smc;
	
	private EmpDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static EmpDaoImpl getInstance(){
		if(dao == null) dao = new EmpDaoImpl();
		return dao;
	}

	@Override
	public List<EmpVO> getEmpList() {
		List<EmpVO> empList;
		try {
			empList = smc.queryForList("emp.getEmpList");
		} catch (SQLException e) {
			empList = null;
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public void increaseCnt(EmpVO emp) {
		try {
			smc.update("emp.increaseCnt",emp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public EmpVO getEmp(EmpVO emp) {
		EmpVO empVO;
		try {
			empVO = (EmpVO)smc.queryForObject("emp.getEmp",emp);
		} catch (SQLException e) {
			empVO = null;
			e.printStackTrace();
		}
		return empVO; 
	}
}
