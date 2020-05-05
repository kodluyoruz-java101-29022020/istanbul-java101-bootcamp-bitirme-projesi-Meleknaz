package com.graduation.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.graduation.project.model.Authors;

@Repository
public interface AuthorRepository extends CrudRepository<Authors, Long> {

	@Query("Select a From Authors a Where a.authorID = :id")
	public Authors findById(@Param("id") int id);


	@Query("Select auth From Authors auth where auth.authorName = :authorName ")
	public List<Authors> findByName(@Param("authorName") String authorString);

	@Query("Select auth From Authors auth") 
	public List<Authors> listAllAuthor();
}