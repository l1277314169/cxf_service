package com.test.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WSTestService {

	@WebMethod
	public String getSomething(String name);
}
