package com.trateme.programacionrecogidamicroservice.models.service;

import java.util.List;

import com.trateme.programacionrecogidamicroservice.models.entity.Recogida;

public interface IRecogidaService {
	
	public List<Recogida> findAll();
	
	public Recogida findById(Long id);
	
	public Recogida save(Recogida r);

}
