package tpe;

import java.util.ArrayList;
import java.util.List;

public class SistemaGanadero {
	ElementoGanadero ganaderia;
	List<Categoria> categorizacion;
	List<Camion> flota;
	
	public SistemaGanadero() {
		ganaderia = null;
		categorizacion = new ArrayList<>();
		flota = new ArrayList<>();
	}
	
	public ElementoGanadero getNodoPrincipal() {
		return ganaderia;
	}

	public void setNodoPrincipal(ElementoGanadero ganaderia) {
		this.ganaderia = ganaderia;
	}

	public void addCategoriaDeClasificacion(Filtro criterio, String nombre) {
		Categoria c = new Categoria(criterio, nombre);
		categorizacion.add(c);
	}

	public void addCamionAFlota(int capacidad) {
		Camion c = new Camion (capacidad);
		flota.add(c);
	}
	
	public List<String> clasificar(Animal a) {
		List<String> result = new ArrayList<>();
		for(Categoria c: categorizacion) {
			if(c.getCriterio().cumple(a)) {
				result.add(c.getCategoria());
			}
		}
		return result;
	}
	
	private int getPeso() {
		return ganaderia.getPeso();
	};
	
	public int getCantidad() {
		return ganaderia.getCantidad();
	};
	
	private int getEdad() {
		return ganaderia.getEdad();
	};
	
	public List<Animal> buscar(Filtro f) {
		return ganaderia.buscar(f);
	};
	
	public List<Animal> cargarCamiones(Filtro f) {
		List<Animal> result = new ArrayList<>();
		for(Camion c: flota) {
			result.addAll(ganaderia.cargarCamion(c, f));
		}
		return result;
	};
	
	public int getPromPeso() {
		return getPeso() / getCantidad();
	}
	
	public int getPromEdad() {
		return getEdad() / getEdad();
	}
}
