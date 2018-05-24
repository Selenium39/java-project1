package daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import bean.Message;
import dao.MessageDao;
import util.JDBCUtil;

public class MessageDaoImpl implements MessageDao {

	public void addMessage(Message message) {
		String sql = "insert into tb_message(messageTitle,messageContent,employeeId,publishTime)values(?,?,?,?)";
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, message.getTitle());
			pstmt.setString(2, message.getContent());
			pstmt.setInt(3, message.getEmployeeId());
			pstmt.setDate(4, new Date(message.getPublishTime().getTime()));
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
	}

	public void deleteMessage(Message message) {
		// TODO Auto-generated method stub

	}

	public void updateMessage(Message message) {
		// TODO Auto-generated method stub

	}

	public Message findMessageById(int messageId) {
		String sql = "select * from tb_message where messageId=?";
		Connection connection = null;
		PreparedStatement pstmt = null;
		Message message = null;
		ResultSet rs = null;
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, messageId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				message = new Message();
				message.setMessageId(rs.getInt(1));
				message.setTitle(rs.getString(2));
				message.setContent(rs.getString(3));
				message.setEmployeeId(rs.getInt(4));
				message.setPublishTime(rs.getDate(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}

		return message;
	}

	public List<Message> findAllMessage() {
		String sql = "select * from tb_message";
		Connection connection = null;
		PreparedStatement pstmt = null;
		Message message = null;
		ResultSet rs = null;
		List<Message> messages = new ArrayList();
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				message = new Message();
				message.setMessageId(rs.getInt(1));
				message.setTitle(rs.getString(2));
				message.setContent(rs.getString(3));
				message.setEmployeeId(rs.getInt(4));
				message.setPublishTime(rs.getDate(5));
				messages.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}

		return messages;
	}

}
