package org.soa.ws.tp2;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	@WebMethod
	public String simpleHello();
	
	@WebMethod
	public String makeHello(String nom);

}
