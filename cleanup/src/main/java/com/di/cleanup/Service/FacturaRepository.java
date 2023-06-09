package com.di.cleanup.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.di.cleanup.dto.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

	@Query("select p from Factura p where p.numero_factura like ?1 ")
	public Factura findByName(String string); 
}