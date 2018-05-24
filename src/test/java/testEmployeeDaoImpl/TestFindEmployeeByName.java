package testEmployeeDaoImpl;

import org.junit.Test;

import bean.Employee;
import daoImpl.EmployeeDaoImpl;

public class TestFindEmployeeByName {
	@Test
	public void test() {
		String employeeName = "万涛";
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		if (employeeDaoImpl.findEmployeeByName(employeeName) == null) {
			System.out.println("没有employee:" + employeeName);

		} else {
			Employee employee = employeeDaoImpl.findEmployeeByName(employeeName);
			System.out.println(employee.toString());
		}
	}

}
