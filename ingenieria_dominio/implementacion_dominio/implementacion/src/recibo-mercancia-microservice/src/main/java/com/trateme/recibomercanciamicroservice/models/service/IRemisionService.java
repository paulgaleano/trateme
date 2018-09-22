package com.trateme.recibomercanciamicroservice.models.service;

import java.util.List;

import com.trateme.recibomercanciamicroservice.models.entity.Remision;


public interface IRemisionService {

	public List<Remision> findAll();
	
	public Remision findById(String id);
	
	public Remision save(Remision r);
}
