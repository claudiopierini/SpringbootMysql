/**
 * 
 */
package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

/**
 * @author ClaudioJunior
 *
 */
@RestController
@RequestMapping(value = "/users")
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping(value = "/all")
	public List<Users> getAll() {
		return usersRepository.findAll();
	}
	
	@PostMapping(value ="/load")
	public List<Users> create(@RequestBody final Users users) {
		usersRepository.save(users);
		return (List<Users>) usersRepository.findAll();
	}

}
