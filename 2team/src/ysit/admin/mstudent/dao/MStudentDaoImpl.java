package ysit.admin.mstudent.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ysit.util.IbatisUtil;
import ysit.vo.StudentVO;

public class MStudentDaoImpl implements IMStudentDao {
	private static MStudentDaoImpl dao;
	private SqlMapClient smc;
	
	private MStudentDaoImpl() {
		smc = IbatisUtil.getSqlMapClient();
	}
	
	public static MStudentDaoImpl getInstance() {
		if(dao == null) dao = new MStudentDaoImpl();
		return dao;
	}

	@Override
	public List<StudentVO> getAllStudent() {
		System.out.println("Dao getAllStudent() 실행");
		List<StudentVO> stuList = null;
		try {
			stuList = smc.queryForList("mstudent.getAllStudent");
			System.out.println("Dao getAllStudent() stuList: " + stuList);
		} catch (SQLException e) {
			stuList = null;
			e.printStackTrace();
		}
		return stuList;
	}

	@Override
	public List<StudentVO> getStuName(String stu_name) {
		System.out.println("Dao getStuName() stu_name: " + stu_name);
		List<StudentVO> stuList = null;
		try {
			stuList = smc.queryForList("mstudent.getStuName", stu_name);
			System.out.println("Dao getStuName() stuList: " + stuList);
		} catch (SQLException e) {
			stuList = null;
			e.printStackTrace();
		}
		return stuList;
	}

	@Override
	public List<StudentVO> getStuId(String stu_id) {
		List<StudentVO> stuList = null;
		try {
			stuList = smc.queryForList("mstudent.getStuId", stu_id);
			System.out.println("Dao getStuId() stuList: " + stuList);
		} catch (SQLException e) {
			stuList = null;
			e.printStackTrace();
		}
		return stuList;
	}


}
