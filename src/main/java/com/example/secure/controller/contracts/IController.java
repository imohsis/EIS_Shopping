package com.example.secure.controller.contracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface IController<T> {

    @GetMapping
    public ResponseEntity<Collection<T>> findAll();

    @GetMapping("{id}")
    public ResponseEntity<T> findById(@PathVariable Long id);

    @PostMapping
    public ResponseEntity<T> save(@RequestBody T t);

    @PutMapping
    public ResponseEntity<T> update(@RequestBody T t);

    @DeleteMapping("{id}")
    public ResponseEntity<T> deleteById(@PathVariable Long id);

}
