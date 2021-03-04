package com.fabielrodrigues.mongospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabielrodrigues.mongospring.domain.Post;
import com.fabielrodrigues.mongospring.repository.PostRepository;
import com.fabielrodrigues.mongospring.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Post post = repo.findById(id).orElse(null);
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return post;
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContaining(text);
	}
	
}
