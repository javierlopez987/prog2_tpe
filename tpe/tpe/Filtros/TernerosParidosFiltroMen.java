package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroMen extends TernerosParidos implements Filtro {
	
	public TernerosParidosFiltroMen(int t) {
		super(t);
	}
	
	@Override
	public boolean cumple(Animal a) {
		return a.getTernerosParidos() < getTernerosParidos();
	}

	
	
}
