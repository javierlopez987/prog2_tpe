package tpe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tpe.Composite.Animal;

public class Camion implements Iterable<Animal>{
	String patente;
	int capacidad;
	List<Animal> carga;
	
	public Camion(int capacidad, String patente) {
		this.capacidad = capacidad;
		carga = new ArrayList<>();
		this.patente = patente;
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public boolean agregar(Animal a) {
		if(carga.size() < this.capacidad) {
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

	// No retornar Colección - Se rompe encapsulamiento
	/*
	public List<Animal> getCarga() {
		return carga;
	}
	*/
	
	public boolean isCompleto() {
		return carga.size() == getCapacidad();
	}

	@Override
	public Iterator<Animal> iterator() {
		return carga.iterator();
	}

	@Override
	public String toString() {
		return "Camion [patente=" + patente + ", capacidad=" + capacidad + "]";
	}
}
