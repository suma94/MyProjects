package discount;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import discount.BillAmount;

/**
 * Servlet implementation class BillAmountClientSvlt
 */
@WebServlet("/BillAmountClientSvlt")
public class BillAmountClientSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL url= new URL("http://localhost:8081/discount/amount");
		QName qname=new QName("http://discount/","BillAmountImplService");
		Service service=Service.create(url, qname);
		BillAmount amount=service.getPort(BillAmount.class);
		System.out.println(amount.discount(1000, 2));
		PrintWriter pw=response.getWriter();
		pw.println(amount.discount(1000, 4));
		}
}
