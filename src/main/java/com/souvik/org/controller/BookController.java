package com.souvik.org.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.org.model.Book;
import com.souvik.org.service.BookServiceImpl;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookServiceImpl bookService;
	
	@RequestMapping(value="/saveBook", method=RequestMethod.POST)
	public String saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@RequestMapping(value="/searchBook/{bookId}", method=RequestMethod.GET)
	public Optional<Book> getBook(@PathVariable int bookId) {
		return bookService.getBook(bookId);
	}
	
	@RequestMapping(value="/removeBook/{bookId}", method = RequestMethod.DELETE)
	public List<Book> deleteBook(@PathVariable int bookId){
		return bookService.removeBook(bookId);
	}
}
