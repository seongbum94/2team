package ysit.professor.emp.service;

import java.util.List;

import ysit.professor.emp.dao.EmpDaoImpl;
import ysit.professor.emp.dao.IEmpDao;
import ysit.vo.EmpVO;

public class EmpServiceImpl implements IEmpService {
	private static EmpServiceImpl service;
	private IEmpDao dao;
	
	private EmpServiceImpl() {
		dao = EmpDaoImpl.getInstance();
	}
	
	public static EmpServiceImpl getInstance() {
		if(service == null) service = new EmpServiceImpl();
		return service;
	}

	@Override
	public List<EmpVO> getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public void increaseCnt(EmpVO emp) {
		dao.increaseCnt(emp);
	}

	@Override
	public EmpVO getEmp(EmpVO emp) {
		return dao.getEmp(emp);
	}
	
}
