package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import daoImpl.EmployeeDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		response.setCharacterEncoding("utf-8");
		Employee employee = new Employee();
		employee.setEmployeeName(request.getParameter("employeeName"));
		employee.setEmployeePassword(request.getParameter("employeePassword"));
		try {
			employee.setEmployeeBirth(new SimpleDateFormat("yyyy-mm-ss").parse(request.getParameter("employeeBirth")));// 将字符串转为Date类型
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setEmployeePhone(request.getParameter("employeePhone"));
		employee.setEmployeePlace(request.getParameter("employeePlace"));
		employee.setEmployeeSex(request.getParameter("employeeSex"));
		try {
			employee.setJoinTime(new SimpleDateFormat("yyyy-mm-ss").parse(request.getParameter("joinTime")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setLead(Boolean.parseBoolean(request.getParameter("isLead")));

		if (employee != null) {
			EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
			employeeDaoImpl.addEmployee(employee);
			response.sendRedirect("registerSuccess.jsp");
		}

	}

}
