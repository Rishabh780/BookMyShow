package com.Rishabh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rishabh.Service.BookService;
import com.Rishabh.model.Book;
import com.Rishabh.srevice.serviceimpl.BookServicempl;

import antlr.collections.List;

@RestController
public class BookController {
	@Autowired(required=true)
    public BookServicempl bookService;
	
	@GetMapping("/")
	public String hello() {
		return "HELLO WORLD";
	}
	@PostMapping("/saveBook")
	public ResponseEntity<Book> saveBook(@RequestBody Book book)	{
		Book b=bookService.saveBook(book);
		return ResponseEntity.ok(b);
		
	}	
	@PutMapping("/book")
	public ResponseEntity<Book> updateBook(@RequestBody Book book)	{
		Book b=bookService.updateBook(book);
		return ResponseEntity.ok(b);
	}
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<?> deleteBook(@PathVariable("bookId") Integer bookId)	{
		bookService.deleteBook(bookId);
		return ResponseEntity.ok(bookId+" id Book is Deleted");
	}
	
	@GetMapping("/books")
	public ResponseEntity<java.util.List<Book>> shoAllBooks()	{
		java.util.List<Book> allBooks = bookService.getAllBooks();
		return ResponseEntity.ok(allBooks);
	}

}
