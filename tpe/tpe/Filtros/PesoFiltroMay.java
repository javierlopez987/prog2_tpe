package tpe.Filtros;

import tpe.Composite.Animal;

public class PesoFiltroMay extends PesoFiltro implements Filtro{

	public PesoFiltroMay(int p) {
		super(p);
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getPeso() > getPeso();
	}


}
