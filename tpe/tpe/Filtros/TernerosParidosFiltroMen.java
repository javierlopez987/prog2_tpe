package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroMen implements Filtro {
	int ternerosParidos;
	
	public TernerosParidosFiltroMen(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
	}

	public boolean cumple(Animal a) {
		return a.getTernerosParidos() > this.ternerosParidos;
	}
}
