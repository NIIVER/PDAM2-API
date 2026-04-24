package com.Oltursa.PDAM2.service;

import java.util.List;

import com.Oltursa.PDAM2.model.Viaje;

public interface ViajeService {
	Viaje registrar(Viaje v);

    List<Viaje> listar();

    Viaje buscar(Integer id);

    Viaje actualizar(Viaje v);

    void eliminar(Integer id);

}
