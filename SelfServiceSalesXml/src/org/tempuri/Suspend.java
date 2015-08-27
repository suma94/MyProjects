package org.tempuri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suspend
 */
@WebServlet("/Suspend")
public class Suspend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suspend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Class2 ps;
		int cid=Integer.parseInt(request.getParameter("customerID"));
		Service1 p=new Service1();
		Service1Soap p1=p.getService1Soap();
		ArrayOfClass2 p2=p1.getservice(cid);
		ArrayList<Class2> l= (ArrayList<Class2>) p2.getClass2();
		if(!l.isEmpty())
		{
			Iterator<Class2> itr=l.iterator();
			while(itr.hasNext())
			{
				ps=itr.next();
				System.out.println(ps.sid);
				System.out.println(ps.serviceName);
				System.out.println(ps.serviceCurrentStatus);
			}
			request.setAttribute("lkey", l);
			RequestDispatcher rd=request.getRequestDispatcher("r.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("b.jsp");
		}
	}
}
