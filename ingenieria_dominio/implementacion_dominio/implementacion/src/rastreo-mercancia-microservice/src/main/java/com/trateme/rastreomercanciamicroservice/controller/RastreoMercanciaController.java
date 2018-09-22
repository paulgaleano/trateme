package com.trateme.rastreomercanciamicroservice.controller;

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

import com.trateme.rastreomercanciamicroservice.models.entities.Rastreo;
import com.trateme.rastreomercanciamicroservice.models.service.IRastreoMercanciaService;



@RestController
@RequestMapping("/")
public class RastreoMercanciaController {

	@Autowired
	private IRastreoMercanciaService recogidaMercanciaService;
	
	@GetMapping("/rastreomercancias")
	@ResponseStatus(HttpStatus.OK)
	public List<Rastreo> findAll(){
		return recogidaMercanciaService.findAll();
	}
	
	
	@GetMapping("/rastreomercancias/remisiones/{codigoRemision}")
	@ResponseStatus(HttpStatus.OK)
	public List<Rastreo> findByCodigoRemision(@PathVariable String codigoRemision) {		
		return recogidaMercanciaService.findByCodigoRemision(codigoRemision);
	}
	
	@GetMapping("/rastreomercancias/remisiones/{codigoRemision}/tipos/{tipo}")
	@ResponseStatus(HttpStatus.OK)
	public List<Rastreo> findByCodigoRemisionAndTipo(@PathVariable String codigoRemision,@PathVariable Integer tipo) {		
		return recogidaMercanciaService.findByCodigoRemisionAndTipo(codigoRemision,tipo);
	}
	
	@PostMapping("/rastreomercancias")
	@ResponseStatus(HttpStatus.CREATED)
	public Rastreo save(@RequestBody Rastreo r) throws Exception {		
		return recogidaMercanciaService.save(r);
	}

}
