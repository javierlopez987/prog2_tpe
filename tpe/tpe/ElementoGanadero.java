package tpe;

import java.util.List;

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
		return getEdad() / getEdad();
	}
	
}
