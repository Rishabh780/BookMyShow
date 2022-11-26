package com.Rishabh.srevice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rishabh.model.Book;
import com.Rishabh.repo.BookRepo;

@Service
public class BookServicempl {
	
	
		@Autowired
		private BookRepo bookRepo;
		public Book saveBook(Book entity) {
			return bookRepo.save(entity);
		}
		public Book updateBook(Book entity) {
			return bookRepo.save(entity);
		}
		public void deleteBook(Integer bookId) {
			bookRepo.deleteById(bookId);
		}
		public java.util.List<Book> getAllBooks() {
			return bookRepo.findAll();
		}

}
