package pl.mg.eventlisting.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import pl.mg.eventlisting.model.Location;
import pl.mg.eventlisting.service.LocationLocalServiceUtil;

/**
 * @author mg
 * @generated
 */
public abstract class LocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LocationLocalServiceUtil.getService());
        setClass(Location.class);

        setClassLoader(pl.mg.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("locationId");
    }
}
