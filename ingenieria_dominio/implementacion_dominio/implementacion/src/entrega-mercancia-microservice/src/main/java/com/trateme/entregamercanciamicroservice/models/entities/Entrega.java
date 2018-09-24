package com.trateme.entregamercanciamicroservice.models.entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Entrega implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo_entrega")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigoEntrega;
	
	@Column(name="codigo_operador")
	private Integer codigoOperador;
	
	@Column(name="tipo_entrega")
	private Integer tipoEntrega;
	
	@Column(name="codigo_remision")
	private String codigoRemision;
	
	@Column(name="codigo_tripulacion")
	private Integer codigoTripulacion;
	
	@Column(name="fecha_entrega")
	private Date fechaEntrega;
	
	@Column(name="hora_entrega")
	private LocalTime horaEntrega;
	
	@Column(name="token")
	private String token;

	@Column(name="flete")
	private Double flete;
	

	public Long getCodigoEntrega() {
		return codigoEntrega;
	}
	
	public void setCodigoEntrega(Long codigoEntrega) {
		this.codigoEntrega = codigoEntrega;
	}

	public Integer getCodigoOperador() {
		return codigoOperador;
	}

	public void setCodigoOperador(Integer codigoOperador) {
		this.codigoOperador = codigoOperador;
	}

	public Integer getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(Integer tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public String getCodigoRemision() {
		return codigoRemision;
	}

	public void setCodigoRemision(String codigoRemision) {
		this.codigoRemision = codigoRemision;
	}

	public Integer getCodigoTripulacion() {
		return codigoTripulacion;
	}

	public void setCodigoTripulacion(Integer codigoTripulacion) {
		this.codigoTripulacion = codigoTripulacion;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public LocalTime getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(LocalTime horaEntrega) {
		this.horaEntrega = horaEntrega;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public Double getFlete() {
		return flete;
	}

	public void setFlete(Double flete) {
		this.flete = flete;
	}

	@PrePersist
	public void prePersist() {
		this.fechaEntrega = new Date();
		this.horaEntrega = LocalTime.now();
	}
}
