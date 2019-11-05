package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroMay extends TernerosParidos implements Filtro {
	
	public TernerosParidosFiltroMay(int t) {
		super(t);
	}
	
	@Override
	public boolean cumple(Animal a) {
		return a.getTernerosParidos() > getTernerosParidos();
	}

	
	
}
