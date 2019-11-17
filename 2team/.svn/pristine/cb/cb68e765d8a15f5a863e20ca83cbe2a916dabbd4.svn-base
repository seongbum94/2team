package ysit.student.notice.dao;

import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.NoticeVO;

public class NoticeDAOImpl implements INoticeDAO{
	
	private static NoticeDAOImpl dao;
	private SqlMapClient smc;
	
	private NoticeDAOImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static NoticeDAOImpl getInstance() {
		if(dao == null)
			dao = new NoticeDAOImpl();
		return dao;
	}
	
	@Override
	public List<NoticeVO> getAllNotice() {
		List<NoticeVO> notList = new ArrayList<NoticeVO>();
		try {
			notList = smc.queryForList("stuNotice.getAllNotice");
			
		} catch (Exception e) {
			notList = null;
			e.printStackTrace();
		}
		return notList;
	}
	
	
	
}
