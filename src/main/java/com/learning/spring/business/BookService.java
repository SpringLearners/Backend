package com.learning.spring.business;


import com.learning.spring.entity.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    void deleteBook(Book book);

    Book readBook(Integer id);

    List<Book> readAllBooks();

    void updateBook(Book book);

}
