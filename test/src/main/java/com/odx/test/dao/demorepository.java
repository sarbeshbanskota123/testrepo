package com.odx.test.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.odx.test.entity.demo;


@Repository
public interface demorepository extends CrudRepository<demo, Long>{
    
}

