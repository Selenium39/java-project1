package dao;
import java.util.List;

//EmployeeDao
import bean.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);//增加员工
	public void updateEmployee(Employee employee);//修改员工
	public void deleteEmployee(int employeeId);//删除员工
	public Employee findEmployeeByName(String employeeName);//查询1个员工
	public Employee findEmployeeById(int employeeId);
	public List<Employee> findAllEmployee();//查询所有的员工
	
	

}
