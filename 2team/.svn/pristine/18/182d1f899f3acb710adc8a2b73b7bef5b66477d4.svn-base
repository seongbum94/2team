package ysit.admin.mprofessor.controller;

import java.util.List;

import javafx.scene.image.Image;
import ysit.vo.ProfessorVO;

public class ShareData {
	

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
		ShareData.shareIndex = shareIndex;
	}
	public static Image getShareImg() {
		return shareImg;
	}
	public static void setShareImg(Image shareImg) {
		ShareData.shareImg = shareImg;
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
	
	
	public static String majorId(String majorName) {
		String resMajorId = "";
		if(majorName.contains("컴퓨터공학")) {
			resMajorId = "10";
		}else if(majorName.contains("전산수학")) {
			resMajorId = "20";
		}else if(majorName.contains("심리학")) {
			resMajorId = "30";
		}else if(majorName.contains("경영학")) {
			resMajorId = "40";
		}else if(majorName.contains("행정학")) {
			resMajorId = "50";
		}
		return resMajorId;
	}
	
	
}
