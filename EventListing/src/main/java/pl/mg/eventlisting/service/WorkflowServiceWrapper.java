package pl.mg.eventlisting.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WorkflowService}.
 *
 * @author mg
 * @see WorkflowService
 * @generated
 */
public class WorkflowServiceWrapper implements WorkflowService,
    ServiceWrapper<WorkflowService> {
    private WorkflowService _workflowService;

    public WorkflowServiceWrapper(WorkflowService workflowService) {
        _workflowService = workflowService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _workflowService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _workflowService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _workflowService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.lang.String getWorkflowInstance() {
        return _workflowService.getWorkflowInstance();
    }

    @Override
    public java.util.List<pl.mg.eventlisting.model.UserTask> getUserTasks(
        java.lang.String username) {
        return _workflowService.getUserTasks(username);
    }

    @Override
    public pl.mg.eventlisting.model.UserTask getUserTask(
        java.lang.String username) {
        return _workflowService.getUserTask(username);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public WorkflowService getWrappedWorkflowService() {
        return _workflowService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedWorkflowService(WorkflowService workflowService) {
        _workflowService = workflowService;
    }

    @Override
    public WorkflowService getWrappedService() {
        return _workflowService;
    }

    @Override
    public void setWrappedService(WorkflowService workflowService) {
        _workflowService = workflowService;
    }
}
