package ysit.professor.evaluation.service;

import ysit.professor.evaluation.dao.EvaluationDaoImpl;
import ysit.professor.evaluation.dao.IEvaluationDao;

public class EvaluationServiceImpl implements IEvaluationService {
	private static IEvaluationDao dao;
	private static EvaluationServiceImpl service;
	
	private EvaluationServiceImpl() {
		dao = EvaluationDaoImpl.getInstance(); 
	}
	
	public static EvaluationServiceImpl getInstance() {
		if(service == null)
			service = new EvaluationServiceImpl();
		return service;
	}
}
