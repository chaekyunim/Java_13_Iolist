package com.biz.iolistService;

public interface IolistService {
	
	// 판매정보 입력
	// 거래일자 거래시각 상품이름 단가 수량
	public void input();

	// 여러데이터를 연속해서입력하고자 할때
	// 몇개의 데이터를 입력할 것인가를 지정하여
	// 처리하는 메서드
	public void input(int count);
	
	//판매금액 계산
	public void total();

	//판매금액 리스트 보기
	public void list();
	
	// 판매정보 1개의 리스트 보기
	public void view();
	
}
