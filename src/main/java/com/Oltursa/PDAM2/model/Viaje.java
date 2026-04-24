package com.Oltursa.PDAM2.model;

import jakarta.persistence.*;

@Entity
public class Viaje {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer codVia;

	    private String origen;
	    private String destino;
	    private Double precio;
	    private String fecha;
	    private String hora;

	    public Integer getCodVia() {
	        return codVia;
	    }

	    public void setCodVia(Integer codVia) {
	        this.codVia = codVia;
	    }

	    public String getOrigen() {
	        return origen;
	    }

	    public void setOrigen(String origen) {
	        this.origen = origen;
	    }

	    public String getDestino() {
	        return destino;
	    }

	    public void setDestino(String destino) {
	        this.destino = destino;
	    }

	    public Double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(Double precio) {
	        this.precio = precio;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}
	    
}
