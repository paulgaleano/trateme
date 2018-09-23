package com.trateme.recibomercanciamicroservice.models.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Remision implements Serializable {


	@Id
	@Column(name="codigo_remision")
	private String codigoRemison;
	@Column(name="codigo_operador")
	private Long codigoOperador;
	@Column(name="codigo_recogidas")
	private Long codigoRecogidas;
	@Column(name="codigo_tripulacion")
	private Long codigoTripulacion;
	@Column(name="numero_total_unidades")
	private Long numeroTotalUnidades;
	@Column(name="peso_total_unidades")
	private Double pesoTotalUnidades;
	@Column(name="volumen_total_unidades")
	private Double volumenTotalUnidades;
	@Column(name="flete_total")
	private Double fleteTotal;
	@Column(name="fecha_creacion_remision")
	private Date fechaCreacionRemision;
	@Column(name="hora_creacion_remision")
	private LocalTime horaCreacionRemision;
	@Column(name="token")
	private String token;
	@Column(name="tipo_recogida")
	private Integer tipoRecogida; //base, ventanilla, dirección origen
	@Column(name="tipo_entrega")
	private Integer tipoEntrega; //base, ventanilla, dirección destino
	
	@PrePersist
	public void prePersist() {
		fechaCreacionRemision = new Date();
		horaCreacionRemision = LocalTime.now();
	}
	
	public String getCodigoRemison() {
		return codigoRemison;
	}
	public void setCodigoRemison(String codigoRemison) {
		this.codigoRemison = codigoRemison;
	}
	public Long getCodigoOperador() {
		return codigoOperador;
	}
	public void setCodigoOperador(Long codigoOperador) {
		this.codigoOperador = codigoOperador;
	}
	public Long getCodigoRecogidas() {
		return codigoRecogidas;
	}
	public void setCodigoRecogidas(Long codigoRecogidas) {
		this.codigoRecogidas = codigoRecogidas;
	}
	public Long getCodigoTripulacion() {
		return codigoTripulacion;
	}
	public void setCodigoTripulacion(Long codigoTripulacion) {
		this.codigoTripulacion = codigoTripulacion;
	}
	public Long getNumeroTotalUnidades() {
		return numeroTotalUnidades;
	}
	public void setNumeroTotalUnidades(Long numeroTotalUnidades) {
		this.numeroTotalUnidades = numeroTotalUnidades;
	}
	public Double getPesoTotalUnidades() {
		return pesoTotalUnidades;
	}
	public void setPesoTotalUnidades(Double pesoTotalUnidades) {
		this.pesoTotalUnidades = pesoTotalUnidades;
	}
	public Double getVolumenTotalUnidades() {
		return volumenTotalUnidades;
	}
	public void setVolumenTotalUnidades(Double volumenTotalUnidades) {
		this.volumenTotalUnidades = volumenTotalUnidades;
	}
	public Double getFleteTotal() {
		return fleteTotal;
	}
	public void setFleteTotal(Double fleteTotal) {
		this.fleteTotal = fleteTotal;
	}
	public Date getFechaCreacionRemision() {
		return fechaCreacionRemision;
	}
	public void setFechaCreacionRemision(Date fechaCreacionRemision) {
		this.fechaCreacionRemision = fechaCreacionRemision;
	}
	public LocalTime getHoraCreacionRemision() {
		return horaCreacionRemision;
	}
	public void setHoraCreacionRemision(LocalTime horaCreacionRemision) {
		this.horaCreacionRemision = horaCreacionRemision;
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
