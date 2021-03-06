package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService			//Service Endpoint Interface(SEI)
@SOAPBinding(style=Style.DOCUMENT)
public interface HelloWorld {
	@WebMethod
	public String greetings(String name);
	@WebMethod
	public int add(int a, int b);
}
