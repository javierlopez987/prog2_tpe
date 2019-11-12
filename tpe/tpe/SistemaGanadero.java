package tpe;

import java.util.ArrayList;
import java.util.List;

import tpe.Composite.*;
import tpe.Filtros.*;

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
	
	// No retornar Colección - Se rompe encapsulamiento
	/*
	public List<Camion> getFlota() {
		return flota;
	}
	*/

	public void addCamionAFlota(Camion c) {
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
	
	public int getCantidadTotal() {
		return ganaderia.getCantidadTotal();
	}
	
	public List<Animal> buscar(Filtro f) {
		return ganaderia.buscar(f);
	}
	
	public void cargarCamion(Camion c) {
		ganaderia.cargarCamion(c);
	}
	
	public double getPromPeso() {
		return ganaderia.getPromPeso();
	}
	
	public double getPromEdad() {
		return ganaderia.getPromEdad();
	}
	
	public int getPesoTotal() {
		return ganaderia.getPesoTotal();
	}
	
	public void mostrarCamion(Camion camion) {
		System.out.println("------------------------------");
		System.out.println("LOS ANIMALES DENTRO DEL CAMION " + camion + " SON: ");
		for(Animal a: camion) {
			System.out.println(a);
		}
	}
	
	public void mostrarEstadoGanaderia(GrupoGanadero ganaderia) {
		System.out.println("------------------------------");
		System.out.println("LOS ANIMALES EN EL SISTEMA SON: ");
		for(ElementoGanadero e: ganaderia) {
			System.out.println(e);
		}
	}
}
