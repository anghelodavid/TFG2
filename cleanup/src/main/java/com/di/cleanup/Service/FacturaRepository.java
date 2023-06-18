package com.di.cleanup.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.di.cleanup.dto.Factura;

/**
 * Esta clase se encarga proporciona métodos para acceder a las operaciones básicas 
 * del CRUD y también permite definir consultas personalizadas .
 * @author anghelo
 *
 */

// Interfaz que extiende JpaRepository para acceder a las operaciones básicas de CRUD
public interface FacturaRepository extends JpaRepository<Factura, Long> {
   
	 // Consulta personalizada utilizando la anotación @Query
    @Query("select p from Factura p where p.numero_factura like ?1 ")
    public Factura findByName(String string);
}
