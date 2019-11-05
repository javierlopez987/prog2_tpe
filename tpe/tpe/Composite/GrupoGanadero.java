package tpe.Composite;

import java.util.ArrayList;
import java.util.List;

import tpe.Camion;
import tpe.Filtros.Filtro;

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
			result.addAll(e.buscar(f));
		}
		return result;
	}
	
	public void descargarStock(List<Animal> enCamion) {
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
	

	
	public String ToString() {
		
		String string = "";
		
		for(ElementoGanadero e:rodeo)
		{
			string+= e.ToString();
		}
		return string;
	}
	
	public List<ElementoGanadero> getRodeo()
	{
		return this.rodeo;
	}
}
