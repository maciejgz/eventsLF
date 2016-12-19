package pl.mg.eventlisting.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Workflow. This utility wraps
 * {@link pl.mg.eventlisting.service.impl.WorkflowLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author mg
 * @see WorkflowLocalService
 * @see pl.mg.eventlisting.service.base.WorkflowLocalServiceBaseImpl
 * @see pl.mg.eventlisting.service.impl.WorkflowLocalServiceImpl
 * @generated
 */
public class WorkflowLocalServiceUtil {
    private static WorkflowLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link pl.mg.eventlisting.service.impl.WorkflowLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.lang.String getWorkflowInstance() {
        return getService().getWorkflowInstance();
    }

    public static java.util.List<pl.mg.eventlisting.model.UserTask> getUserTasks(
        java.lang.String username) {
        return getService().getUserTasks(username);
    }

    public static pl.mg.eventlisting.model.UserTask getUserTask(
        java.lang.String username) {
        return getService().getUserTask(username);
    }

    public static void clearService() {
        _service = null;
    }

    public static WorkflowLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    WorkflowLocalService.class.getName());

            if (invokableLocalService instanceof WorkflowLocalService) {
                _service = (WorkflowLocalService) invokableLocalService;
            } else {
                _service = new WorkflowLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(WorkflowLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(WorkflowLocalService service) {
    }
}
