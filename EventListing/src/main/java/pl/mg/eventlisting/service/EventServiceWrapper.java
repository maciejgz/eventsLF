package pl.mg.eventlisting.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EventService}.
 *
 * @author mg
 * @see EventService
 * @generated
 */
public class EventServiceWrapper implements EventService,
    ServiceWrapper<EventService> {
    private EventService _eventService;

    public EventServiceWrapper(EventService eventService) {
        _eventService = eventService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _eventService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _eventService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _eventService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.lang.String addEvent(long groupId, java.lang.String name,
        java.lang.String description, int month, int day, int year, int hour,
        int minute, long locationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventService.addEvent(groupId, name, description, month, day,
            year, hour, minute, locationId, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EventService getWrappedEventService() {
        return _eventService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEventService(EventService eventService) {
        _eventService = eventService;
    }

    @Override
    public EventService getWrappedService() {
        return _eventService;
    }

    @Override
    public void setWrappedService(EventService eventService) {
        _eventService = eventService;
    }
}
