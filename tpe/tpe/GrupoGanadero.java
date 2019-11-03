package tpe;

import java.util.ArrayList;
import java.util.List;

public class GrupoGanadero extends ElementoGanadero{
	List<ElementoGanadero> rodeo;
	
	public GrupoGanadero() {
		rodeo = new ArrayList<>();
	}
	
	public void agregar(ElementoGanadero e) {
		rodeo.add(e);
	}
	
	public void quitar(ElementoGanadero e) {
		rodeo.remove(e);
	}
	
	public void quitarRodeo(List<ElementoGanadero> c) {
		rodeo.removeAll(c);
	}

	@Override
	public int getPeso() {
		int suma = 0;
		for(ElementoGanadero e: rodeo) {
			suma += e.getPeso();
		}
		return suma;
	}

	@Override
	public int getCantidad() {
		int suma = 0;
		for(ElementoGanadero e: rodeo) {
			suma += e.getCantidad();
		}
		return suma;
	}

	@Override
	public int getEdad() {
		int suma = 0;
		for(ElementoGanadero e: rodeo) {
			suma += e.getEdad();
		}
		return suma;
	}

	@Override
	public List<Animal> buscar(Filtro f) {
		List<Animal> result = new ArrayList<>();
		for(ElementoGanadero e: rodeo) {
			result.addAll( e.buscar(f) );
		}
		return result;
	}
}
