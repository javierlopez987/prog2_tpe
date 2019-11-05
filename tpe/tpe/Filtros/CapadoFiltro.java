package tpe.Filtros;

import tpe.Composite.Animal;

public class CapadoFiltro implements Filtro {
	
	@Override
	public boolean cumple(Animal a) {
		return a.isCapado();
	}
	
	
}
