package com.unal.lizzard.web;

import com.unal.lizzard.service.UserService;
import com.unal.lizzard.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
  private UserService userService;

  public UserRegistrationController(UserService userService) {
    super();
    this.userService = userService;
  }

  @GetMapping
  public String showRegistrationForm() {
    return "registration";
  }

  @PostMapping
  public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationOto) {
    userService.save(registrationOto);
    return "redirect:/reqistration?success";
  }

  @ModelAttribute("user")
  public UserRegistrationDto userRegistrationDto() {
    return new UserRegistrationDto();
  }
}