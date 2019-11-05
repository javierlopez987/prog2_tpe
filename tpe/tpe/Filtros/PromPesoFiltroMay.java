package tpe.Filtros;

import tpe.Composite.Animal;

public class PromPesoFiltroMay implements Filtro {
	int promPeso;
	
	public PromPesoFiltroMay(int p) {
		promPeso = p;
	}
	
	@Override
	public boolean cumple(Animal a) {
		return a.getPromPeso() > getPromPeso();
	}

	public int getPromPeso() {
		return promPeso;
	}

	public void setPromPeso(int promPeso) {
		this.promPeso = promPeso;
	}
	
}
