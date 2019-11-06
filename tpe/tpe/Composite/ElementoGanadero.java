package tpe.Composite;

import java.util.List;

import tpe.Camion;
import tpe.Filtros.Filtro;

public abstract class ElementoGanadero {
	public abstract int getPeso();
	
	public abstract int getCantidad();
	
	public abstract int getEdad();
	
	public abstract List<Animal> buscar(Filtro f);
	
	public abstract List<Animal> cargarCamion(Camion c, Filtro f);
	
	public int getPromPeso() {
		return getPeso() / getCantidad();
	}
	
	public int getPromEdad() {
		return getEdad() / getCantidad();
	}

}
