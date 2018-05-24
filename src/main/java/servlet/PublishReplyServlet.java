package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import bean.Message;
import bean.Reply;
import daoImpl.ReplyDaoImpl;
import util.HtmlFilterUtil;

public class PublishReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String originalContent = request.getParameter("editorValue");
		String content = HtmlFilterUtil.HtmlFilter(originalContent);
		String replyTime = request.getParameter("publishTime");
		Employee employee = (Employee) request.getSession().getAttribute("employee");
		Message message = (Message) request.getSession().getAttribute("message");
		Reply reply = new Reply();
		reply.setContent(content);
		reply.setEmployeeId(employee.getEmployeeId());
		try {
			reply.setReplyTime(new SimpleDateFormat("yyyy-MM-dd").parse(replyTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("reply", reply);
		ReplyDaoImpl replyDaoImpl=new ReplyDaoImpl();
		replyDaoImpl.addReply(reply);
		response.sendRedirect("showMessage.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
