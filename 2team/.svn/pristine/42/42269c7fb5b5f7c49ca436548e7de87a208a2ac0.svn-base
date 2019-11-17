package ysit.professor.emp.service;

import java.util.List;

import ysit.professor.emp.dao.EmpDaoImpl;
import ysit.professor.emp.dao.IEmpDao;
import ysit.vo.EmpVO;

public class EmpServiceImpl implements IEmpService {
	private static EmpServiceImpl service;
	private IEmpDao dao;
	
	private EmpServiceImpl() {
		dao = EmpDaoImpl.getInstance();
	}
	
	public static EmpServiceImpl getInstance() {
		if(service == null) service = new EmpServiceImpl();
		return service;
	}

	@Override
	public List<EmpVO> getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public void increaseCnt(EmpVO emp) {
		dao.increaseCnt(emp);
	}

	@Override
	public EmpVO getSelectedEmp(EmpVO emp) {
		return dao.getSelectedEmp(emp);
	}
	
	//게시글제목으로 검색하는 메서드
		@Override
		public List<EmpVO> searchTitle(String title) {
			
			return dao.searchTitle(title);
		}
		
		
		//게시글 작성자로 검색하는 메서드
		@Override
		public List<EmpVO> searchWriter(String name) {
			
			return dao.searchWriter(name);
		}
		
		//글의 내용으로 검색하는 메서드
		@Override
		public List<EmpVO> searchContent(String content) {

			return dao.searchContent(content);
		}

		@Override
		public List<EmpVO> clickNotice(String letter) {
			
			return dao.clickNotice(letter);
		}
}
