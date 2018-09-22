package com.trateme.programacionrecogidamicroservice.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.trateme.programacionrecogidamicroservice.models.entity.Recogida;


public interface IRecogidaDao extends CrudRepository<Recogida, Long> {

}
