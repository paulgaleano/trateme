package com.trateme.transportemercanciamicroservice.models.entity;

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
public class Transporte implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo_transporte")
	public Long codigoTransporte;
	@Column(name="codigo_operador")
	public Long codigoOperador;
	@Column(name="Tipo_Transporte")
	public Long tipoTransporte;
	@Column(name="codigo_remision")
	public String codigoRemision;
	@Column(name="codigo_tripulacion")
	public Long codigoTripulacion;
	@Column(name="feha_inicio_transporte")
	public Date fechaInicioTrandporte;
	@Column(name="hora_inicio_transporte")
	public LocalTime horaInicioTransporte;
	@Column(name="fecha_fin_transporte")
	public Date fechaFinTransporte;
	@Column(name="hora_fin_transporte")
	public LocalTime horaFinTransporte;

	public String token;
	
	@PrePersist
	public void prePersist() {
		horaInicioTransporte = LocalTime.now();
		fechaInicioTrandporte =new Date();
	}

	public Long getCodigoTransporte() {
		return codigoTransporte;
	}

	public void setCodigoTransporte(Long codigoTransporte) {
		this.codigoTransporte = codigoTransporte;
	}

	public Long getCodigoOperador() {
		return codigoOperador;
	}

	public void setCodigoOperador(Long codigoOperador) {
		this.codigoOperador = codigoOperador;
	}

	public Long getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(Long tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	public String getCodigoRemision() {
		return codigoRemision;
	}

	public void setCodigoRemision(String codigoRemision) {
		this.codigoRemision = codigoRemision;
	}

	public Long getCodigoTripulacion() {
		return codigoTripulacion;
	}

	public void setCodigoTripulacion(Long codigoTripulacion) {
		this.codigoTripulacion = codigoTripulacion;
	}

	public Date getFechaInicioTrandporte() {
		return fechaInicioTrandporte;
	}

	public void setFechaInicioTrandporte(Date fechaInicioTrandporte) {
		this.fechaInicioTrandporte = fechaInicioTrandporte;
	}

	public LocalTime getHoraInicioTransporte() {
		return horaInicioTransporte;
	}

	public void setHoraInicioTransporte(LocalTime horaInicioTransporte) {
		this.horaInicioTransporte = horaInicioTransporte;
	}

	public Date getFechaFinTransporte() {
		return fechaFinTransporte;
	}

	public void setFechaFinTransporte(Date fechaFinTransporte) {
		this.fechaFinTransporte = fechaFinTransporte;
	}

	public LocalTime getHoraFinTransporte() {
		return horaFinTransporte;
	}

	public void setHoraFinTransporte(LocalTime horaFinTransporte) {
		this.horaFinTransporte = horaFinTransporte;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
