package com.trateme.recibomercanciamicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trateme.recibomercanciamicroservice.models.entity.Remision;
import com.trateme.recibomercanciamicroservice.models.service.IRemisionService;


@RestController
@RequestMapping("/api")
public class RemisionController {

	@Autowired
	private IRemisionService remisionService;
	
	@GetMapping("/ReciboMercancia/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Remision findById(@PathVariable String id) {
		return remisionService.findById(id);
	}
	
	@GetMapping("/recibomercancia/consultar")
	@ResponseStatus(HttpStatus.OK)
	public List<Remision> findAll(){
		return remisionService.findAll();
	}
	
	@PostMapping("/recibomercancia/recibirenventanilla")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Remision r) {	 
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 0%
		return remisionService.save(r);
	} 
	
	@PostMapping("/recibomercancia/recibirenbase")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Remision r) {		
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 50%
		return remisionService.save(r);
	} 
	
	@PostMapping("/recibomercancia/recibirendireccionorigen")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Remision r) {		
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 100% 
		return remisionService.save(r);
	} 
}
