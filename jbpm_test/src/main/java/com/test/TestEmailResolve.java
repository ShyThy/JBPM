package com.test;

import org.jbpm.mail.AddressResolver;

public class TestEmailResolve implements AddressResolver{

	@Override
	public Object resolveAddress(String actorId) {
		if("gaojie".equals(actorId)){
			return "tianhangyu7777@163.com";
		}else{
			return "tianhangyu8888@163.com";
		}
	}

}
