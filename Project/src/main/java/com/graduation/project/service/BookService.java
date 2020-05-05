package com.graduation.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graduation.project.dao.entity.MyBooks;
import com.graduation.project.model.Books;

@Service
public interface BookService {
	
	public void save(Books book);
	public void update(Books book);
	public void delete(Long bookId);
	public List<Books> getAll();
	public List<Books> findByBookName(String book);
	public Books findByBookId(Long bookId);
		

}
