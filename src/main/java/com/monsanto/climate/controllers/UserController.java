package com.monsanto.climate.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import com.monsanto.climate.Exceptions.UserNotFoundException;
import com.monsanto.climate.model.AppUser;
import com.monsanto.climate.repository.UserRepository;

@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

	
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody AppUser user) {
		AppUser savedUser = userRepository.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@GetMapping("/users/{id}")
	public AppUser retrieveUser(@PathVariable Long id) {
		Optional<AppUser> user = userRepository.findById(id);

		if (!user.isPresent()) {
			throw new UserNotFoundException("id-" + id + " User with that id was not found ");
		}
	
		return 	user.get();
	}

	


}
