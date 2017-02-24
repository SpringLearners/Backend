package com.learning.spring.business.impl;

import com.learning.spring.business.BookService;
import com.learning.spring.entity.Book;
import com.learning.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public Book readBook(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    public List<Book> readAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
