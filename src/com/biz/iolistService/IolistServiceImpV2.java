package com.biz.iolistService;

import com.biz.iolist.model.IolistVO;

/*
 *  IolistServiceImpV2에서
 *  IolistServiceImpV1을 상속 받았다.
 */

	
public class IolistServiceImpV2 extends IolistServiceImpV1 {

	/*
	 * V1에 이미 작선된 list() 메서들
	 * Override, 재 정의 하였다.
	 */
	
	
	@Override
	public void list() {
	
		System.out.println("===================================================================");
		System.out.println("판매리스트");
	    System.out.println("===================================================================");
	    System.out.println("상품이름|t단가|t부가세|t공급대가|t수량|t공급가액|t합계|t총점");
	    System.out.println("-------------------------------------------------------------------");
	    for(IolistVO vo : iolist) {
	    	System.out.printf(vo.getStrPName() +"|t");
	    	System.out.printf("%5d|t",vo.getIntPrice());
	    	System.out.printf("%5d|t",vo.getIntQty());
	    	
	    	// 부가세별도 금액 : 일반 금액을 1.1로 나눈 값
	    	int amt - (int)(vo.getIntToal() / 1.1);
	    	
	    	// 부가가치세 = 일반금액 - 부가세별도금액	    	
	    	int vat = total - vo.getIntTotal() - amt;0
	    	
	    	System.out.printf("%5d|t",amt);
	    	System.out.printf("%5d|t",vat);
	    	System.out.printf("%5d|t",vo.getIntPrice(total));
	    }
	
}
