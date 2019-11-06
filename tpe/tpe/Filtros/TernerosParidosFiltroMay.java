package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroMay implements Filtro {
	int ternerosParidos;
	
	public TernerosParidosFiltroMay(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
	}

	public boolean cumple(Animal a) {
		return a.getTernerosParidos() > this.ternerosParidos;
	}
}
