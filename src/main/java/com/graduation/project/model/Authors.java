package com.graduation.project.model;

import java.awt.print.Book;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Authors")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Authors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 

	@Column(name = "authorId")
	private Long authorId;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Column(name = "authorName")
	private String authorName;

	@Column(name = "authorSurname")
	private String authorSurname;

	@OneToMany(mappedBy = "authors", cascade = CascadeType.ALL)
	private Set<Book> book;

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}
}