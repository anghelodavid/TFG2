package com.di.cleanup.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.di.cleanup.dto.Factura;

/**
 * Clase de servicio que maneja las operaciones relacionadas con la entidad Factura
 * @author anghelo
 *
 */
@Service
@Transactional
public class FacturaService {
	// Inyección de dependencia del repositorio FacturaRepository
    @Autowired
    private FacturaRepository repo;
    // Método que devuelve una lista de todas las facturas
    public List<Factura> listAll() {
        return repo.findAll();
    }
 
    // Método que guarda una factura en la base de datos
    public void save(Factura factura) {
        repo.save(factura);
    }
    
    // Método que obtiene una factura por su ID
    public Factura get(long id) {
        return repo.findById(id).get();
    }
 
    // Método que elimina una factura por su ID
    public void delete(long id) {
        repo.deleteById(id);
    }
    
}
