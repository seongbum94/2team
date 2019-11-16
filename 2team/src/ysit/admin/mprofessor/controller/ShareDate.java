package ysit.admin.mprofessor.controller;

import java.util.List;

import javafx.scene.image.Image;
import ysit.vo.ProfessorVO;

public class ShareDate {
	

	static ProfessorVO shareProVO;
	static List<ProfessorVO> shareProList;
	static private int shareIndex;
	static private Image shareImg;
	static private String FilePath = "d:\\upload\\";				// 파일 경로
    static private String FileName;									// 선택한 파일이름
    
    
    
	public static int getShareIndex() {
		return shareIndex;
	}
	public static void setShareIndex(int shareIndex) {
		ShareDate.shareIndex = shareIndex;
	}
	public static Image getShareImg() {
		return shareImg;
	}
	public static void setShareImg(Image shareImg) {
		ShareDate.shareImg = shareImg;
	}
	public static String getFilePath() {
		return FilePath;
	}
	public static void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	
	

	
	

}
