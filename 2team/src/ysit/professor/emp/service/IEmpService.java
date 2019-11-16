package ysit.professor.emp.service;

import java.util.List;

import ysit.vo.EmpVO;

public interface IEmpService {

	List<EmpVO> getEmpList();

	void increaseCnt(EmpVO emp);

	EmpVO getEmp(EmpVO emp);
}
