package tpe;

import java.util.ArrayList;
import java.util.List;

import tpe.Composite.Animal;

public class Camion {
	String patente;
	int capacidad;
	List<Animal> carga;
	
	public Camion(int capacidad) {
		this.capacidad = capacidad;
		carga = new ArrayList<>();
		patente = null;
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
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
