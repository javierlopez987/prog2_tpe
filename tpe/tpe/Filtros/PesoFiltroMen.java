package tpe.Filtros;

import tpe.Composite.Animal;

public class PesoFiltroMen extends PesoFiltro implements Filtro{
	
	public PesoFiltroMen(int p) {
		super(p);
	}
	
	@Override
	public boolean cumple(Animal a) {
		return a.getPeso() < getPeso();
	}

}
