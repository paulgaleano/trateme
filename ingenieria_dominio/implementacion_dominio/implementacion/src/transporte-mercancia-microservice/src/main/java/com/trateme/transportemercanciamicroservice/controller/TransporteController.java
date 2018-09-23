package com.trateme.transportemercanciamicroservice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.trateme.transportemercanciamicroservice.models.entity.Transporte;
import com.trateme.transportemercanciamicroservice.models.service.ITransporteService;

@RestController
@RequestMapping("/api")
public class TransporteController {

	@Autowired
	private ITransporteService transporteService;
	
	@PostMapping("/transportemercancia/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Transporte findById(@PathVariable Long id) {
		return transporteService.findById(id);
	}
	
	@GetMapping("/transportemercancia/consultar")
	@ResponseStatus(HttpStatus.OK)
	public List<Transporte> findAll(){
		return transporteService.findAll();
	}
	
	@CrossOrigin(origins= {""})
	@PostMapping("/transportemercancia/transportar")
	@ResponseStatus(HttpStatus.CREATED)
	public Transporte saveD(@PathVariable Transporte r) {		 
		return transporteService.save(r);
	}
}
