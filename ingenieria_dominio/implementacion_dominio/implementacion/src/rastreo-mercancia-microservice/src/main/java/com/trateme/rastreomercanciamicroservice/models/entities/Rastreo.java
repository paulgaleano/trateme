package com.trateme.rastreomercanciamicroservice.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import java.time.LocalTime;

@Entity
public class Rastreo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo_rastreo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigoRastreo;
	
	@Column(name="codigo_operador")
	private Integer codigoOperador;
	
	@Column(name="codigo_sub_proceso")
	private Integer codigoSubProceso;
	
	@Column(name="codigo_remision")
	private String codigoRemision;
	
	@Column(name="codigo_tripulacion")
	private Integer codigoTripulacion;
	
	@Column(name="tipo")
	private Integer tipo;
	
	@Column(name="fecha_rastreo")
	private Date fechaRastreo;
	
	@Column(name="hora_rastreo")
	private LocalTime horaRastreo;
	
	@Column(name="token")
	private String token;

	public Long getCodigoRastreo() {
		return codigoRastreo;
	}

	public void setCodigoRastreo(Long codigoRastreo) {
		this.codigoRastreo = codigoRastreo;
	}

	public Integer getCodigoOperador() {
		return codigoOperador;
	}

	public void setCodigoOperador(Integer codigoOperador) {
		this.codigoOperador = codigoOperador;
	}

	public Integer getCodigoSubProceso() {
		return codigoSubProceso;
	}

	public void setCodigoSubProceso(Integer codigoSubProceso) {
		this.codigoSubProceso = codigoSubProceso;
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
	
	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Date getFechaRastreo() {
		return fechaRastreo;
	}

	public void setFechaRastreo(Date fechaRastreo) {
		this.fechaRastreo = fechaRastreo;
	}

	public LocalTime getHoraRastreo() {
		return horaRastreo;
	}

	public void setHoraRastreo(LocalTime horaRastreo) {
		this.horaRastreo = horaRastreo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}	
	
	@PrePersist
	public void prePersist() {
		this.fechaRastreo = new Date();
		this.horaRastreo = LocalTime.now();
	}
}