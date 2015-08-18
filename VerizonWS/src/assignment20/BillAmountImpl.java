package assignment20;

import javax.jws.WebService;
@WebService(endpointInterface="assignment20.BillAmount")
public class BillAmountImpl implements BillAmount {
	@Override
	public float discount(float mrp, float disc) {
		
		return (mrp*disc)/100;
	}
	
}
