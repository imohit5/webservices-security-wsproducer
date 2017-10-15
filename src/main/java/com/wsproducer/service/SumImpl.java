package com.wsproducer.service;

import com.wsproducer.persistence.SumRequest;
import com.wsproducer.persistence.SumResponse;

public class SumImpl implements Sum {

	@Override
	public SumResponse CalculateSum(SumRequest sumRequest) {
		
		int result = sumRequest.getNum1()+sumRequest.getNum2();
		SumResponse sumResponse = new SumResponse();
		sumResponse.setResult(result);
		return sumResponse;
	}

	

}
