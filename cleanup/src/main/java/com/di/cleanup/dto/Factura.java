package com.di.cleanup.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Factura {
	private long id;
	private String numero_factura;
	private LocalDate fecha;
	private String cliente;
	private String domicilio;
	private String poblacion;
	private String dni;
	private String estado;
	private String descripcion_trabajo;
	private String precio_trabajo;
	public static final Double PORCENTAJE_IVA = 0.21; // 21% de IVA
	
	protected Factura(long id, String numero_factura, LocalDate fecha, String cliente, String domicilio,
			String poblacion, String dni, String estado, String descripcion_trabajo, String precio_trabajo) {
		super();
		this.id = id;
		this.numero_factura = numero_factura;
		this.fecha = fecha;
		this.cliente = cliente;
		this.domicilio = domicilio;
		this.poblacion = poblacion;
		this.dni = dni;
		this.estado = estado;
		this.descripcion_trabajo = descripcion_trabajo;
		this.precio_trabajo = precio_trabajo;
	}
	public Factura() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumero_factura() {
		return numero_factura;
	}
	public void setNumero_factura(String numero_factura) {
		this.numero_factura = numero_factura;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion_trabajo() {
		return descripcion_trabajo;
	}
	public void setDescripcion_trabajo(String descripcion_trabajo) {
		this.descripcion_trabajo = descripcion_trabajo;
	}
	public String getPrecio_trabajo() {
		return precio_trabajo;
	}
	public void setPrecio_trabajo(String precio_trabajo) {
		this.precio_trabajo = precio_trabajo;
	}
	public static Double getPorcentajeIva() {
		return PORCENTAJE_IVA;
	}
	
}