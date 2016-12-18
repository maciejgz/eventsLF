package pl.mg.eventlisting.service.base;

import pl.mg.eventlisting.service.WorkflowServiceUtil;

import java.util.Arrays;

/**
 * @author mg
 * @generated
 */
public class WorkflowServiceClpInvoker {
    private String _methodName28;
    private String[] _methodParameterTypes28;
    private String _methodName29;
    private String[] _methodParameterTypes29;
    private String _methodName32;
    private String[] _methodParameterTypes32;

    public WorkflowServiceClpInvoker() {
        _methodName28 = "getBeanIdentifier";

        _methodParameterTypes28 = new String[] {  };

        _methodName29 = "setBeanIdentifier";

        _methodParameterTypes29 = new String[] { "java.lang.String" };

        _methodName32 = "getWorkflowInstance";

        _methodParameterTypes32 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName28.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
            return WorkflowServiceUtil.getBeanIdentifier();
        }

        if (_methodName29.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
            WorkflowServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName32.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
            return WorkflowServiceUtil.getWorkflowInstance();
        }

        throw new UnsupportedOperationException();
    }
}
