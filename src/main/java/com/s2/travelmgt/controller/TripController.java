package com.s2.travelmgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import com.s2.travelmgt.model.TripDetails;
import com.s2.travelmgt.model.User;
import com.s2.travelmgt.repository.TripInfoRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TripController {
	
	@Autowired
    TripInfoRepo tripInfoRepo;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String helloWorld() throws Exception{
		return "Hello World!!";
	}
	
	@GetMapping(path = "/getTripInfo")
    @ResponseBody
    public List<TripDetails> getEventInfo() {
        List<TripDetails> tripInfo = (List<TripDetails>) tripInfoRepo.findAll();
        return tripInfo;
    }
	
	@RequestMapping("/login")
	public boolean login(@RequestBody User user) {
		return user.getUserName().equals("user") && user.getPassword().equals("password");
	}

	@RequestMapping("/user")
	public Principal user(HttpServletRequest request) {
		String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
		return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
	}
}

