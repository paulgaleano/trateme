package com.trateme.rastreomercanciamicroservice.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.trateme.rastreomercanciamicroservice.models.entities.Rastreo;

public interface IRastreoMercanciaDao extends CrudRepository<Rastreo, Long> {
	public List<Rastreo> findByCodigoRemision(String codigoRemision);
	public List<Rastreo> findByCodigoRemisionAndTipo(String codigoRemision, Integer tipo);
	public List<Rastreo> findByCodigoOperador(Integer codigoOperador);
}