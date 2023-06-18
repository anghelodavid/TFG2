package com.di.cleanup.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Esta clase se encarga de crear los objetos que se usaran en la aplicacion.
 * @author anghelo
 *
 */

@Entity
public class Cliente {
    // Atributos de la clase Cliente
    private long id;
    private String nombre;
    private String dni;
    private String poblacion;
    private String direccion;
    
    // Constructor con parámetros y sus respectivos datos 
    protected Cliente(long id, String nombre, String dni, String poblacion, String direccion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.poblacion = poblacion;
        this.direccion = direccion;
    }
    
    // Constructor sin parámetros estos haran posible la creacion de nuevos clientes
    public Cliente() {
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
    
    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Métodos getter y setter para el atributo dni
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    // Métodos getter y setter para el atributo poblacion
    public String getPoblacion() {
        return poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    
    // Métodos getter y setter para el atributo direccion
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
