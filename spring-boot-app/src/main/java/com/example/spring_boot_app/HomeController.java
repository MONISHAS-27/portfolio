package com.example.spring_boot_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/about-me")
	public String aboutMe() {
		return "about-me.html";
	}
	@RequestMapping("/education")
	public String education() {
		return "education.html";
	}
	@RequestMapping("/index")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/certifications")
	public String certifications() {
		return "certifications.html";
	}
	@RequestMapping("/projects")
	public String projects() {
		return "projects.html";
	}
	@RequestMapping("/skills")
	public String skills() {
		return "skills.html";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact.html";
	}

}
