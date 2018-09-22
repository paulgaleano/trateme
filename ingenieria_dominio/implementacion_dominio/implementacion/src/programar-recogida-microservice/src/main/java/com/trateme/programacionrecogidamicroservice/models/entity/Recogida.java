package com.trateme.programacionrecogidamicroservice.models.entity;

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
public class Recogida implements Serializable {

	@Id
	@Column(name="codigo_recogidas")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codRecogida;
	
	@Column(name="codigo_operador")
	private Long codigoOperador;
	
	@Column(name="tipo_recogida")
	private Long tipoRecogida;
	
	@Column(name="codigo_tripulacion")
	private Long codigoTripulacion;
	
	@Column(name="codigo_remitente")
	private Long codigoRemitente;
	
	@Column(name="nombre_remitente")
	private String nombreRemitente;
	
	@Column(name="direccion_remitente")
	private String dreccionRemitente;
	
	@Column(name="codigo_ciudad_remitente")
	private String codigoCiudadRemitente;
	
	@Column(name="telefono_remitente")
	private String telefonoRemintente;
	
	@Column(name="codigo_destinatario")
	private Long codigoDestinatario;
		
	@Column(name="nombre_destinatario")
	private String nombreDestinatario;
	
	@Column(name="direccion_destinatario")
	private String dreccionDestinatario;
	
	@Column(name="codigo_ciudad_destinatario")
	private String codigoCiudadDestinatario;
	
	@Column(name="telefono_destinatario")
	private String telefonoDestinatario;
	
	@Column(name="fecha_llamada")
	private Date fechaLlamada;
	
	@Column(name="hora_llamada")
	private LocalTime horaLLamada;
	
	@Column(name="fecha_programacion")
	private Date fechaProgramacion;
	
	@Column(name="hora_programacion")
	private LocalTime horaProgramacion;
	
	@Column(name="fecha_recogida")
	private Date fechaRecogida;
	
	@Column(name="hora_recgida")
	private LocalTime horaRecogida;
	
	@Column(name="token")
	private String token;
	
	
	@PrePersist
	public void prePersist() {
		horaLLamada = LocalTime.now();
		fechaLlamada = new Date();
	}
	
	
	public Long getCodRecogida() {
		return codRecogida;
	}



	public void setCodRecogida(Long codRecogida) {
		this.codRecogida = codRecogida;
	}



	public Long getCodigoOperador() {
		return codigoOperador;
	}



	public void setCodigoOperador(Long codigoOperador) {
		this.codigoOperador = codigoOperador;
	}



	public Long getTipoRecogida() {
		return tipoRecogida;
	}



	public void setTipoRecogida(Long tipoRecogida) {
		this.tipoRecogida = tipoRecogida;
	}



	public Long getCodigoTripulacion() {
		return codigoTripulacion;
	}



	public void setCodigoTripulacion(Long codigoTripulacion) {
		this.codigoTripulacion = codigoTripulacion;
	}



	public Long getCodigoRemitente() {
		return codigoRemitente;
	}



	public void setCodigoRemitente(Long codigoRemitente) {
		this.codigoRemitente = codigoRemitente;
	}



	public String getNombreRemitente() {
		return nombreRemitente;
	}



	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}



	public String getDreccionRemitente() {
		return dreccionRemitente;
	}



	public void setDreccionRemitente(String dreccionRemitente) {
		this.dreccionRemitente = dreccionRemitente;
	}



	public String getCodigoCiudadRemitente() {
		return codigoCiudadRemitente;
	}



	public void setCodigoCiudadRemitente(String codigoCiudadRemitente) {
		this.codigoCiudadRemitente = codigoCiudadRemitente;
	}



	public String getTelefonoRemintente() {
		return telefonoRemintente;
	}



	public void setTelefonoRemintente(String telefonoRemintente) {
		this.telefonoRemintente = telefonoRemintente;
	}



	public Long getCodigoDestinatario() {
		return codigoDestinatario;
	}



	public void setCodigoDestinatario(Long codigoDestinatario) {
		this.codigoDestinatario = codigoDestinatario;
	}



	public String getNombreDestinatario() {
		return nombreDestinatario;
	}



	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}



	public String getDreccionDestinatario() {
		return dreccionDestinatario;
	}



	public void setDreccionDestinatario(String dreccionDestinatario) {
		this.dreccionDestinatario = dreccionDestinatario;
	}



	public String getCodigoCiudadDestinatario() {
		return codigoCiudadDestinatario;
	}



	public void setCodigoCiudadDestinatario(String codigoCiudadDestinatario) {
		this.codigoCiudadDestinatario = codigoCiudadDestinatario;
	}



	public String getTelefonoDestinatario() {
		return telefonoDestinatario;
	}



	public void setTelefonoDestinatario(String telefonoDestinatario) {
		this.telefonoDestinatario = telefonoDestinatario;
	}



	public Date getFechaLlamada() {
		return fechaLlamada;
	}



	public void setFechaLlamada(Date fechaLlamada) {
		this.fechaLlamada = fechaLlamada;
	}



	public LocalTime getHoraLLamada() {
		return horaLLamada;
	}



	public void setHoraLLamada(LocalTime horaLLamada) {
		this.horaLLamada = horaLLamada;
	}



	public Date getFechaProgramacion() {
		return fechaProgramacion;
	}



	public void setFechaProgramacion(Date fechaProgramacion) {
		this.fechaProgramacion = fechaProgramacion;
	}



	public LocalTime getHoraProgramacion() {
		return horaProgramacion;
	}



	public void setHoraProgramacion(LocalTime horaProgramacion) {
		this.horaProgramacion = horaProgramacion;
	}



	public Date getFechaRecogida() {
		return fechaRecogida;
	}



	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}



	public LocalTime getHoraRecogida() {
		return horaRecogida;
	}



	public void setHoraRecogida(LocalTime horaRecogida) {
		this.horaRecogida = horaRecogida;
	}



	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}



	private static final long serialVersionUID = 1L;	
	
}
