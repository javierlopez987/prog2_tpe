package tpe.Filtros;

import tpe.Composite.GrupoGanadero;

public class PromEdadFiltroMay implements FiltroGrupal {
	int promEdad;
	
	public PromEdadFiltroMay(int p) {
		promEdad = p;
	}
	
	@Override
	public boolean cumple(GrupoGanadero g) {
		return g.getPromEdad() > this.getPromEdad();
	}

	public int getPromEdad() {
		return promEdad;
	}

	public void setPromEdad(int promEdad) {
		this.promEdad = promEdad;
	}
	
}
