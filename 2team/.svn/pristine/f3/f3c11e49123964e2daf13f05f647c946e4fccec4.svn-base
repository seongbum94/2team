package ysit.professor.notice.dao;

import java.sql.SQLException;
import java.util.List;
import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.NoticeVO;

public class NoticeDaoImpl implements INoticeDao {
	private static NoticeDaoImpl dao;
	private SqlMapClient smc;
	
	private NoticeDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static NoticeDaoImpl getInstance() {
		if(dao == null) dao = new NoticeDaoImpl();
		return dao;
	}
	
	@Override
	public List<NoticeVO> getNoticeList() {
		List<NoticeVO> noticeList;
		try {
			noticeList = smc.queryForList("notice.getNoticeList");
		} catch (SQLException e) {
			noticeList = null;
			e.printStackTrace();
		}
		return noticeList;
	}
	
}
