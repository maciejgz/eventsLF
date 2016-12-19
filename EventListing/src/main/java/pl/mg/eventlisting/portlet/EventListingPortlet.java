package pl.mg.eventlisting.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import pl.mg.eventlisting.service.WorkflowLocalServiceUtil;

@Controller("eventListingController")
@RequestMapping("VIEW")
public class EventListingPortlet {

	
	
	@RenderMapping
	public String render(Model model) {
		System.out.println("test");
		System.out.println(WorkflowLocalServiceUtil.getUserTask("test"));
		return "EventListening/event";
	}
	
	
	@ActionMapping(params = "action=addEvent")
	public void addEvent(ActionRequest actionRequest, ActionResponse response, Model model){
		
	}
	
	
}
