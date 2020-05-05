package com.graduation.project.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.graduation.project.dao.AuthorRepository;
import com.graduation.project.model.Authors;
import com.graduation.project.service.AuthorService;

public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorRepository authorRepository;

	@Transactional
	@Override
	public void saveAuthor(Authors author) {
		// TODO Auto-generated method stub
		authorRepository.save(author);
	}

	@Transactional
	@Override
	public void updateAuthor(Authors author, int authorId) {
		// TODO Auto-generated method stub
		Authors authors = authorRepository.findById(authorId);
		authors = author;
		authorRepository.save(authors);
	}

	@Transactional
	@Override
	public void deleteAuthor(int authorId) {
		// TODO Auto-generated method stub
		authorRepository.deleteById((long) authorId);
	}

	
	@Override
	public Authors findByAuthorId(int authorId) {
		// TODO Auto-generated method stub
		return authorRepository.findById(authorId);
	}


	@Override
	public List<Authors> getAll() {
		// TODO Auto-generated method stub
		return authorRepository.listAllAuthor();
	}
	
}
