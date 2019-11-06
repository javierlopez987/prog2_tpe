package tpe.Filtros;

import tpe.Composite.GrupoGanadero;

public class PromPesoFiltroMay implements FiltroGrupal {
	int promPeso;
	
	public PromPesoFiltroMay(int p) {
		promPeso = p;
	}
	
	@Override
	public boolean cumple(GrupoGanadero g) {
		return g.getPromPeso() > this.getPromPeso();
	}

	public int getPromPeso() {
		return promPeso;
	}

	public void setPromPeso(int promPeso) {
		this.promPeso = promPeso;
	}

	
}
