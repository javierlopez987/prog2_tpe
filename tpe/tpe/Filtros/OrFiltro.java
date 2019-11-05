package tpe.Filtros;

import tpe.Composite.Animal;

public class OrFiltro implements Filtro{
	Filtro f1;
	Filtro f2;
	
	public OrFiltro(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(Animal a) {
		return f1.cumple(a) || f2.cumple(a);
	}

	public Filtro getF1() {
		return f1;
	}

	public void setF1(Filtro f1) {
		this.f1 = f1;
	}

	public Filtro getF2() {
		return f2;
	}

	public void setF2(Filtro f2) {
		this.f2 = f2;
	}
	
}
