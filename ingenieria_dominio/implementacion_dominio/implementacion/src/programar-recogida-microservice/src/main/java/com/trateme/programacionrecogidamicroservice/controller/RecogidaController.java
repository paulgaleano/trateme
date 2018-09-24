package com.trateme.programacionrecogidamicroservice.controller;

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

import com.trateme.programacionrecogidamicroservice.models.entity.Recogida;
import com.trateme.programacionrecogidamicroservice.models.service.IRecogidaService;



@RestController
@RequestMapping("/api")
public class RecogidaController {

	@Autowired
	private IRecogidaService recogidaService;
	
	@GetMapping("/recogida/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Recogida> findAll(){
		return recogidaService.findAll();
	}
	
	@PostMapping("/recogida/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Recogida save(@RequestBody Recogida r) {		
		return recogidaService.save(r);
	}
	
	@GetMapping("/recogida/{id}")
	public Recogida findById(@PathVariable Long id) {
		return recogidaService.findById(id);
	}
}
