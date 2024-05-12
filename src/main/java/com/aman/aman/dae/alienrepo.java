package com.aman.aman.dae;

import org.springframework.data.repository.CrudRepository;

import com.aman.aman.model.alien;

// crudRepositary vitra same table ko data handle garinxa
public interface alienrepo  extends  CrudRepository<alien,Integer>{

}
