package com.somebunnycodes.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FortuneController {
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("answerOmikuji");
		model.addAttribute("result", result);
		return "show.jsp";
	}
	
	@PostMapping("/omikuji")
	public String process(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("being") String being,
			@RequestParam("compliment") String compliment,
			HttpSession session
			) {
		
		String answerOmikuji = String.format(
				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.",
				number, city, person, hobby, being, compliment);
		
		session.setAttribute("answerOmikuji", answerOmikuji);
		
		return "redirect:/omikuji/show";
	}
}