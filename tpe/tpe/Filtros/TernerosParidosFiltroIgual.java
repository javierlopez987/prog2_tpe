package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroIgual extends TernerosParidos implements Filtro {
	
	
	public TernerosParidosFiltroIgual(int t) {
		super(t);
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getTernerosParidos() == getTernerosParidos();
	}

	



}
