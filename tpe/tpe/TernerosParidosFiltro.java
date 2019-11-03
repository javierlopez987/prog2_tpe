package tpe;

public class TernerosParidosFiltro implements Filtro {
	int ternerosParidos;
	
	public TernerosParidosFiltro(int t) {
		ternerosParidos = t;
	}

	@Override
	public boolean cumple(Animal a) {
		return a.getTernerosParidos() > getTernerosParidos();
	}

	public int getTernerosParidos() {
		return ternerosParidos;
	}

	public void setTernerosParidos(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
	}
	
}
