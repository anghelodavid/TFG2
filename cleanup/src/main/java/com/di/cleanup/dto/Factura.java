package com.di.cleanup.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Esta clase se encarga de crear los objetos de factura que se usaran en la aplicacion.
 * @author anghelo
 *
 */

@Entity
public class Factura {
    // Atributos de la clase Factura con sus datos correspondientes
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
   /*se penso realizar el calculo dentro de la propia aplicacion
    * pero se descarto
    */
     // 21% de IVA
    public static final Double PORCENTAJE_IVA = 0.21; 
    
    // Constructor con parámetros
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
    
    // Constructor que permitira la creacion y el almacenamiento de la factura
    public Factura() {
        // TODO Auto-generated constructor stub
    }
    
    // Anotación @Id para indicar que este atributo es la clave primaria
    @Id
    // Anotación @GeneratedValue para indicar que la generación de valores es automática
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    
    // Método setter para el atributo id
    public void setId(long id) {
        this.id = id;
    }
    
    // Métodos getter y setter para el atributo numero_factura
    public String getNumero_factura() {
        return numero_factura;
    }
    
    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }
    
    // Métodos getter y setter para el atributo fecha
    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    // Métodos getter y setter para el atributo cliente
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    // Métodos getter y setter para el atributo domicilio
    public String getDomicilio() {
        return domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    // Métodos getter y setter para el atributo poblacion
    public String getPoblacion() {
        return poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    
    // Métodos getter y setter para el atributo dni
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    // Métodos getter y setter para el atributo estado
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // Métodos getter y setter para el atributo descripcion_trabajo
    public String getDescripcion_trabajo() {
        return descripcion_trabajo;
    }
    
    public void setDescripcion_trabajo(String descripcion_trabajo) {
        this.descripcion_trabajo = descripcion_trabajo;
    }
    
    // Métodos getter y setter para el atributo precio_trabajo
    public String getPrecio_trabajo() {
        return precio_trabajo;
    }
    
    public void setPrecio_trabajo(String precio_trabajo) {
        this.precio_trabajo = precio_trabajo;
    }
    
    // Método getter para el atributo PORCENTAJE_IVA
    public static Double getPorcentajeIva() {
        return PORCENTAJE_IVA;
    }
}
