package tpe;

import java.util.ArrayList;
import java.util.List;

public class Camion {
	int capacidad;
	List<Animal> carga;
	
	public Camion(int capacidad) {
		this.capacidad = capacidad;
		carga = new ArrayList<>();
	}
	
	public boolean agregar(Animal a) {
		if(carga.size() < getCapacidad()) {
			return carga.add(a);
		}
		return false;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Animal> getCarga() {
		return carga;
	}
	
	public boolean isCompleto() {
		return carga.size() == getCapacidad();
	}
}
