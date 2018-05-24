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
import daoImpl.MessageDaoImpl;
import util.HtmlFilterUtil;

public class PublishMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String originalContent = request.getParameter("editorValue");
		String content = HtmlFilterUtil.HtmlFilter(originalContent);
		String publishTime = request.getParameter("publishTime");
		Message message = new Message();
		Employee employee = (Employee) request.getSession().getAttribute("employee");
		message.setTitle(title);
		message.setContent(content);
		message.setEmployeeId(employee.getEmployeeId());
		try {
			message.setPublishTime(new SimpleDateFormat("yyyy-MM-dd").parse(publishTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("message", message);
		MessageDaoImpl messageDaoImpl = new MessageDaoImpl();
		messageDaoImpl.addMessage(message);
		request.getRequestDispatcher("/ShowMessageServlet").forward(request,response);
	}

}
