package tpe.Composite;

import java.util.List;

import tpe.Camion;
import tpe.Filtros.Filtro;

public abstract class ElementoGanadero {
	public abstract int getPesoTotal();
	
	public abstract int getCantidadTotal();
	
	public abstract int getEdadTotal();
	
	public abstract List<Animal> buscar(Filtro f);
	
	public abstract List<Animal> cargarCamion(Camion c, Filtro f);
	
	//return double
	public double getPromPeso() {
		return getPesoTotal() / getCantidadTotal();
	}
	
	//return double
	public double getPromEdad() {
		return getEdadTotal() / getCantidadTotal();
	}

	//Se agrega toString()
	public abstract String toString();
}
