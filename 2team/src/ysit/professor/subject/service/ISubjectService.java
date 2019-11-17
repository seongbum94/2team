package ysit.professor.subject.service;

import java.util.List;

import ysit.vo.OpeningSubjectVO;
import ysit.vo.ProfessorVO;

public interface ISubjectService {

	List<OpeningSubjectVO> getOpenList(ProfessorVO loginPro);

	String getOpId(Integer newValue);

	int insertSubject(OpeningSubjectVO open);

	void createSubject(OpeningSubjectVO open);

	String getMaxOpId();

	int getMaxRoom();
}
