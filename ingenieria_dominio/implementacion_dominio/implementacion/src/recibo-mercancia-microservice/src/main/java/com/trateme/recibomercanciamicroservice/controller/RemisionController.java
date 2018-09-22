package com.trateme.recibomercanciamicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	@GetMapping("/remision/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Remision> findAll(){
		return remisionService.findAll();
	}
	
	@PostMapping("/remision/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Remision save(@RequestBody Remision r) {		
		return remisionService.save(r);
	}
}
