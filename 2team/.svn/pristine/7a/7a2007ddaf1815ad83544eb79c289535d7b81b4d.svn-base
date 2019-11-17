package ysit.student.counsel.service;

import java.util.List;

import ysit.student.counsel.dao.CounselDaoImpl;
import ysit.student.counsel.dao.ICounselDao;
import ysit.vo.CounselVO;
import ysit.vo.Counsel_dateVO;
import ysit.vo.ProfessorVO;

public class CounselServiceImpl implements ICounselService {
	private static ICounselDao dao;
	private static CounselServiceImpl service;
	
	private CounselServiceImpl() {
		dao = CounselDaoImpl.getInstance();
	}
	
	public static CounselServiceImpl getInstance() {
		if(service==null) {
			service = new CounselServiceImpl();
		}
		return service;
		
	}

	@Override
	public List<ProfessorVO> getProList() {
		
		return dao.getProList();
	}

	@Override
	public int insertCon(CounselVO conVo) {
		
		return dao.insertCon(conVo);
	}

	@Override
	public List<Counsel_dateVO> ConDateList(ProfessorVO pro) {
		
		return dao.ConDateList(pro);
	}

	@Override
	public int reservedCon(CounselVO conVo) {
	
		return dao.reservedCon(conVo);
	}

	@Override
	public CounselVO getCon(CounselVO conVo) {
		
		return dao.getCon(conVo);
	}
}
