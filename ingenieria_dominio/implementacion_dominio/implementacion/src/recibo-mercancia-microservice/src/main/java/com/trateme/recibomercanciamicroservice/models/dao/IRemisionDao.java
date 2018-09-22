package com.trateme.recibomercanciamicroservice.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.trateme.recibomercanciamicroservice.models.entity.Remision;


public interface IRemisionDao extends CrudRepository<Remision, String> {

}
