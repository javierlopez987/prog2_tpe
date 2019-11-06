package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroIgual implements Filtro {
	int ternerosParidos;
	
	public TernerosParidosFiltroIgual(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
	}

	public boolean cumple(Animal a) {
		return a.getTernerosParidos() == this.ternerosParidos;
	}
}
