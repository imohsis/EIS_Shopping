package com.example.secure.service.contracts;


import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface IHelperService<C> {

    Collection<C> findAll();
    C findById(Long Id);
    C save(C c);
    C update(C c);
    C deleteById(Long Id);
}
