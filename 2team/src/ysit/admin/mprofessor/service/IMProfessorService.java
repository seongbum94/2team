package ysit.admin.mprofessor.service;

import java.util.List;

import ysit.vo.ProfessorVO;

public interface IMProfessorService {
	/**
	 *  교수 전체 출력 메서드
	 *  @return List<ProfessorVO> 교수 정보 전부 + 학과명
	 */
	public List<ProfessorVO> getAllPro();

	
	/**
	 *  선택된 교수 삭제 메서드
	 *  @return int 성공여부
	 */
	public int removePro(String pro_id);
}
