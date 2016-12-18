package pl.mg.eventlisting.service.base;

import pl.mg.eventlisting.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author mg
 * @generated
 */
public class EventServiceClpInvoker {
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName30;
    private String[] _methodParameterTypes30;

    public EventServiceClpInvoker() {
        _methodName24 = "getBeanIdentifier";

        _methodParameterTypes24 = new String[] {  };

        _methodName25 = "setBeanIdentifier";

        _methodParameterTypes25 = new String[] { "java.lang.String" };

        _methodName30 = "addEvent";

        _methodParameterTypes30 = new String[] {
                "long", "java.lang.String", "java.lang.String", "int", "int",
                "int", "int", "int", "long",
                "com.liferay.portal.service.ServiceContext"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return EventServiceUtil.getBeanIdentifier();
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            EventServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return EventServiceUtil.addEvent(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                ((Integer) arguments[3]).intValue(),
                ((Integer) arguments[4]).intValue(),
                ((Integer) arguments[5]).intValue(),
                ((Integer) arguments[6]).intValue(),
                ((Integer) arguments[7]).intValue(),
                ((Long) arguments[8]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[9]);
        }

        throw new UnsupportedOperationException();
    }
}
