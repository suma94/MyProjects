package discount;

import javax.xml.ws.Endpoint;

public class BillAmountPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/discount/amount",new BillAmountImpl());
	}
}
