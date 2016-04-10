package com.test.ws.service.impl;

import org.springframework.stereotype.Service;

import com.test.ws.service.WSTestService;

@Service("wsTestService")
public class WSTestServiceImpl implements WSTestService {

	@Override
	public String getSomething(String name) {
		return "hello, "+name;
	}

}
