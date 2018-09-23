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
	
	@GetMapping("/entregarmercancia/{codigoEntrega}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Entrega> findById(@PathVariable Long codigoEntrega){
		return entregaMercanciaService.findById(codigoEntrega);
	}
	
	@GetMapping("/entregarmercancia/consultar")
	@ResponseStatus(HttpStatus.OK)
	public List<Entrega> findAll(){
		return entregaMercanciaService.findAll();
	}
	
	@GetMapping("/entregarmercancia/operadores/{codigoOperador}")
	@ResponseStatus(HttpStatus.OK)
	public List<Entrega> findByCodigoOperador(@PathVariable Integer codigoOperador){
		return entregaMercanciaService.findByCodigoOperador(codigoOperador);
	}
	
	@PostMapping("/entregarmercancia")
	@ResponseStatus(HttpStatus.CREATED)
	public Entrega save(@RequestBody Entrega e) throws Exception {		
		return entregaMercanciaService.save(e);
	}	

	//adicionadas por variabilidad

	@PostMapping("/entregarmercancia/entregarenventanilla")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Entrega e) {	 
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 0%
		r.tipoEntrega=1; //ventanilla
		return entregaMercanciaService.save(e);
	} 
	
	@PostMapping("/entregarmercancia/entregarenbase")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Entrega e) {		
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 50%
		r.tipoEntrega=2; //base
		return entregaMercanciaService.save(e);
	} 
	
	@PostMapping("/entregarmercancia/entregarendirecciondestino")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Entrega e) {		
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 100% 
		r.tipoEntrega=3; //dirección destino
		return entregaMercanciaService.save(e);
	} 
}