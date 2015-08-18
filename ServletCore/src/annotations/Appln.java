package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appln {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("annotations/SpringAnnotn.xml");
		Customer cust= (Customer) context.getBean("customer");
		System.out.println(cust.getName()+" "+cust.getCode());
	}
}
