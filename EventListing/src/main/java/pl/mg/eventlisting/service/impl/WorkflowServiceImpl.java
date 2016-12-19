package pl.mg.eventlisting.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.mg.eventlisting.model.UserTask;
import pl.mg.eventlisting.service.base.WorkflowServiceBaseImpl;

/**
 * The implementation of the workflow remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link pl.mg.eventlisting.service.WorkflowService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author mg
 * @see pl.mg.eventlisting.service.base.WorkflowServiceBaseImpl
 * @see pl.mg.eventlisting.service.WorkflowServiceUtil
 */
public class WorkflowServiceImpl extends WorkflowServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * pl.mg.eventlisting.service.WorkflowServiceUtil} to access the workflow
	 * remote service.
	 */

	public String getWorkflowInstance() {
		return "workflow instance";
	}

	public List<UserTask> getUserTasks(String username) {
		List<UserTask> tasks = new ArrayList<UserTask>();
		int size = new Random().nextInt(100000);
		System.out.println("size: " + size);
		for (int i = 0; i < size; i++) {
			tasks.add(new UserTask(username, new Random().nextInt(50)));
		}
		return tasks;
	}

	public UserTask getUserTask(String username) {
		UserTask task = new UserTask();
		task.setUsername(username);
		task.setTaskId(new Random().nextInt(10));
		return task;
	}
}
