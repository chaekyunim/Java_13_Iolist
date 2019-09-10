package com.biz.iolist.model;

public class GradeVO {

	private String strnum ;
	private String strName ;
	private int intKor ;

	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GradeVO(String strNum);
	this. strNum = strNum;
	
	
	
	
	
	public GradeVO(String strnum, String strName, int intKor) {
		super();
		this.strnum = strnum;
		this.strName = strName;
		this.intKor = intKor;
	}






	public String getStrnum() {
		return strnum;
	}
	public void setStrnum(String strnum) {
		this.strnum = strnum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
		
		
	}

	/*
	 * 오브잭트 클래스에 정의도니 toString() 메서드는
	 * 객체가 생성된 주소를 보여주는 매서드이다
	 * 실제 자바에서 객체가 생서된 주소는 별 의미가 없다
	 * 
	 * 그래서 vo 클래스를 만들때
	 * 이클립스의 자동코드 작성 기능을 이용해서
	 * toString () 메서드를 재 정의한다
	 * 
	 * 이렇게 재 정의를 하면
	 * vo 객체의 맴버변수에 어떤 값을 셋팅 한후
	 * 값들이 정상적으로 저장되어 있는가
	 * 확인하는 용도로 toString ()을 사용할수 있다
	 */
	
	@Override
	public String toString() {
		return "GradeVO [strnum=" + strnum + ", strName=" + strName + ", intKor=" + intKor + "]";
		
	}
	
}
