package dao;

import java.util.List;

import bean.Message;

public interface MessageDao {
	public void addMessage(Message message);
	public void deleteMessage(Message message);
	public void updateMessage(Message message);
	public Message findMessageById(int messageId);
	public List<Message>findAllMessage();

}
