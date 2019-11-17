package ysit.com.regex;

import java.util.regex.Pattern;

public class RegEx {
	
	public static boolean checkMemName(String mem_name){
		String patternName = "[가-힣]{2,20}";
		return Pattern.matches(patternName, mem_name);
	}
	
	// 생년월일 정규식
    public static boolean checkMemBirth(String birth){
		String patternBirth = "[0-2][0-9]{3}-((0[1-9])|(1[0-2]))-((0[1-9])|([1-2][0-9])|(3[0-1]))";
		return Pattern.matches(patternBirth, birth);
	}

}
