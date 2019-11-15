package ysit.student.emp.service;

import java.util.List;

import ysit.student.emp.dao.EmpDaoImpl;
import ysit.student.emp.dao.IEmpDao;
import ysit.vo.EmpVO;
import ysit.vo.NoticeVO;
/**
 * 상담게시판~~이지용~~~ 2조파이팅~~
 * @author 민영
 *
 */
public class EmpServiceImpl implements IEmpService {
	private static IEmpDao dao;
	private static EmpServiceImpl service;
	
	public EmpServiceImpl() {
		dao = EmpDaoImpl.getInstance();
	}
	
	public static EmpServiceImpl getInstance() {
		if(service==null) {
			service = new EmpServiceImpl();
		}
		return service;
	}
	//전체게시글 가져오는 메서드
	@Override
	public List<EmpVO> getAllBoardList() {
		
		return dao.getAllBoList();
	}

	//게시글제목으로 검색하는 메서드
	@Override
	public List<EmpVO> searchBoardTitle(String title) {
		
		return dao.searchBoardTitle(title);
	}
	
	
	//게시글 작성자로 검색하는 메서드
	@Override
	public List<EmpVO> searchBoardWriter(String name) {
		
		return dao.searchBoardWriter(name);
	}
	
	//글의 내용으로 검색하는 메서드
	@Override
	public List<EmpVO> searchBoardContent(String content) {

		return dao.searchBoardContent(content);
	}
	
	
	//게시글을 클릭하면 게시글 내용을 보여주는 메서등
	@Override
	public List<EmpVO> clickedNotice(String letter) {
	
		return dao.clickedNotice(letter);
	}

	
	
	
}

