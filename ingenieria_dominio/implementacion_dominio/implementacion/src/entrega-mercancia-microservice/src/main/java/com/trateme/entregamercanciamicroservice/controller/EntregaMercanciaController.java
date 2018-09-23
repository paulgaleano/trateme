package com.trateme.entregamercanciamicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trateme.entregamercanciamicroservice.models.entities.Entrega;
import com.trateme.entregamercanciamicroservice.models.services.IEntregaMercanciaService;

@RestController
@RequestMapping("/")
public class EntregaMercanciaController {

	@Autowired
	private IEntregaMercanciaService entregaMercanciaService;
	
	@GetMapping("/entregamercancias/{codigoEntrega}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Entrega> findById(@PathVariable Long codigoEntrega){
		return entregaMercanciaService.findById(codigoEntrega);
	}
	
	@PostMapping("/entregamercancias")
	@ResponseStatus(HttpStatus.CREATED)
	public Entrega save(@RequestBody Entrega e) throws Exception {		
		return entregaMercanciaService.save(e);
	}
	
	@GetMapping("/entregamercancias")
	@ResponseStatus(HttpStatus.OK)
	public List<Entrega> findAll(){
		return entregaMercanciaService.findAll();
	}
	
	@GetMapping("/entregamercancias/operadores/{codigoOperador}")
	@ResponseStatus(HttpStatus.OK)
	public List<Entrega> findByCodigoOperador(@PathVariable Integer codigoOperador){
		return entregaMercanciaService.findByCodigoOperador(codigoOperador);
	}	
}