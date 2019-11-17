package ysit.professor.subject.dao;

import java.util.List;

import ysit.vo.OpeningSubjectVO;
import ysit.vo.ProfessorVO;

public interface ISubjectDao {

	List<OpeningSubjectVO> getOpenList(ProfessorVO loginPro);

	String getOpId(Integer newValue);

	int insertSubject(OpeningSubjectVO open);

	void createSubject(OpeningSubjectVO open);

	String getMaxOpId();

	int getMaxRoom();
}
