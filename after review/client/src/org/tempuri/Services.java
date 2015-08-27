package org.tempuri;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Services
 */
@WebServlet("/Services")
public class Services extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*HttpSession hs1=request.getSession(true);
				hs1.setAttribute(Cust, arg1);*/
		
		HttpSession s=request.getSession();
		
		//System.out.println((String)s.getAttribute("k"));
	int zip=Integer.parseInt(request.getParameter("zip"));
	String serid=request.getParameter("serid");
	s.setAttribute("k", serid);
	String pd = null;
	ProductClass pc=null;
	GetAllProducts p=new GetAllProducts();
	GetAllProductsSoap p1=p.getGetAllProductsSoap();

	ArrayOfProductClass a=p1.getProductsByZipAndServiceID(serid, zip);
	ArrayList<ProductClass> l=(ArrayList<ProductClass>)a.getProductClass();
		if(!l.isEmpty())
		{
			Iterator<ProductClass> it = l.iterator();
			while(it.hasNext())
			{
				 pc = it.next();
				 System.out.println(pc.productDesc+"\n");
			}
			//request.setAttribute(arg0, arg1);
			request.setAttribute("Lkey",l);
			request.setAttribute("pid",pc.getProductID());
			RequestDispatcher rd=request.getRequestDispatcher("red.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("blue.jsp");
		}
	}
	
	
	
	}


