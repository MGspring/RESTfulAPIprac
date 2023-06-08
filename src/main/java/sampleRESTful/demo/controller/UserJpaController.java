package sampleRESTful.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sampleRESTful.demo.UserNotFoundException;
import sampleRESTful.demo.user.User;
import sampleRESTful.demo.user.UserRepository;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);

		if(!user.isPresent()) {
			throw new UserNotFoundException(String.format("ID[%s] not found", id));
		}

		return user.get();
	}
}
