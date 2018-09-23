package com.trateme.recibomercanciamicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@CrossOrigin(origins= {""})
	@PostMapping("/recibomercancia/recibirenventanilla")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision saveV(@PathVariable Remision r) {	 
		r.setCodigoRecogidas(Long.valueOf(1)); //ventanilla
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 0%
		r.setFleteTotal(0.0);
		return remisionService.save(r);
	} 
	
	@CrossOrigin(origins= {""})
	@PostMapping("/recibomercancia/recibirenbase")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision saveB(@RequestBody Remision r) {		
		r.setCodigoRecogidas(Long.valueOf(2)); //base
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 50%
		r.setFleteTotal(50.0);
		return remisionService.save(r);
	} 
	
	@CrossOrigin(origins= {""})
	@PostMapping("/recibomercancia/recibirendireccionorigen")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision saveD(@RequestBody Remision r) {		
		r.setCodigoRecogidas(Long.valueOf(3)); //dirección origen
		//aplicar lista blanca pa saber si el cliente tiene permiso para esta opción dependiendo del producto que compró
		//flete 100% 
		r.setFleteTotal(100.0);
		return remisionService.save(r);
	} 
}
