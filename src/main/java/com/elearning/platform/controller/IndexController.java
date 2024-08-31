package com.elearning.platform.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elearning.platform.auth.User;
import com.elearning.platform.auth.UserRepository;

/**
 * MVC Index Controller
 */
@Controller
@RequestMapping("/")
@Slf4j
public class IndexController {
	/*
	 * private final UserRepository userRepository;
	 * 
	 * 
	 * public IndexController(UserRepository userRepository) { super();
	 * this.userRepository = userRepository; }
	 */
	@GetMapping({"/", "/index"})
    public String index(Authentication authentication, Model model) {
       // log.info("Home page");
		/*
		 * try { String currentUsername = authentication.getName(); User user =
		 * userRepository.findByUsername(currentUsername); model.addAttribute("user",
		 * user);
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 */
        return "index";
    }

    @GetMapping("/discover")
    public String discover() {
        return "discover";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    @GetMapping("/logout-success")
    public String logoutPage(Model model) {
        return "logout";
    }
}