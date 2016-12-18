package pl.mg.eventlisting.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import pl.mg.eventlisting.model.Event;
import pl.mg.eventlisting.service.EventLocalService;
import pl.mg.eventlisting.service.persistence.EventPersistence;
import pl.mg.eventlisting.service.persistence.LocationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the event local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link pl.mg.eventlisting.service.impl.EventLocalServiceImpl}.
 * </p>
 *
 * @author mg
 * @see pl.mg.eventlisting.service.impl.EventLocalServiceImpl
 * @see pl.mg.eventlisting.service.EventLocalServiceUtil
 * @generated
 */
public abstract class EventLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements EventLocalService, IdentifiableBean {
    @BeanReference(type = pl.mg.eventlisting.service.EventLocalService.class)
    protected pl.mg.eventlisting.service.EventLocalService eventLocalService;
    @BeanReference(type = pl.mg.eventlisting.service.EventService.class)
    protected pl.mg.eventlisting.service.EventService eventService;
    @BeanReference(type = EventPersistence.class)
    protected EventPersistence eventPersistence;
    @BeanReference(type = pl.mg.eventlisting.service.LocationLocalService.class)
    protected pl.mg.eventlisting.service.LocationLocalService locationLocalService;
    @BeanReference(type = pl.mg.eventlisting.service.LocationService.class)
    protected pl.mg.eventlisting.service.LocationService locationService;
    @BeanReference(type = LocationPersistence.class)
    protected LocationPersistence locationPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private EventLocalServiceClpInvoker _clpInvoker = new EventLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link pl.mg.eventlisting.service.EventLocalServiceUtil} to access the event local service.
     */

    /**
     * Adds the event to the database. Also notifies the appropriate model listeners.
     *
     * @param event the event
     * @return the event that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Event addEvent(Event event) throws SystemException {
        event.setNew(true);

        return eventPersistence.update(event);
    }

    /**
     * Creates a new event with the primary key. Does not add the event to the database.
     *
     * @param eventId the primary key for the new event
     * @return the new event
     */
    @Override
    public Event createEvent(long eventId) {
        return eventPersistence.create(eventId);
    }

    /**
     * Deletes the event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param eventId the primary key of the event
     * @return the event that was removed
     * @throws PortalException if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Event deleteEvent(long eventId)
        throws PortalException, SystemException {
        return eventPersistence.remove(eventId);
    }

    /**
     * Deletes the event from the database. Also notifies the appropriate model listeners.
     *
     * @param event the event
     * @return the event that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Event deleteEvent(Event event) throws SystemException {
        return eventPersistence.remove(event);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Event.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return eventPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pl.mg.eventlisting.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return eventPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pl.mg.eventlisting.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return eventPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return eventPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return eventPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Event fetchEvent(long eventId) throws SystemException {
        return eventPersistence.fetchByPrimaryKey(eventId);
    }

    /**
     * Returns the event with the primary key.
     *
     * @param eventId the primary key of the event
     * @return the event
     * @throws PortalException if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event getEvent(long eventId) throws PortalException, SystemException {
        return eventPersistence.findByPrimaryKey(eventId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return eventPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the events.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pl.mg.eventlisting.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of events
     * @param end the upper bound of the range of events (not inclusive)
     * @return the range of events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Event> getEvents(int start, int end) throws SystemException {
        return eventPersistence.findAll(start, end);
    }

    /**
     * Returns the number of events.
     *
     * @return the number of events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getEventsCount() throws SystemException {
        return eventPersistence.countAll();
    }

    /**
     * Updates the event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param event the event
     * @return the event that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Event updateEvent(Event event) throws SystemException {
        return eventPersistence.update(event);
    }

    /**
     * Returns the event local service.
     *
     * @return the event local service
     */
    public pl.mg.eventlisting.service.EventLocalService getEventLocalService() {
        return eventLocalService;
    }

    /**
     * Sets the event local service.
     *
     * @param eventLocalService the event local service
     */
    public void setEventLocalService(
        pl.mg.eventlisting.service.EventLocalService eventLocalService) {
        this.eventLocalService = eventLocalService;
    }

    /**
     * Returns the event remote service.
     *
     * @return the event remote service
     */
    public pl.mg.eventlisting.service.EventService getEventService() {
        return eventService;
    }

    /**
     * Sets the event remote service.
     *
     * @param eventService the event remote service
     */
    public void setEventService(
        pl.mg.eventlisting.service.EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * Returns the event persistence.
     *
     * @return the event persistence
     */
    public EventPersistence getEventPersistence() {
        return eventPersistence;
    }

    /**
     * Sets the event persistence.
     *
     * @param eventPersistence the event persistence
     */
    public void setEventPersistence(EventPersistence eventPersistence) {
        this.eventPersistence = eventPersistence;
    }

    /**
     * Returns the location local service.
     *
     * @return the location local service
     */
    public pl.mg.eventlisting.service.LocationLocalService getLocationLocalService() {
        return locationLocalService;
    }

    /**
     * Sets the location local service.
     *
     * @param locationLocalService the location local service
     */
    public void setLocationLocalService(
        pl.mg.eventlisting.service.LocationLocalService locationLocalService) {
        this.locationLocalService = locationLocalService;
    }

    /**
     * Returns the location remote service.
     *
     * @return the location remote service
     */
    public pl.mg.eventlisting.service.LocationService getLocationService() {
        return locationService;
    }

    /**
     * Sets the location remote service.
     *
     * @param locationService the location remote service
     */
    public void setLocationService(
        pl.mg.eventlisting.service.LocationService locationService) {
        this.locationService = locationService;
    }

    /**
     * Returns the location persistence.
     *
     * @return the location persistence
     */
    public LocationPersistence getLocationPersistence() {
        return locationPersistence;
    }

    /**
     * Sets the location persistence.
     *
     * @param locationPersistence the location persistence
     */
    public void setLocationPersistence(LocationPersistence locationPersistence) {
        this.locationPersistence = locationPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("pl.mg.eventlisting.model.Event",
            eventLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "pl.mg.eventlisting.model.Event");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Event.class;
    }

    protected String getModelClassName() {
        return Event.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = eventPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
