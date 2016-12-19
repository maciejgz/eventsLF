package pl.mg.eventlisting.model;

public class UserTask {

	private String username;

	public UserTask() {
	}

	public UserTask(String username, int taskId) {
		this.username = username;
		this.taskId = taskId;
	}

	private int taskId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

}
