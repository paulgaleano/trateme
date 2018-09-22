package com.trateme.transportemercanciamicroservice.models.service;

import java.util.List;

import com.trateme.transportemercanciamicroservice.models.entity.Transporte;


public interface ITransporteService {

	public List<Transporte> findAll();
	
	public Transporte findById(Long id);
		
	public Transporte save(Transporte t);
}
