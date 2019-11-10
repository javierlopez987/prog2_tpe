package tpe.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tpe.Camion;
import tpe.Filtros.Filtro;

public class GrupoGanadero extends ElementoGanadero implements Iterable<ElementoGanadero>{
	List<ElementoGanadero> rodeo;
	
	public GrupoGanadero() {
		rodeo = new ArrayList<>();
	}
	
	public void agregar(ElementoGanadero e) {
		rodeo.add(e);
	}
	
	//NO eliminar elementos
	/*
	public void quitar(ElementoGanadero e) {
		rodeo.remove(e);
	}
	
	public void quitarRodeo(List<ElementoGanadero> c) {
		rodeo.removeAll(c);
	}
	*/

	@Override
	public int getPesoTotal() {
		int suma = 0;
		for(ElementoGanadero e: rodeo) {
			suma += e.getPesoTotal();
		}
		return suma;
	}

	@Override
	public int getCantidadTotal() {
		int suma = 0;
		for(ElementoGanadero e: rodeo) {
			suma += e.getCantidadTotal();
		}
		return suma;
	}

	@Override
	public int getEdadTotal() {
		int suma = 0;
		for(ElementoGanadero e: rodeo) {
			suma += e.getEdadTotal();
		}
		return suma;
	}

	@Override
	public List<Animal> buscar(Filtro f) {
		List<Animal> result = new ArrayList<>();
		for(ElementoGanadero e: rodeo) {
			result.addAll(e.buscar(f));
		}
		return result;
	}
	
	private void descargarStock(List<Animal> enCamion) {
		rodeo.removeAll(enCamion);
	}

	@Override
	public List<Animal> cargarCamion(Camion c, Filtro f) {
		List<Animal> result = new ArrayList<>();
		for(ElementoGanadero e: rodeo) {
			result.addAll(e.cargarCamion(c, f));
		}
		descargarStock(result);
		return result;
	}
	
	// No retornar Colección - Se rompe encapsulamiento
	/*
	public List<ElementoGanadero> getRodeo()
	{
		return this.rodeo;
	}
	*/
	
	//Se agrega toString()
	public String toString() {
		String result = "";
		for(ElementoGanadero e: rodeo) {
			result += e.toString() + "\n";
		}
		return result;
	}
	
	//Se agrega iterator()
	public Iterator<ElementoGanadero> iterator() {
		return rodeo.iterator();
	}
}
