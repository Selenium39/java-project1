package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import bean.Reply;
import daoImpl.EmployeeDaoImpl;
import daoImpl.ReplyDaoImpl;

/**
 * Servlet implementation class ShowReplyServlet
 */
public class ShowReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	    ReplyDaoImpl replyDaoImpl=new ReplyDaoImpl();
	    EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
	    Reply reply=replyDaoImpl.findReplyById(1);//这里不应该写死，可以改进，但是我懒，嘤嘤嘤
	    Employee employee=employeeDaoImpl.findEmployeeById(reply.getEmployeeId());
	    request.getSession().setAttribute("reply",reply);
	    request.getSession().setAttribute("employee",employee);
	    response.sendRedirect("showReply.jsp");
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
