package ysit.professor.subject.service;

import java.util.List;
import ysit.professor.subject.dao.ISubjectDao;
import ysit.professor.subject.dao.SubjectDaoImpl;
import ysit.vo.OpeningSubjectVO;
import ysit.vo.ProfessorVO;

public class SubjectServiceImpl implements ISubjectService {
	private static ISubjectDao dao;
	private static SubjectServiceImpl service;
	
	private SubjectServiceImpl() {
		dao = SubjectDaoImpl.getInstance();
	}
	
	public static SubjectServiceImpl getInstance() {
		if(service == null) service = new SubjectServiceImpl();
		return service;
	}

	@Override
	public List<OpeningSubjectVO> getOpenList(ProfessorVO loginPro) {
		return dao.getOpenList(loginPro);
	}

	@Override
	public String getOpId(Integer newValue) {
		return dao.getOpId(newValue);
	}

	@Override
	public int insertSubject(OpeningSubjectVO open) {
		return dao.insertSubject(open);
	}

	@Override
	public void createSubject(OpeningSubjectVO open) {
		dao.createSubject(open);
	}

	@Override
	public String getMaxOpId() {
		return dao.getMaxOpId();
	}

	@Override
	public int getMaxRoom() {
		return dao.getMaxRoom();
	}

}
