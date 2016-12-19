package pl.mg.eventlisting.service.base;

import pl.mg.eventlisting.service.WorkflowLocalServiceUtil;

import java.util.Arrays;

/**
 * @author mg
 * @generated
 */
public class WorkflowLocalServiceClpInvoker {
    private String _methodName28;
    private String[] _methodParameterTypes28;
    private String _methodName29;
    private String[] _methodParameterTypes29;
    private String _methodName32;
    private String[] _methodParameterTypes32;
    private String _methodName33;
    private String[] _methodParameterTypes33;
    private String _methodName34;
    private String[] _methodParameterTypes34;

    public WorkflowLocalServiceClpInvoker() {
        _methodName28 = "getBeanIdentifier";

        _methodParameterTypes28 = new String[] {  };

        _methodName29 = "setBeanIdentifier";

        _methodParameterTypes29 = new String[] { "java.lang.String" };

        _methodName32 = "getWorkflowInstance";

        _methodParameterTypes32 = new String[] {  };

        _methodName33 = "getUserTasks";

        _methodParameterTypes33 = new String[] { "java.lang.String" };

        _methodName34 = "getUserTask";

        _methodParameterTypes34 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName28.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
            return WorkflowLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName29.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
            WorkflowLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName32.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
            return WorkflowLocalServiceUtil.getWorkflowInstance();
        }

        if (_methodName33.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
            return WorkflowLocalServiceUtil.getUserTasks((java.lang.String) arguments[0]);
        }

        if (_methodName34.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
            return WorkflowLocalServiceUtil.getUserTask((java.lang.String) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
