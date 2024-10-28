package com.aman.aman.dae;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aman.aman.model.alien;

@Repository
public interface alienrepo extends CrudRepository<alien,Integer>{

}
