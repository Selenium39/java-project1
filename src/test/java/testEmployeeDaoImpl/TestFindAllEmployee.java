package testEmployeeDaoImpl;

import java.util.List;

import org.junit.Test;

import bean.Employee;
import daoImpl.EmployeeDaoImpl;

public class TestFindAllEmployee {
	@Test
	public void test() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		if (employeeDaoImpl.findAllEmployee() == null) {
			System.out.println("没有employee");

		} else {
			List<Employee> employees = employeeDaoImpl.findAllEmployee();
			for (Employee employee : employees) {
				System.out.println(employee.toString());
			}
		}
	}

}
