package ysit.admin.apply.service;

import java.util.List;
import java.util.Map;

import ysit.vo.ApplyVO;

public interface IApplyService {
	/**
	 *  신청목록 전체 출력 메서드
	 *  @return List<Map<String, String>>
	 */
	public List<Map<String, String>> getAllAppDrop();
	
	/**
	 *  자퇴승인 : 학생T 학적상태를 자퇴로 변경하는 메서드
	 *  @param Map<String,String>
	 *  @return int 처리결과 
	 *              0 : 실패       1 이상 : 성공
	 */
	public int updateApproval(Map<String,String> parmMap);

	
	/**
	 *  자퇴반려 : 신청T 반려사유 업데이트하는 메서드
	 *  @param Map<String,String>
	 *  @return int 처리결과 
	 *              0 : 실패       1 이상 : 성공
	 */
	public int updateReject(Map<String,String> parmMap);

}
