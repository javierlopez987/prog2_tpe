package tpe;

import java.util.List;

public abstract class ElementoGanadero {
	public abstract int getPeso();
	
	public abstract int getCantidad();
	
	public abstract int getEdad();
	
	public abstract String getCategoria();
	
	public abstract List<Animal> buscar(Filtro f);
	
	public int getPromPeso() {
		return getPeso() / getCantidad();
	}
	
	public int getPromEdad() {
		return getEdad() / getEdad();
	}
}
