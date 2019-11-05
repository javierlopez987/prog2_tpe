package tpe.Filtros;

import tpe.Composite.Animal;

public class PromPesoFiltroMen extends PromPeso implements Filtro{
	

	public PromPesoFiltroMen(int p) {
		super(p);
	}
	@Override
	public boolean cumple(Animal a) {
		return a.getPromPeso() < getPromPeso();
	}


}
