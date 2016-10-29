package org.soa.ws.tp2;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/helloworldws", new HelloWorldImpl());
	}

}
