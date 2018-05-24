package dao;

import java.util.List;

import bean.Reply;

public interface ReplyDao {
	public void addReply(Reply reply);
	public void deleteReply(Reply reply);
	public Reply updateReply(Reply reply);
	public Reply findReplyById(int id);
	public List<Reply> findAllReply();
	

}
