package tpe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SistemaGanadero {
	ElementoGanadero ganaderia;
	Map<Filtro, String> categorias;
	
	public SistemaGanadero() {
		ganaderia = new GrupoGanadero();
		categorias = new HashMap<>();
	}
	
	public void addCategoria(Filtro criterio, String nombre) {
		categorias.put(criterio, nombre);
	}
	
	public String getCategoria(Filtro f) {
		return categorias.get(f);
	}
	
	public void deleteCategoria(Filtro f) {
		categorias.remove(f);
	}
	
	public List<String> clasificar(Animal a) {
		List<String> result = new ArrayList<>();
		Iterator<Filtro> filtros = categorias.keySet().iterator();
		if(filtros.hasNext()) {
			if(filtros.next().cumple(a)) {
				result.add(categorias.get(filtros.next()));
			};
		}
		return result;
	}
}
