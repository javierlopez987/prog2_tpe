package tpe;

public class PesoFiltroMay implements Filtro{
	int peso;
	
	public PesoFiltroMay(int p) {
		peso = p;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getPeso() > getPeso();
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
