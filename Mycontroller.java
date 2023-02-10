package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.User;
import com.example.demo.repo.UserRepo;



@Controller
public class Mycontroller {
@Autowired
private UserRepo userrepo;
@GetMapping(value="/home")
public String index() {
	return"sign";
}

@GetMapping(value="/welcome")
public String welcome() {
	return"welcome";
}

@GetMapping(value="/sign")
public String sign() {
	return"sign";
}

@GetMapping(value="/forgot")
public String forgot() {
	return"forgot";
}

@GetMapping(value="/game")
public String game() {
	return"game";
}

@PostMapping(value="/register")
 public String userRegister(@ModelAttribute User data, Model model) {
	userrepo.save(data);
	model.addAttribute("username", data.getUsername());
	model.addAttribute("id", data.getSn());
    return "index";
 }
}
