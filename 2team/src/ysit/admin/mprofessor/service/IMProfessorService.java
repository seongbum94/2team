package ysit.admin.mprofessor.service;

import java.util.List;

import ysit.vo.ProfessorVO;

public interface IMProfessorService {
	/**
	 *  교수 전체 출력 메서드
	 *  @return List<ProfessorVO> 교수 정보 전부 + 학과명
	 */
	public List<ProfessorVO> getAllPro();
}
