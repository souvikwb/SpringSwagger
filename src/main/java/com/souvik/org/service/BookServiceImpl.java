package com.souvik.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.org.dao.BookRepository;
import com.souvik.org.model.Book;

@Service
public class BookServiceImpl {
	@Autowired
	private BookRepository bookRepository;
	
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "book saved with id " + book.getBookId();	
	}
	
	public Optional<Book> getBook(int bookId) {
		return bookRepository.findById(bookId);
	}
	
	public List<Book> removeBook(int bookId){
		bookRepository.deleteById(bookId);
		return bookRepository.findAll();
	}
}
