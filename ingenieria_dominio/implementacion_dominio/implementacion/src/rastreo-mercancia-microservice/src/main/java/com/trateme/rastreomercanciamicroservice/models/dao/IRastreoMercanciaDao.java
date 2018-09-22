package com.trateme.rastreomercanciamicroservice.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.trateme.rastreomercanciamicroservice.models.entities.Rastreo;

public interface IRastreoMercanciaDao extends CrudRepository<Rastreo, Long> {
	public List<Rastreo> findByCodigoRemision(String codigoRemision);
	@Query("select a from Rastreo a where codigo_remision=:codigo_remision and tipo=:tipo")
	public List<Rastreo> findByCodigoRemisionAndTipo(@Param("codigo_remision") String codigoRemision, @Param("tipo") int tipo);
}