package ysit.professor.emp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.EmpVO;

public class EmpDaoImpl implements IEmpDao {
	private static EmpDaoImpl dao;
	SqlMapClient smc;
	
	private EmpDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static EmpDaoImpl getInstance(){
		if(dao == null) dao = new EmpDaoImpl();
		return dao;
	}

	@Override
	public List<EmpVO> getEmpList() {
		List<EmpVO> empList;
		try {
			empList = smc.queryForList("emp.getEmpList");
		} catch (SQLException e) {
			empList = null;
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public void increaseCnt(EmpVO emp) {
		try {
			smc.update("emp.increaseCnt",emp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public EmpVO getSelectedEmp(EmpVO emp) {
		EmpVO empVO;
		try {
			empVO = (EmpVO)smc.queryForObject("emp.getEmp",emp);
		} catch (SQLException e) {
			empVO = null;
			e.printStackTrace();
		}
		return empVO; 
	}
	
	//게시물제목으로 검색하는 메서드
		@Override
		public List<EmpVO> searchTitle(String title) {
			List<EmpVO> searchTitleList = null;
			
			try {
				searchTitleList = smc.queryForList("emp.searchTitle", title);
			} catch (Exception e) {
				searchTitleList = null;
				e.printStackTrace();
			}
			return searchTitleList;
		}
		
		//게시글 작성자로 검색하는 메서드
		@Override
		public List<EmpVO> searchWriter(String name) {
			List<EmpVO> searchWriterList = null;
			
			try {
				searchWriterList = smc.queryForList("emp.searchWriter",name);
			} catch (Exception e) {
				searchWriterList = null;
				e.printStackTrace();
			}
			return searchWriterList;
		}
		
		//게시글의 내용으로 검색하는 메서드
		@Override
		public List<EmpVO> searchContent(String content) {
			List<EmpVO> searchContentList = null;
			
			try {
				searchContentList = smc.queryForList("emp.searchContent",content);
			} catch (Exception e) {
				searchContentList = null;
				e.printStackTrace();
			}
			return searchContentList;
		}
		
		
		//게시글을 클릭하면 내용이 보여지는 메서드
		@Override
		public List<EmpVO> clickNotice(String letter) {
			List<EmpVO> clickedNoticeList = null;
			
			try {
				clickedNoticeList = smc.queryForList("emp.clickNotice",letter);
			} catch (Exception e) {
				clickedNoticeList = null;
				e.printStackTrace();
			}
			return clickedNoticeList;
		}
}
