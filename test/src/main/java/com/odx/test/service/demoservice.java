package com.odx.test.service;

import com.odx.test.dao.demorepository;
import com.odx.test.entity.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class demoservice {

    @Autowired
    demorepository repository;

    public void save(final demo palindrome){
        repository.save(palindrome);
    }
    
}
