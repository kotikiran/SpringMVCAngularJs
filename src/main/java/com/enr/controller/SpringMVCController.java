package com.enr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringMVCController {
	
	
	@RequestMapping(value = "/PostService", method = RequestMethod.POST)
	public @ResponseBody String PostService(@RequestBody Person person) {
		
		StringBuilder reponseData = new StringBuilder();
		reponseData.append("Name: "+person.getName()+" ");
		reponseData.append("Location: "+person.getLocation()+" ");
		reponseData.append("Phone: "+person.getPhone());
		
		return reponseData.toString();
	}

}
