package tpe.Filtros;

import tpe.Composite.GrupoGanadero;

public class OrFiltroGrupal implements FiltroGrupal{
	FiltroGrupal f1;
	FiltroGrupal f2;
	
	public OrFiltroGrupal(FiltroGrupal f1, FiltroGrupal f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	public FiltroGrupal getF1() {
		return f1;
	}

	public void setF1(FiltroGrupal f1) {
		this.f1 = f1;
	}

	public FiltroGrupal getF2() {
		return f2;
	}

	public void setF2(FiltroGrupal f2) {
		this.f2 = f2;
	}

	@Override
	public boolean cumple(GrupoGanadero g) {
		// TODO Auto-generated method stub
		return f1.cumple(g) || f2.cumple(g);
	}
	
}
