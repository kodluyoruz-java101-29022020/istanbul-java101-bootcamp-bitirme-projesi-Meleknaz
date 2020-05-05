package com.graduation.project.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.graduation.project.model.Books;


@Repository 			
public interface BookRepository extends CrudRepository<Books, Long> {
	@Query("Select book From Book book Where book.bookId = :id ") 	
	public Books findByBookId(@Param("id") Long id);


	@Query("Select b From Book b Where b.bookName like '%:bookName%'") 
	public List<Books> findByBookName(@Param("bookName") String bookName);
	

}