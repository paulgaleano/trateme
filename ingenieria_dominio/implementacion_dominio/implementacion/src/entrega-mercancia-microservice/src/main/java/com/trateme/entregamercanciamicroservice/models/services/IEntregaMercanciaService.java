package com.trateme.entregamercanciamicroservice.models.services;

import java.util.List;
import java.util.Optional;

import com.trateme.entregamercanciamicroservice.models.entities.Entrega;

public interface IEntregaMercanciaService {
	public Optional<Entrega> findById(Long id);
	public Entrega save(Entrega e) throws Exception;
	public void deleteById(Long id);
	public List<Entrega> findAll();
	public List<Entrega> findByCodigoOperador(Integer codigoOperador);
}
