package discount;

import javax.jws.WebService;
@WebService(endpointInterface="discount.BillAmount")
public class BillAmountImpl implements BillAmount {
	@Override
	public float discount(float mrp, float disc) {
		
		return (mrp*disc)/100;
	}
	
}
