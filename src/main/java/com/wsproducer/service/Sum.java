package com.wsproducer.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.wsproducer.persistence.SumRequest;
import com.wsproducer.persistence.SumResponse;

@WebService(name = "Sum")
public interface Sum {

	@WebMethod(action = "CalculateSum")
	public @WebResult(name = "response") SumResponse CalculateSum(@WebParam SumRequest sumRequest);

}
