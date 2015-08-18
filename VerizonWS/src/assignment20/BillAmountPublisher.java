package assignment20;

import javax.xml.ws.Endpoint;

public class BillAmountPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8082/assignment20/amount",new BillAmountImpl());
	}
}
