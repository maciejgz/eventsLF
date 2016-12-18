package pl.mg.eventlisting.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import pl.mg.eventlisting.service.base.EventLocalServiceBaseImpl;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link pl.mg.eventlisting.service.EventLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mg
 * @see pl.mg.eventlisting.service.base.EventLocalServiceBaseImpl
 * @see pl.mg.eventlisting.service.EventLocalServiceUtil
 */
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link pl.mg.eventlisting.service.EventLocalServiceUtil} to access the event local service.
     */
	
	public String addEvent(long groupId, String name, String description,
		       int month, int day, int year, int hour, int minute,
		       long locationId, ServiceContext serviceContext)
		       throws PortalException, SystemException {


		    return "result";
		}
	
}
