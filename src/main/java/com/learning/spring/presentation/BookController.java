package com.learning.spring.presentation;

import com.learning.spring.business.BookService;
import com.learning.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        service.addBook(book);
    }

    @RequestMapping(path = "/del", method = RequestMethod.POST)
    public void deleteBook(@RequestBody Book book) {
        service.deleteBook(book);
    }

    @RequestMapping(path = "/upd", method = RequestMethod.POST)
    public void updateBook(@RequestBody Book book) {
        service.updateBook(book);
    }

    @RequestMapping(value = "/readOne/{bookId}", method = RequestMethod.GET)
    public Book readBook(@PathVariable("bookId") int bookId) {
        return service.readBook(bookId);
    }

    @RequestMapping(path = "/read")
    public List<Book> readAllBook() {
        return service.readAllBooks();
    }

}
