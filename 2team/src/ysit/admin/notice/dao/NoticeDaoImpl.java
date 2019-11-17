package ysit.admin.notice.dao;

import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.NoticeVO;

public class NoticeDaoImpl implements INoticeDao{
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
	public List<NoticeVO> getAllNotice() {
		List<NoticeVO> notList = new ArrayList<NoticeVO>();
		try {
			notList = smc.queryForList("notice.getAllNotice");
			System.out.println(notList);
		} catch (Exception e) {
			notList = null;
			e.printStackTrace();
		}
		return notList;
	}

	@Override
	public boolean insertNotice(NoticeVO notVo) {
		System.out.println("Dao notVo: " + notVo);
		boolean in = false;
		try {
			Object obj = smc.insert("notice.insertNotice",notVo);
			if(obj == null) in = true;
		} catch (Exception e) {
			in = false;
			e.printStackTrace();
		}
		return in;
	}

//	@Override
//	public int setCountIncrement(int notCnt) {
//		
//		return 0;
//	}




	
	
}
