package com.biz.iolist.model;

public class BookVO extends Object {

	/*
	 * 클래스를 작성할때
	 * 다른 클래스를 etends 상속 하지 않으면
	 * 모든클래스느 오브젝트 클래스를 자동으로 상속 받는다
	 * 오브젝트 클래스를 객체로 생성하거나 한는
	 * 몇가지 메서드가 설정되어 있는데
	 * 몇가지 메서드가 설정되어 잇는데
	 * 그메서드들을 자도으로 상속받아서 사용 할수
	 * 있다
		 */
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;
	
	// 생성자 메서드
	// 클래스를 선언하면
	// 매개변수가 없는 생성자가 보이지 않지만
	// 자동으로 만들어져서
	// 자신이 가지고 잇는 맴버변수 필드 들이을
	// 초기화 하도록 구성되어 있다
	/*
	 * 생성자 메서드가 하는 기본연산 일
	 * 1. 클래스에 선언된 맴버변수 필드 를 초기화
	 * 
	 * 
	 */
	
	public BookVO() {
		
		// 생성자 메서드에 감춰진채 자동으로 실행되는 코드
		// 단. 맴버변수들이 primitive, String 인 경우만 해당
	     strName; = "" ;
		 strWriter ="" ;
		  strComp ="" ;
		 int intPrice=0;
		 int intYear =0;
	}
	
	/*
	 * BookVO 크래스를 객체로 생성하면서
	 * 외부에서 전달해준 "이름" strName의 매개변수에 받아서
	 * 맴버변수를 초기화 할때
	 * strName  = ""으로 하지 않고
	 * strName 매개변수에 받은 값으로 초기화를 하고 싶다
	 * 
	 * new BookVO ("Java") 형식으로 생서자를 호출하면
	 * this.strName = Java 코드가 실행되도록 하겠다라는 의미
	 * 
	 * 만약 매개변수가 포함된 생성자를 만들게 되면
	 * 최초에 자동으로 만들어지던 생성자
	 * public BookVO() { } 코드가
	 * 만들어지지 않는다
	 * 
	 */
	public BookVO(String strName) {
	    this.strName = strName
		
		
		
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntYear() {
		return intYear;
	}
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
}
