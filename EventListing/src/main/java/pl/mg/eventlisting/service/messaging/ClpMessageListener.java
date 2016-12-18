package pl.mg.eventlisting.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import pl.mg.eventlisting.service.ClpSerializer;
import pl.mg.eventlisting.service.EventLocalServiceUtil;
import pl.mg.eventlisting.service.EventServiceUtil;
import pl.mg.eventlisting.service.LocationLocalServiceUtil;
import pl.mg.eventlisting.service.LocationServiceUtil;
import pl.mg.eventlisting.service.WorkflowLocalServiceUtil;
import pl.mg.eventlisting.service.WorkflowServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            EventLocalServiceUtil.clearService();

            EventServiceUtil.clearService();
            LocationLocalServiceUtil.clearService();

            LocationServiceUtil.clearService();
            WorkflowLocalServiceUtil.clearService();

            WorkflowServiceUtil.clearService();
        }
    }
}
