package tpe.Filtros;

import tpe.Composite.Animal;

public class PromEdadFiltroMay implements Filtro {
	int promEdad;
	
	public PromEdadFiltroMay(int p) {
		promEdad = p;
	}
	
	@Override
	public boolean cumple(Animal a) {
		return a.getPromEdad() > getPromEdad();
	}

	public int getPromEdad() {
		return promEdad;
	}

	public void setPromEdad(int promEdad) {
		this.promEdad = promEdad;
	}
	
}
