package pl.mg.eventlisting.service.impl;

import pl.mg.eventlisting.service.base.WorkflowLocalServiceBaseImpl;

/**
 * The implementation of the workflow local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pl.mg.eventlisting.service.WorkflowLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mg
 * @see pl.mg.eventlisting.service.base.WorkflowLocalServiceBaseImpl
 * @see pl.mg.eventlisting.service.WorkflowLocalServiceUtil
 */
public class WorkflowLocalServiceImpl extends WorkflowLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link pl.mg.eventlisting.service.WorkflowLocalServiceUtil} to access the workflow local service.
     */
	
	public String getWorkflowInstance(){
		return "workflow instance";
	}
}
