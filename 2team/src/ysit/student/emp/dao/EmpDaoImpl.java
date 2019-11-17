package ysit.student.emp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.EmpVO;
import ysit.vo.NoticeVO;

public class EmpDaoImpl implements IEmpDao {
/**
 * @author 민영	
 */
	private static EmpDaoImpl dao;
	private static SqlMapClient smc = null;
	
	private EmpDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	public static EmpDaoImpl getInstance() {
		if(dao==null) {
			dao = new EmpDaoImpl();
		}
		return dao;
	}
	//전체 게시글을 가져오는 메서드
	@Override
	public List<EmpVO> getAllBoList() {
		
		List<EmpVO> empNoticeList = null;
		
		try {
			empNoticeList = smc.queryForList("emp.getAllNotice");
		} catch (Exception e) {
			empNoticeList = null;
			e.printStackTrace();
		}
		return empNoticeList;
	}
	
	//게시물제목으로 검색하는 메서드
	@Override
	public List<EmpVO> searchBoardTitle(String title) {
		List<EmpVO> searchTitleList = null;
		
		try {
			searchTitleList = smc.queryForList("emp.searchBoardTitle", title);
		} catch (Exception e) {
			searchTitleList = null;
			e.printStackTrace();
		}
		return searchTitleList;
	}
	
	//게시글 작성자로 검색하는 메서드
	@Override
	public List<EmpVO> searchBoardWriter(String name) {
		List<EmpVO> searchWriterList = null;
		
		try {
			searchWriterList = smc.queryForList("emp.searchBoardWriter",name);
		} catch (Exception e) {
			searchWriterList = null;
			e.printStackTrace();
		}
		return searchWriterList;
	}
	
	//게시글의 내용으로 검색하는 메서드
	@Override
	public List<EmpVO> searchBoardContent(String content) {
		List<EmpVO> searchContentList = null;
		
		try {
			searchContentList = smc.queryForList("emp.searchBoardContent",content);
		} catch (Exception e) {
			searchContentList = null;
			e.printStackTrace();
		}
		return searchContentList;
	}
	
	
	//게시글을 클릭하면 내용이 보여지는 메서드
	@Override
	public List<EmpVO> clickedNotice(String letter) {
		List<EmpVO> clickedNoticeList = null;
		
		try {
			clickedNoticeList = smc.queryForList("emp.clickedNotice",letter);
		} catch (Exception e) {
			clickedNoticeList = null;
			e.printStackTrace();
		}
		return clickedNoticeList;
	}
	
	//게시글의 조회수가 올라가는 메서드
	@Override
	public void incCnt(EmpVO emp) {
		try {
			smc.update("emp.incCnt", emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public EmpVO getEmp(EmpVO emp) {
		EmpVO empVO;
		try {
			empVO = (EmpVO)smc.queryForObject("emp.getEmp",emp);
		} catch (SQLException e) {
			empVO = null;
			e.printStackTrace();
		}
		return empVO; 
	}
	
	
	

	
	
	
	
}
