package com.crudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crudOperation.entity.User;
import com.crudOperation.service.MyService;

@Controller

public class ControllerClass {

@Autowired
private MyService service;
@RequestMapping("/show")
public String showInterface() {
	return "save";
} 
@RequestMapping("/savereg")
public String saveRecord(@ModelAttribute("user") User user) {
   service.saveData(user);
	return "showdata";
}
@RequestMapping("/displayData")
public String showData(ModelMap modelmap) {
	List<User> user = service.fetchdata();
	
	modelmap.addAttribute("user", user);
	return "data";
}
@RequestMapping("/showsData")
public String showInterfaces() {
	return "deleteRecord";
} 
@RequestMapping("/delete")
public String deleteRecord(@RequestParam("id") Integer id) {
	service.Delete(id);
	return "data";
}
}

