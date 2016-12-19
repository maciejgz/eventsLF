package pl.mg.eventlisting.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WorkflowLocalService}.
 *
 * @author mg
 * @see WorkflowLocalService
 * @generated
 */
public class WorkflowLocalServiceWrapper implements WorkflowLocalService,
    ServiceWrapper<WorkflowLocalService> {
    private WorkflowLocalService _workflowLocalService;

    public WorkflowLocalServiceWrapper(
        WorkflowLocalService workflowLocalService) {
        _workflowLocalService = workflowLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _workflowLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _workflowLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _workflowLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.lang.String getWorkflowInstance() {
        return _workflowLocalService.getWorkflowInstance();
    }

    @Override
    public java.util.List<pl.mg.eventlisting.model.UserTask> getUserTasks(
        java.lang.String username) {
        return _workflowLocalService.getUserTasks(username);
    }

    @Override
    public pl.mg.eventlisting.model.UserTask getUserTask(
        java.lang.String username) {
        return _workflowLocalService.getUserTask(username);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public WorkflowLocalService getWrappedWorkflowLocalService() {
        return _workflowLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedWorkflowLocalService(
        WorkflowLocalService workflowLocalService) {
        _workflowLocalService = workflowLocalService;
    }

    @Override
    public WorkflowLocalService getWrappedService() {
        return _workflowLocalService;
    }

    @Override
    public void setWrappedService(WorkflowLocalService workflowLocalService) {
        _workflowLocalService = workflowLocalService;
    }
}
