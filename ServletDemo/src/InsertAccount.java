

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertAccount
 */
@WebServlet("/InsertAccount")
public class InsertAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			PreparedStatement s=con.prepareStatement("insert into acct_info_table values(?,?,?)");
			s.setInt(1,Integer.parseInt(request.getParameter("accno")));
			s.setString(2,request.getParameter("name"));
			s.setInt(3, Integer.parseInt(request.getParameter("balance")));
			s.executeUpdate();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
