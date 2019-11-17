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


	@Override
	public int getproIdYear(String pro_idYear) {
		return dao.getproIdYear(pro_idYear);
	}
	
	@Override
	public int getproLab() {
		return dao.getproLab();
	}

	@Override
	public int insertPro(ProfessorVO proVO) {
		return dao.insertPro(proVO);
	}
	
	@Override
	public int removePro(String pro_id) {
		return dao.removePro(pro_id);
	}

	@Override
	public int updatePro(ProfessorVO proVO) {
		return dao.updatePro(proVO);
	}




	
	
}
