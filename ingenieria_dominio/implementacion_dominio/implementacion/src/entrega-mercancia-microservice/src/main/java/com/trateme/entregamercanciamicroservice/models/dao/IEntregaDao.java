package com.trateme.entregamercanciamicroservice.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trateme.entregamercanciamicroservice.models.entities.Entrega;

public interface IEntregaDao extends CrudRepository<Entrega, Long> {
	public List<Entrega> findByCodigoOperador(Integer codigoOperador);
}