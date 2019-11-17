package ysit.com.login.service;

import java.util.Map;

import ysit.vo.AdminVO;
import ysit.vo.StudentVO;

public interface ILoginService {

	Object login(Map<String, String> loginMap,int grant);

	Object getUserEmail(Object obj, int grant);
}
