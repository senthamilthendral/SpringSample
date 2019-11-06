package com.thendral.springfeatures.database;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thendral.springfeatures.database.repository.UserRepository;

@RestController
@RequestMapping(value = "/")
public class UserController {
 
	private final UserRepository userRepository;
	
	public UserController(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User addNewUsers(@RequestBody User user) {
		return userRepository.save(user);
	}
}
