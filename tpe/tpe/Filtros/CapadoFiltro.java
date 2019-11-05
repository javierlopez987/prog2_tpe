package tpe.Filtros;

import tpe.Composite.Animal;

public class CapadoFiltro implements Filtro {
	public CapadoFiltro() {
		
	}

	@Override
	public boolean cumple(Animal a) {
		return a.isCapado();
	}
	
	
}
