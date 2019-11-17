package ysit.admin.mprofessor.dao;

import java.util.List;

import ysit.vo.ProfessorVO;

public interface IMProfessorDao {
	/**
	 *  교수 전체 출력 메서드
	 *  @return List<ProfessorVO> 교수 정보 전부 + 학과명
	 */
	
	public List<ProfessorVO> getAllPro();
	
	
	/**
	 *  교수 임용날짜에 해당되는 교번의 최대값 구하는 메서드
	 *  @return int 교번의 최대값
	 */
	
	public int getproIdYear(String pro_idYear);
	
	
	/**
	 *  연구실번호 최대값 구하는 메서드
	 *  @return int 연구실번호의 최대값
	 */
	public int getproLab();
	
	
	
	/**
	 *  교수 등록 메서드
	 *  @param ProfessorVO 교수 정보 
	 *  @return int 성공 여부
	 *  
	 */
	public int insertPro(ProfessorVO proVO);
	
	
	/**
	 *  선택된 교수 삭제 메서드
	 *  @return int 성공여부
	 */
	public int removePro(String pro_id);
	
	
	/**
	 *  선택된 교수 정보 수정 메서드
	 *  @return int 성공여부
	 */
	public int updatePro(ProfessorVO proVO);
}
