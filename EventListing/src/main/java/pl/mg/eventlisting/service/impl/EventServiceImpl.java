package pl.mg.eventlisting.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import pl.mg.eventlisting.service.base.EventServiceBaseImpl;

/**
 * The implementation of the event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pl.mg.eventlisting.service.EventService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author mg
 * @see pl.mg.eventlisting.service.base.EventServiceBaseImpl
 * @see pl.mg.eventlisting.service.EventServiceUtil
 */
public class EventServiceImpl extends EventServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link pl.mg.eventlisting.service.EventServiceUtil} to access the event remote service.
     */
	
	public String addEvent(long groupId, String name, String description,
		       int month, int day, int year, int hour, int minute,
		       long locationId, ServiceContext serviceContext)
		       throws PortalException, SystemException {


		    return "result";
		}
}
