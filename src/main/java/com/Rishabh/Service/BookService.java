package com.Rishabh.Service;

import org.springframework.stereotype.Service;

import com.Rishabh.model.Book;

import antlr.collections.List;
@Service
public interface BookService {
	Book saveBook(Book entity);
	Book updateBook(Book entity);
	void deleteBook(Integer bookId);
	List getAllBooks();

}
