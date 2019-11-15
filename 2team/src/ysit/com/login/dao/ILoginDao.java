package ysit.com.login.dao;

import java.util.Map;

import ysit.vo.AdminVO;
import ysit.vo.StudentVO;

public interface ILoginDao {
	
	Object login(Map<String, String> loginMap, int grant);

	Object getUserEmail(Object obj, int grant);
}
