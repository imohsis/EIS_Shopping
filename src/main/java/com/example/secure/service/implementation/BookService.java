package com.example.secure.service.implementation;

import com.example.secure.domain.Book;
import com.example.secure.service.IBookService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookService implements IBookService {

    private Long bookId = 100L;
    private Map<Long, Book> bookMap = new HashMap<>();
    {
        Book book = new Book();
        book.setId(bookId);
        book.setTitle("Spring Boot Microservice");
        book.setAuthor("Pepsi");
        book.setCoverPhotoURL("");
        book.setIsbnNumber(123456L);
        book.setPrice(234.40);
        book.setLanguage("English");
        bookMap.put(book.getId(),book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookMap.values();
    }

    @Override
    public Book findById(Long Id) {
        return bookMap.get(Id);
    }

    @Override
    public Book save(Book book) {
        Long newBookId = ++bookId;
        book.setId(newBookId);
        bookMap.put(book.getId(),book);
        return bookMap.get(newBookId);
    }

    @Override
    public Book update(Book book) {
        bookId = book.getId();
        if (bookMap.get(bookId) != null)
        {
            bookMap.put(bookId,book);
            return bookMap.get(bookId);
        }
        return null;
    }

    @Override
    public Book deleteById(Long Id) {
        if (bookMap.get(bookId) != null)
        {
            return bookMap.remove(bookId);
        }
        return null;
    }
}
