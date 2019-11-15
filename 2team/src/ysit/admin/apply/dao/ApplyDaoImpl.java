package ysit.admin.apply.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.ApplyVO;

public class ApplyDaoImpl implements IApplyDao{
	private static ApplyDaoImpl dao;
	private SqlMapClient smc;
	
	private ApplyDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static ApplyDaoImpl getInstance() {
		if(dao == null) dao = new ApplyDaoImpl();
		return dao;
	}

	@Override
	public List<Map<String, String>> getAllAppDrop() {
		// List<ApplyResJointVO> applyList = null;
		Map appDropMap = null;
		List<Map<String, String>> list = null;
		
		try {

			//System.out.println("DaoImpl getAllAppDrop()");
			list = smc.queryForList("apply.getAllAppDrop");
			
			//for(Map<String, String> s : list) {
			//	System.out.println(s);
			//}
			
			
		} catch (SQLException e) {
			appDropMap = null;
			list = null;
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int updateApproval1(Map<String, String> parmMap) {
		parmMap.get("stu_id");
		//System.out.println("Dao updateApproval1(): " + parmMap.get("stu_id"));
		int cnt = 0;
		try {
			cnt = smc.update("apply.updateApproval1", parmMap);
			
			//System.out.println("Dao updateApproval()");
			//System.out.println("Dao cnt : " + cnt);

		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	@Override
	public int updateApproval2(Map<String, String> parmMap) {
		parmMap.get("app_id");
		//System.out.println("Dao updateApproval2(): " + parmMap.get("app_id"));
		int cnt = 0;
		try {
			cnt = smc.update("apply.updateApproval2", parmMap);
			
			//System.out.println("Dao updateApproval2()");
			//System.out.println("Dao cnt2 : " + cnt);

		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateReject(Map<String, String> parmMap) {
		int cnt = 0;
		try {
			cnt = smc.update("apply.updateReject", parmMap);
			
			//System.out.println("Dao updateReject()");
			//System.out.println("Dao cnt : " + cnt);

		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

}
