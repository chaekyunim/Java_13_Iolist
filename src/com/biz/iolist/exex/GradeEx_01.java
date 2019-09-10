package com.biz.iolist.exex;

import java.util.Random;

/*
 * VO 크래스 만들기
 *  1. Private으로 시작하는 맴버변수들 정의
 *  2. getter() setter() 메서드 정의
 *  3. super 생성자 field 생성자 정의
 *  4. toString() 정의
 *  5. 2 ~ 4 까지는 이클립스의 자동코드 생서기능을 이용하자
 */



import com.biz.iolist.model.GradeVO;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		GradeVO gradeVO = new GradeVO();
		
		gradeVO.setStrNum("001");
		gradeVO.setStrName("홍길동");
		gradeVO.setIntKor("90");
		
		String s = gradeVO.toString();
		System.out.println(s);
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i ++) {
			
			gradeVO = new GradeVO(rnd.nexInt()+);
			s = gradeVO.toString();
			System.out.println(s);
			
		}

		s = gradeVO.toString();
		System.out.println(s);
	}

}
