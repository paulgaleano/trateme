package com.trateme.transportemercanciamicroservice.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.trateme.transportemercanciamicroservice.models.entity.Transporte;


public interface ITransporteDao extends CrudRepository<Transporte, Long> {

}
