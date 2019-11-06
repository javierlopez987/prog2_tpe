package tpe.Filtros;

import tpe.Composite.Animal;

public class PesoFiltroMay implements Filtro{
	int peso;
	
	public PesoFiltroMay(int peso) {
		this.peso = peso;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getPeso() > this.peso;
	}


}
