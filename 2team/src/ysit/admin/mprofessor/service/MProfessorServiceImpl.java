package ysit.admin.mprofessor.service;

import java.util.List;

import ysit.admin.mprofessor.dao.IMProfessorDao;
import ysit.admin.mprofessor.dao.MProfessorDaoImpl;
import ysit.vo.ProfessorVO;

public class MProfessorServiceImpl implements IMProfessorService {
	private static MProfessorServiceImpl service;
	private static IMProfessorDao dao;
	
	private MProfessorServiceImpl() {
		dao = MProfessorDaoImpl.getInstance();
	}
	
	public static MProfessorServiceImpl getInstance() {
		if(service == null) service = new MProfessorServiceImpl();
		return service;
	}

	@Override
	public List<ProfessorVO> getAllPro() {
		return dao.getAllPro();
	}
	
	
}
