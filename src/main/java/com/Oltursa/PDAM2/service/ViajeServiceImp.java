package com.Oltursa.PDAM2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Oltursa.PDAM2.model.Viaje;
import com.Oltursa.PDAM2.repository.ViajeRepository;


@Service
public class ViajeServiceImp implements ViajeService {
	 private final ViajeRepository repo;

	    public ViajeServiceImp(ViajeRepository repo) {
	        this.repo = repo;
	    }

	    @Override
	    public Viaje registrar(Viaje v) {
	        return repo.save(v);
	    }

	    @Override
	    public List<Viaje> listar() {
	        return repo.findAll();
	    }

	    @Override
	    public Viaje buscar(Integer id) {
	        return repo.findById(id).orElse(null);
	    }

	    @Override
	    public Viaje actualizar(Viaje v) {
	        return repo.save(v);
	    }

	    @Override
	    public void eliminar(Integer id) {
	        repo.deleteById(id);
	    }

}
