package com.Rishabh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rishabh.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Serializable>  {

}
