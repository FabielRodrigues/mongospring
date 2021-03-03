package com.fabielrodrigues.mongospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabielrodrigues.mongospring.domain.User;
import com.fabielrodrigues.mongospring.dto.UserDTO;
import com.fabielrodrigues.mongospring.repository.UserRepository;
import com.fabielrodrigues.mongospring.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findById(id).orElse(null);
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return user;
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail()); 
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
}
