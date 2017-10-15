package com.wsproducer.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.wsproducer.persistence.SumRequest;
import com.wsproducer.persistence.SumResponse;

@WebService(name="SumService")
public interface Sum {

	@WebResult(name = "response")
	public SumResponse CalculateSum(@WebParam SumRequest sumRequest);
	
}
