package com.graduation.project.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.project.dao.BookRepository;
import com.graduation.project.model.Books;
import com.graduation.project.service.BookService;

@Service
public class BookServiceImpl  implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Transactional
	@Override
	public void save(Books book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Transactional
	@Override
	public void update(Books book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public void delete(Long bookId) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		return (List<Books>) bookRepository.findAll();
	}

	@Override
	public List<Books> findByBookName(String bookName) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookName(bookName);
	}

	@Override
	public Books findByBookId(Long bookId) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookId(bookId);
	}

}
