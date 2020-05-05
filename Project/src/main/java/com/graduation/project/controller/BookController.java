package com.graduation.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.graduation.project.model.Books;
import com.graduation.project.service.BookService;



@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@RequestMapping(value = "/book/delete/{bookId}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable("bookId") Long bookId) {
		
		bookService.delete(bookId);
	}
	
	@RequestMapping(value = "/book/list", method = RequestMethod.GET)
	public List<Books> getAllBooks() {
		
		return bookService.getAll();
	}
	
	
	@RequestMapping(value = "/book/save", method = RequestMethod.POST)
	public void save(@RequestBody Books books) {
		
		 bookService.save(books);
	}
	
	
}