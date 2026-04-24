package com.Oltursa.PDAM2.controller;



import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Oltursa.PDAM2.model.Viaje;

import com.Oltursa.PDAM2.service.ViajeService;


@RestController
@RequestMapping("/viaje")
@CrossOrigin("*")
public class ViajeController {
	 private final ViajeService service;

	    public ViajeController(ViajeService service) {
	        this.service = service;
	    }

	    @PostMapping("/registrar")
	    public Viaje registrar(@RequestBody Viaje v){
	        return service.registrar(v);
	    }

	    @GetMapping("/lista")
	    public List<Viaje> listar(){
	        return service.listar();
	    }

	    @GetMapping("/buscar/{id}")
	    public Viaje buscar(@PathVariable Integer id){
	        return service.buscar(id);
	    }

	    @PutMapping("/actualizar")
	    public Viaje actualizar(@RequestBody Viaje v){
	        return service.actualizar(v);
	    }

	    @DeleteMapping("/eliminar/{id}")
	    public void eliminar(@PathVariable Integer id){
	        service.eliminar(id);
	    }
}
