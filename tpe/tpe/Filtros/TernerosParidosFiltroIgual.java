package tpe.Filtros;

import tpe.Composite.Animal;

public class TernerosParidosFiltroIgual {
int ternerosParidos;
	
	public TernerosParidosFiltroIgual(int t) {
		ternerosParidos = t;
	}

	public boolean cumple(Animal a) {
		return a.getTernerosParidos() == getTernerosParidos();
	}

	public int getTernerosParidos() {
		return ternerosParidos;
	}

	public void setTernerosParidos(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
	}
	
}
