package ysit.professor.counsel.dao;

import java.util.List;

import ysit.vo.CounselVO;

public interface ICounselDao {

	List<CounselVO> getCounselList(String pro_id);
}
