package com.trateme.entregamercanciamicroservice.models.entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;

@Entity
public class Entrega implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer codigoEntrega;
	private Integer codigoOperador;
	private Integer tipoEntrega;
	private String codigoRemision;
	private Integer codigoTripulacion;
	private Date fechaEntrega;
	private LocalTime horaEntrega;
	
	
	
	
	
	
	
	
	
	
	

	@PrePersist
	public void prePersist() {
		this.fechaEntrega = new Date();
		this.horaEntrega = LocalTime.now();
	}
}
