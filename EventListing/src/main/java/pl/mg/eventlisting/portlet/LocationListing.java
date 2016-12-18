package pl.mg.eventlisting.portlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller("locationListingController")
@RequestMapping("VIEW")
public class LocationListing {
	
	
	@RenderMapping
	public String view(Model model) {

		return "EventListening/location";
	}
}
