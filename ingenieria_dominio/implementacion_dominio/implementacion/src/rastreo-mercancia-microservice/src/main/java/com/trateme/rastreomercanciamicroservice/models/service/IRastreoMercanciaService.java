package com.trateme.rastreomercanciamicroservice.models.service;

import java.util.List;
import java.util.Optional;

import com.trateme.rastreomercanciamicroservice.models.entities.Rastreo;


public interface IRastreoMercanciaService {
	
	public Optional<Rastreo> findById(Long id);
	
	public List<Rastreo> findAll();
	
	public List<Rastreo> findByCodigoRemision(String codigoRemision);
	
	public List<Rastreo> findByCodigoRemisionAndTipo(String codigoRemision, int tipo);
	
	public Rastreo save(Rastreo r) throws Exception;
	
	public void delete(Long id);

}
