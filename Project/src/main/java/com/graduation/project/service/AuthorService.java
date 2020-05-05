package com.graduation.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graduation.project.model.Authors;

@Service
public interface AuthorService {
	
	public void saveAuthor(Authors author);
	public void updateAuthor(Authors author, int authorId);
	public void deleteAuthor(int authorId);
	public Authors findByAuthorId(int authorId);
	public List<Authors> getAll();
	
}
