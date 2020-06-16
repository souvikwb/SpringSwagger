package com.souvik.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souvik.org.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
}
