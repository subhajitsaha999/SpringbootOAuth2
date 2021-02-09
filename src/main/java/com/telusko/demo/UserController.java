package com.telusko.demo;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	@RequestMapping(value = "/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}

	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
}
