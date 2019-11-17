package ysit.admin.apply.service;

import java.util.List;
import java.util.Map;

import ysit.admin.apply.dao.ApplyDaoImpl;
import ysit.admin.apply.dao.IApplyDao;
import ysit.vo.ApplyVO;

public class ApplyServiceImpl implements IApplyService {
	private static ApplyServiceImpl service;
	private static IApplyDao dao;
	
	private ApplyServiceImpl() {
		dao = ApplyDaoImpl.getInstance();
	}
	
	public static ApplyServiceImpl getInstance() {
		if(service == null) service = new ApplyServiceImpl();
		return service;
	}

	@Override
	public List<Map<String, String>> getAllAppDrop() {
		return dao.getAllAppDrop();
	}

	@Override
	public int updateApproval(Map<String, String> parmMap) {
		int cnt1 = dao.updateApproval1(parmMap);  // 학생T 학적상태 : 자퇴로 변경	
		int cnt2 = dao.updateApproval2(parmMap);  // 신청T 관리자 승인여부, 승인일 변경
		int res = cnt1+cnt2;
		
		return res;
	}

	@Override
	public int updateReject(Map<String, String> parmMap) {
		return dao.updateReject(parmMap);
	}

}
