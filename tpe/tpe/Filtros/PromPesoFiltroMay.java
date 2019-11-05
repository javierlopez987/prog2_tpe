package tpe.Filtros;

import tpe.Composite.Animal;

public class PromPesoFiltroMay extends PromPeso implements Filtro {
	
	
	public PromPesoFiltroMay(int p) {
		super(p);
	}
	
	@Override
	public boolean cumple(Animal a) {
		return a.getPromPeso() > getPromPeso();
	}


}
