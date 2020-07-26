package com.example.secure.controller;
import com.example.secure.controller.contracts.IController;
import com.example.secure.domain.Book;
import com.example.secure.service.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController implements IController<Book> {

    private static Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private IBookService bookService;

    @Override
    public ResponseEntity<Collection<Book>> findAll() {
        log.info("BookController - findAll");
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);    }

    @Override
    public ResponseEntity<Book> findById(Long id) {
        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> save(Book book) {
        return new ResponseEntity<>(bookService.save(book), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> update(Book book) {
        return new ResponseEntity<>(bookService.update(book), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> deleteById(Long id) {
        return new ResponseEntity<>(bookService.deleteById(id), HttpStatus.OK);
    }
//
//    @GetMapping
//    public ResponseEntity<Collection<Book>> findAll(){
//        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<Book> findById(@PathVariable Long id){
//        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
//    }
//    @PostMapping
//    public ResponseEntity<Book> save(@RequestBody Book book){
//        return new ResponseEntity<>(bookService.save(book), HttpStatus.OK);
//    }
//    @PutMapping
//    public ResponseEntity<Book> update(@RequestBody Book book){
//        return new ResponseEntity<>(bookService.update(book), HttpStatus.OK);
//    }
//    @DeleteMapping("{id}")
//    public ResponseEntity<Book> deleteById(@PathVariable Long id){
//        return new ResponseEntity<>(bookService.deleteById(id), HttpStatus.OK);
//    }


}
