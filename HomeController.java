package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("")
	public String home() {
		return "CodingDojo is tough. Homelessness is worse.";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "You only have a full day of work ahead of you for 1 second per day!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "At least you'll probably get to sleep before it's tomorrow. ";
	}
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Surprise! You're going to " + city + "!";
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		if (num % 2 == 0) {
			return "Free cruises are a tempting scam.";
		} else {
			return "Enjoy some fruit with your family or something, idk I'm not a real fortune cookie.";
		}
	}
}
	
