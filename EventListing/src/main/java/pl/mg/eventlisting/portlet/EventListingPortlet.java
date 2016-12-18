package pl.mg.eventlisting.portlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller("eventListingController")
@RequestMapping("VIEW")
public class EventListingPortlet {

	@RenderMapping
	public String render(Model model) {

		return "EventListening/event";
	}
	
	
}
