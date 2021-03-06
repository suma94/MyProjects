package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public void getDBConnection(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(url, "scott","tiger");
		}catch(ClassNotFoundException | SQLException e ){
			e.printStackTrace();
		}
	}
	public void closeDBConnection(){
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void addEmployee(Employee employee){
		getDBConnection();
		String query="insert into employee values(?,?,?)";
		try{
			pst=conn.prepareStatement(query);
			pst.setInt(1, employee.getEmpcode());
			pst.setString(2, employee.getEmpname());
			pst.setDouble(3, employee.getSalary());
			pst.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
	}
	@Override
	public List<Employee> getEmployee() {
		getDBConnection();
		Employee emp;
		List<Employee> empls= new ArrayList<Employee>();
		try {
			pst=conn.prepareStatement("select * from employee");
			rs=pst.executeQuery();
			while(rs.next()){
				emp=new Employee();
				emp.setEmpcode(rs.getInt("empcode"));
				emp.setEmpname(rs.getString("empname"));
				emp.setSalary(rs.getDouble(3));
				empls.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
		return empls;
	}
	@Override
	public void updateEmployee(Employee employee) {
		getDBConnection();
		String str="update employee set empcode = "+employee.getEmpcode()+ "where empname='"+employee.getEmpname()+"'";
		try {
			pst=conn.prepareStatement(str);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
	}
	@Override
	public void deleteEmployee(Employee employee) {
		getDBConnection();
		String str="delete from employee where empcode ="+employee.getEmpcode();
		try {
			pst=conn.prepareStatement(str);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
		
	}
}
