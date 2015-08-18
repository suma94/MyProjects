package assignment16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MsgSendAppln {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("assignment16/Day16.xml"));
		MyMessageSender sender=(MyMessageSender) factory.getBean("sender");
		sender.service();
	}

}
