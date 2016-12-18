package pl.mg.eventlisting.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import pl.mg.eventlisting.model.Event;
import pl.mg.eventlisting.service.EventLocalServiceUtil;

/**
 * @author mg
 * @generated
 */
public abstract class EventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EventLocalServiceUtil.getService());
        setClass(Event.class);

        setClassLoader(pl.mg.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("eventId");
    }
}
