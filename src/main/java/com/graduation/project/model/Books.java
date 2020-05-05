package com.graduation.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "books")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Books {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long bookId;

	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "publication_year")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date publicationYear;
	
	@Column(name = "book_note")
	private String bookNote;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(Date publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getBookNote() {
		return bookNote;
	}

	public void setBookNote(String bookNote) {
		this.bookNote = bookNote;
	}
	
}
