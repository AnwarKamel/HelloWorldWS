package org.soa.ws.tp2;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="org.soa.ws.tp2.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	@WebMethod
	public String simpleHello() {
		return "Hello World!";
	}

	@Override
	@WebMethod
	public String makeHello(String nom) {
		return "Hello World, " + nom;
	}

}
