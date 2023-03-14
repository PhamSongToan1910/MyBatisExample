package com.example.MyBatisExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.MyBatisExample.entity.Person;
import com.example.MyBatisExample.mapper.PersonDAO;

@Controller

public class HomeController {
	@Autowired
	PersonDAO persondao;
	
    @RequestMapping("/home")
    public ModelAndView showHomePage() {
    	ModelAndView mav = new ModelAndView("/home");
    	List<Person> persons = persondao.getAllPerson();
    	mav.addObject("persons", mav);
    	return mav;
    }
    
    
}
