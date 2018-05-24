package daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Reply;
import dao.ReplyDao;
import util.JDBCUtil;

public class ReplyDaoImpl implements ReplyDao {

	public void addReply(Reply reply) {
		String sql_ForeginKeyClose = "SET FOREIGN_KEY_CHECKS = 0";
		String sql = "insert into tb_reply(replyContent,employeeId,ReplyTime,MessageId) values(?,?,?,?)";
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql_ForeginKeyClose);
			pstmt.execute();
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, reply.getContent());
			pstmt.setInt(2, reply.getMessageId());
			pstmt.setDate(3, new Date(reply.getReplyTime().getTime()));
			pstmt.setInt(4, reply.getMessageId());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
	}

	public void deleteReply(Reply reply) {
		// TODO Auto-generated method stub

	}

	public Reply updateReply(Reply reply) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reply findReplyById(int id) {
		String sql = "select * from tb_reply where replyId=?";
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Reply reply = new Reply();
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				reply.setReplyId(rs.getInt(1));
				reply.setContent(rs.getString(2));
				reply.setEmployeeId(rs.getInt(3));
				reply.setReplyTime(rs.getDate(4));
				reply.setMessageId(rs.getInt(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}

		return reply;
		
	}

	public List<Reply> findAllReply() {
		String sql = "select * from tb_reply";
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Reply> replies = new ArrayList<Reply>();
		try {
			connection = JDBCUtil.getConnection();
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Reply reply = new Reply();
				reply.setContent(rs.getString(1));
				reply.setEmployeeId(rs.getInt(2));
				reply.setReplyTime(rs.getDate(3));
				reply.setMessageId(rs.getInt(4));
				replies.add(reply);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}

		return replies;
	}

}
