package tpe.Filtros;

import tpe.Composite.Animal;

public class SexoFiltro implements Filtro {
	String sexo;
	
	public SexoFiltro(String s) {
		sexo = s;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getSexo().equals(getSexo());
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
