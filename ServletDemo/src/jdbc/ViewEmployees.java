package jdbc;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewEmployees
 */
@WebServlet("/ViewEmployees")
public class ViewEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAOImpl();
		List<Employee> employees=dao.getEmployee();
		request.setAttribute("empls", employees);
		RequestDispatcher rd = request.getRequestDispatcher("RetrieveEmployee.jsp");
		rd.forward(request, response);
	}

}
