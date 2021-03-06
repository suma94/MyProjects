package jdbc;

import java.util.List;

public interface EmployeeDAO {

	public void getDBConnection();
	public void closeDBConnection();
	public void addEmployee(Employee employee);
	List<Employee> getEmployee();
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
}
