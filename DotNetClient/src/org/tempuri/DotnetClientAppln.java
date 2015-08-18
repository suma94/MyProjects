package org.tempuri;

public class DotnetClientAppln {

	public static void main(String[] args) {
		Service1 serv=new Service1();
		Service1Soap soap=serv.getService1Soap();
		System.out.println(soap.addition(5, 3));
		System.out.println(soap.product(5, 3));
	}
}
