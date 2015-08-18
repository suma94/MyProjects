package webservice;

import javax.jws.WebService;
@WebService(endpointInterface="webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	@Override
	public String greetings(String name) {
		
		return "hello" + name;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
