package ysit.professor.emp.dao;

import java.util.List;

import ysit.vo.EmpVO;

public interface IEmpDao {

	List<EmpVO> getEmpList();

	void increaseCnt(EmpVO emp);

	EmpVO getEmp(EmpVO emp);
}
