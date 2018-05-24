package daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Employee;
import dao.EmployeeDao;
import util.JDBCUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	public void addEmployee(Employee employee) {
		String sql = "insert into tb_employee(employeeName,employeeSex,employeeBirth,employeePhone,employeePlace,joinTime,password,isLead) values(?,?,?,?,?,?,?,?)";
		Connection connection = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, employee.getEmployeeName());
			pstmt.setString(2, employee.getEmployeeSex());
			pstmt.setDate(3, new Date(employee.getEmployeeBirth().getTime()));// java.util.Date是java.sql.Date的父类，可以相互强转或者使用SimpleDateFormat
			pstmt.setString(4, employee.getEmployeePhone());
			pstmt.setString(5, employee.getEmployeePlace());
			pstmt.setDate(6, new Date(employee.getJoinTime().getTime()));
			pstmt.setString(7, employee.getEmployeePassword());
			pstmt.setBoolean(8, employee.isLead());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub

	}
	public Employee findEmployeeById(int employeeId) {
		String sql = "select * from tb_employee where employeeId=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection connection = null;
		Employee employee = null;
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1,employeeId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				employee=new Employee();
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
				employee.setEmployeeSex(rs.getString(3));
				employee.setEmployeeBirth(rs.getDate(4));
				employee.setEmployeePhone(rs.getString(5));
				employee.setEmployeePlace(rs.getString(6));
				employee.setJoinTime(rs.getDate(7));
				employee.setEmployeePassword(rs.getString(8));
				employee.setLead(rs.getBoolean(9));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
		return employee;
	}

	public Employee findEmployeeByName(String employeeName) {
		String sql = "select * from tb_employee where employeeName=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection connection = null;
		Employee employee = null;
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, employeeName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				employee=new Employee();
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
				employee.setEmployeeSex(rs.getString(3));
				employee.setEmployeeBirth(rs.getDate(4));
				employee.setEmployeePhone(rs.getString(5));
				employee.setEmployeePlace(rs.getString(6));
				employee.setJoinTime(rs.getDate(7));
				employee.setEmployeePassword(rs.getString(8));
				employee.setLead(rs.getBoolean(9));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
		return employee;

	}

	public List<Employee> findAllEmployee() {
		List<Employee> employees=new ArrayList();
		Employee employee=null;
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from tb_employee";
		try {
			connection=JDBCUtil.getConnection();
			pstmt=connection.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				 employee=new Employee();
				 employee.setEmployeeId(rs.getInt(1));
					employee.setEmployeeName(rs.getString(2));
					employee.setEmployeeSex(rs.getString(3));
					employee.setEmployeeBirth(rs.getDate(4));
					employee.setEmployeePhone(rs.getString(5));
					employee.setEmployeePlace(rs.getString(6));
					employee.setJoinTime(rs.getDate(7));
					employee.setEmployeePassword(rs.getString(8));
					employee.setLead(rs.getBoolean(9));
					employees.add(employee);
				 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
		
		return employees;
	}

}
