package com.di.cleanup.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.di.cleanup.dto.Factura;


@Service
@Transactional
public class FacturaService {
	
	@Autowired
	private FacturaRepository repo;
	
	
	public List<Factura> listAll() {
		return repo.findAll();
	}
	
	public void save(Factura factura) {
		repo.save(factura);
	}
	
	public Factura get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}