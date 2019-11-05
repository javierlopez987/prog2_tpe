package tpe.Filtros;

import tpe.Composite.Animal;

public class NotFiltro implements Filtro {
	Filtro f1;
	
	public NotFiltro(Filtro f) {
		f1 = f;
	}
	
	@Override
	public boolean cumple(Animal a) {
		return !f1.cumple(a);
	}

	public Filtro getF1() {
		return f1;
	}

	public void setF1(Filtro f1) {
		this.f1 = f1;
	}
	
}
